//Basic JDBC Connection
/* CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    age INT
);

INSERT INTO students (name, email, age) VALUES 
('Alice', 'alice@example.com', 20),
('Bob', 'bob@example.com', 22);
*/
import java.sql.*;
public class MySQLJDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connect to database
            Connection conn = DriverManager.getConnection(url, username, password);
            // Execute SELECT query
            String query = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("------------------------");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
