
package jdbcexample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudents {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "kavya2004";

        String sql = "INSERT INTO student (id, name, city) VALUES (?, ?, ?)";

        try {
            Connection con = DriverManager.getConnection(
                    url, username, password);

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 1);
            ps.setString(2, "Rahul");
            ps.setString(3, "Bengaluru");
            ps.executeUpdate();

            ps.setInt(1, 2);
            ps.setString(2, "Priya");
            ps.setString(3, "Andra");
            ps.executeUpdate();

            ps.setInt(1, 3);
            ps.setString(2, "Amit");
            ps.setString(3, "Delhi");
            ps.executeUpdate();

            ps.setInt(1, 4);
            ps.setString(2, "Sneha");
            ps.setString(3, "Chennai");
            ps.executeUpdate();

            ps.setInt(1, 5);
            ps.setString(2, "Arjun");
            ps.setString(3, "Pune");
            ps.executeUpdate();

            System.out.println("5 Records Inserted Successfully");

            ps.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}