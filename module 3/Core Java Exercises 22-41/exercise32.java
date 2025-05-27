//Insert and Update Operations in JDBC
import java.sql.*;
public class LearnerRepository {
    private Connection dbConn;
    public LearnerRepository() throws SQLException {
        dbConn = DriverManager.getConnection("jdbc:sqlite:school.db");
    }

    public void addLearner(int learnerId, String fullName) throws SQLException {
        String sql = "INSERT INTO learners (learner_id, full_name) VALUES (?, ?)";
        try (PreparedStatement pstmt = dbConn.prepareStatement(sql)) {
            pstmt.setInt(1, learnerId);
            pstmt.setString(2, fullName);
            pstmt.executeUpdate();
        }
    }

    public void renameLearner(int learnerId, String newName) throws SQLException {
        String sql = "UPDATE learners SET full_name = ? WHERE learner_id = ?";
        try (PreparedStatement pstmt = dbConn.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, learnerId);
            pstmt.executeUpdate();
        }
    }
}