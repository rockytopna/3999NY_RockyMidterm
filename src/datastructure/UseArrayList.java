package datastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args) throws SQLException {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        //ArrayList<String> studentName = new

        String url = "jdbc:mysql://localhost:3306/pnt?serverTimezone=UTC";

        String user = "root";
        String password = "root1234";
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            String query = "insert into student ( id,name,email,age) values ('44465NY', 'Eric Topna', 'rftgrictopna@gamil.com',33);";
            String query1 = "insert into student ( id,name,email,age) values ('4468NY', ' Prodip Bhumik', 'erictopna@gamil.com',33);";
            statement.execute(query);
            statement.execute(query1);

        } catch (SQLException ex) {
            ex.printStackTrace();


        } finally {

            connection.close();
            ;
            statement.close();


        }

    }

}