//Basic JDBC Connection
import java.sql.*;

public class DBConnectionExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:school.db";

        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM learners")) {

            System.out.println("Learner List:");
            while (resultSet.next()) {
                int learnerId = resultSet.getInt("learner_id");
                String fullName = resultSet.getString("full_name");
                System.out.println(learnerId + " - " + fullName);
            }

        } catch (SQLException ex) {
            System.out.println("Connection or query failed.");
            ex.printStackTrace();
        }
    }
}