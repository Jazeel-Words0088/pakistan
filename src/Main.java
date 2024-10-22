import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            // Code that might throw SQLException
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "8182");
            // Your database logic here
        } catch (SQLException e) {
            // Handle the exception
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
