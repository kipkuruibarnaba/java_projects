package databases;

import java.sql.*;

public class TestDatabase {
    public static final String DATABASE_NAME="javadb";
    public static final String DATABASE_USER="root";
    public static final String DATABASE_PASSWORD="";

    public static final String TABLE_NAME="contacts";
    public static final String URL="jdbc:mysql://localhost/"+DATABASE_NAME;
    public static final String COLUMN_NAME="name";
    public static final String COLUMN_PHONE="phone";
    public static final String COLUMN_EMAIL="email";
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/javadb";
            Connection conn = DriverManager.getConnection(URL, DATABASE_USER, DATABASE_PASSWORD);
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("DROP TABLE IF EXISTS "+TABLE_NAME);
            statement.execute("CREATE TABLE IF NOT EXISTS "+
                                   " "+TABLE_NAME+"("+COLUMN_NAME+" TEXT,"+COLUMN_PHONE+" INTEGER,"+COLUMN_EMAIL+" TEXT)");
            statement.execute("INSERT INTO "+TABLE_NAME+" ("+COLUMN_NAME+","+COLUMN_PHONE+","+COLUMN_EMAIL+") "+
                                  "VALUES('Mike',465454,'mike@gmail.com')");
            statement.execute("INSERT INTO "+TABLE_NAME+" ("+COLUMN_NAME+","+COLUMN_PHONE+","+COLUMN_EMAIL+") "+
                    "VALUES('James',846544,'james@gmail.com')");
            statement.execute("INSERT INTO "+TABLE_NAME+" ("+COLUMN_NAME+","+COLUMN_PHONE+","+COLUMN_EMAIL+") "+
                    "VALUES('Harry',86454,'harry@gmail.com')");
            statement.execute("INSERT INTO "+TABLE_NAME+" ("+COLUMN_NAME+","+COLUMN_PHONE+","+COLUMN_EMAIL+") "+
                    "VALUES('Caro',98464,'caro@gmail.com')");
            statement.execute("UPDATE "+TABLE_NAME+" SET "+COLUMN_PHONE+"=12345 where "+COLUMN_NAME+"='James'");
            statement.execute("DELETE from "+TABLE_NAME+" where "+COLUMN_NAME+"='Caro'");
//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
            ResultSet results= statement.executeQuery("SELECT * FROM "+TABLE_NAME+"");
            while (results.next()){
                System.out.println(results.getString(COLUMN_NAME)+ " "+
                        results.getInt(COLUMN_PHONE) +" "+ results.getString(COLUMN_EMAIL));
            }
            results.close();
            statement.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
