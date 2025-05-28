//Insert and Update Operations in JDBC
/*CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    age INT
);
*/

public class Student {
    private int id;
    private String name;
    private String email;
    private int age;

    // Constructors
    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Student(int id, String name, String email, int age) {
        this(name, email, age);
        this.id = id;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
}

import java.sql.*;
public class StudentDAO {
    private final String url = "jdbc:mysql://localhost:3306/your_database";
    private final String username = "your_username";
    private final String password = "your_password";
    public void insertStudent(Student student) {
        String sql = "INSERT INTO students (name, email, age) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, student.getName());
            stmt.setString(2, student.getEmail());
            stmt.setInt(3, student.getAge());

            int rowsInserted = stmt.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateStudent(Student student) {
        String sql = "UPDATE students SET name = ?, email = ?, age = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, student.getName());
            stmt.setString(2, student.getEmail());
            stmt.setInt(3, student.getAge());
            stmt.setInt(4, student.getId());

            int rowsUpdated = stmt.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
