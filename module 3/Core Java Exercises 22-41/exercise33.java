//Transaction Handling in JDBC
/*CREATE TABLE accounts (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    balance DOUBLE
);
INSERT INTO accounts (id, name, balance) VALUES (1, 'Alice', 1000.0);
INSERT INTO accounts (id, name, balance) VALUES (2, 'Bob', 500.0);

*/
import java.sql.*;

public class AccountDAO {
    private final String url = "jdbc:mysql://localhost:3306/your_database";
    private final String username = "your_username";
    private final String password = "your_password";
    public void transferMoney(int fromAccountId, int toAccountId, double amount) {
        String debitSQL = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String creditSQL = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false); // Start transaction
            try (PreparedStatement debitStmt = conn.prepareStatement(debitSQL);
                 PreparedStatement creditStmt = conn.prepareStatement(creditSQL)) {
                // Debit from sender
                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromAccountId);
                int rowsDebited = debitStmt.executeUpdate();
                // Credit to receiver
                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toAccountId);
                int rowsCredited = creditStmt.executeUpdate();

                if (rowsDebited == 1 && rowsCredited == 1) {
                    conn.commit(); // All good – commit transaction
                    System.out.println("Transfer successful. Amount: " + amount);
                } else {
                    conn.rollback(); // Something went wrong
                    System.out.println("Transfer failed – transaction rolled back.");
                }
            } catch (SQLException ex) {
                conn.rollback(); // Rollback on exception
                System.out.println("Exception occurred – transaction rolled back.");
                ex.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.setAutoCommit(true); // Reset auto-commit
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        AccountDAO dao = new AccountDAO();

        // Simulate transfer of 200 from Alice (id=1) to Bob (id=2)
        dao.transferMoney(1, 2, 200.0);
    }
}

