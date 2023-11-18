package databases.exercise1;

import databases.exercise1.model.Album;
import databases.exercise1.model.Artist;
import databases.exercise1.model.Datasource;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }
        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_ASC);
        if(artists == null) {
            System.out.println("No artists!");
            return;
        }
        for(Artist artist : artists) {
//            System.out.println(artist.getName());
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        List<String> albums = datasource.queryAlbumsForArtist("Alysa Medhurst I",Datasource.ORDER_BY_ASC);
        if(albums == null) {
            System.out.println("No albums!");
            return;
        }
        System.out.println("............The albums are..............");
        for(String album : albums) {
            System.out.println(album);
//            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }
        datasource.close();
    }
}
