package databases.exercise1.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {

    public static final String DB_NAME = "seeddb";
    public static final String DATABASE_USER="root";
    public static final String DATABASE_PASSWORD="";
    public static final String CONNECTION_STRING="jdbc:mysql://localhost/"+DB_NAME;
    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artistId";
    public static final int INDEX_ALBUM_ID =1;
    public static final int INDEX_ALBUM_NAME =2;
    public static final int INDEX_ALBUM_ARTIST =3;

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "id";
    public static final String COLUMN_ARTIST_NAME = "name";
    public static final int INDEX_ARTIST_ID =1;
    public static final int INDEX_ARTIST_NAME =2;

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_ID = "ID";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "albumId";
    public static final int INDEX_SONGS_ID =1;
    public static final int INDEX_SONGS_TRACK =2;
    public static final int INDEX_SONGS_TITLE =3;
    public static final int INDEX_SONGS_ALBUM =4;

    public static final int ORDER_BY_NONE=1;
    public static final int ORDER_BY_ASC=2;
    public static final int ORDER_BY_DESC=3;


    private Connection conn;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING, DATABASE_USER, DATABASE_PASSWORD);
            return true;
        } catch(SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
            return false;
        }
    }

    public void close() {
        try {
            if(conn != null) {
                conn.close();
            }
        } catch(SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }

    public List<Artist> queryArtists(int sortBy) {
        StringBuilder sb = new StringBuilder("SELECT * FROM ");
        sb.append(TABLE_ARTISTS);
        if(sortBy !=ORDER_BY_NONE){
            sb.append(" ORDER BY ");
            sb.append(COLUMN_ARTIST_NAME);
//            sb.append(" COLLATE NOCASE ");
        }
        if(sortBy == ORDER_BY_DESC){
            sb.append(" DESC ");
        }else {
            sb.append(" ASC ");
        }
        try(Statement statement = conn.createStatement();
//            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_ARTISTS))
            ResultSet results = statement.executeQuery(sb.toString())) {

            List<Artist> artists = new ArrayList<>();
            while(results.next()) {
                Artist artist = new Artist();
                artist.setId(results.getInt(INDEX_ARTIST_ID));
                artist.setName(results.getString(INDEX_ARTIST_NAME));
                artists.add(artist);
            }

            return artists;

        } catch(SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }

    }
    public List<String> queryAlbumsForArtist(String artistName,int sortBy){
       StringBuilder sb =new StringBuilder("SELECT ");
//        SELECT albums.name FROM albums INNER JOIN artists ON albums.artistId =
//                artists.id where artists.name='Ricky Monahan' ORDER BY albums.name ASC
        sb.append(TABLE_ALBUMS);
        sb.append('.');
        sb.append(COLUMN_ALBUM_NAME);
        sb.append(" FROM ");
        sb.append(TABLE_ALBUMS);
        sb.append(" INNER JOIN ");
        sb.append(TABLE_ARTISTS);
        sb.append(" ON ");
        sb.append(TABLE_ALBUMS);
        sb.append('.');
        sb.append(COLUMN_ALBUM_ARTIST);
        sb.append(" = ");
        sb.append(TABLE_ARTISTS);
        sb.append('.');
        sb.append(COLUMN_ARTIST_ID);
        sb.append(" WHERE ");
        sb.append(TABLE_ARTISTS);
        sb.append('.');
        sb.append(COLUMN_ARTIST_NAME);
        sb.append(" = \"");
        sb.append(artistName);
        sb.append("\"");
        if(sortBy !=ORDER_BY_NONE){
            sb.append(" ORDER BY ");
            sb.append(TABLE_ALBUMS);
            sb.append('.');
            sb.append(COLUMN_ALBUM_NAME);
        }
        if(sortBy == ORDER_BY_DESC){
            sb.append(" DESC ");
        }else {
            sb.append(" ASC ");
        }
         System.out.println("SQL statement = : "+ sb.toString());
        try(Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery(sb.toString())){
            List<String> albums = new ArrayList<>();
            while (results.next()){
                albums.add(results.getString(1));
            }
            return albums;

        } catch (SQLException e) {
            System.out.println("Query failed : "+e.getMessage());
           return null;
        }
    }
}
