package databases;

import java.sql.*;

public class TestDatabase {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/javadb";
            Connection conn = DriverManager.getConnection(url, "root", "");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
//            statement.execute("CREATE TABLE IF NOT EXISTS "+
//                                   " contacts(name TEXT,phone INTEGER,email TEXT)");
//            statement.execute("INSERT INTO contacts (name,phone,email) "+
//                                  "VALUES('Barn',62565612,'barn@gmail.com')");
//            statement.execute("UPDATE contacts SET phone=12345 where name='mike'");
//            statement.execute("DELETE from contacts where name='Barn'");
            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()){
                System.out.println(results.getString("name")+ " "+
                        results.getInt("phone") +" "+ results.getString("email"));
            }
            results.close();
            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
