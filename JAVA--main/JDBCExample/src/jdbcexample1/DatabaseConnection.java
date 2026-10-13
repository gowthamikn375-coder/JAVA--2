
package jdbcexample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "kavya2004";

        try {
            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("Database Connected Successfully");

            con.close();

        } catch (SQLException e) {

            System.out.println("Database Connection Failed");
            System.out.println(e.getMessage());

        }
    }
}