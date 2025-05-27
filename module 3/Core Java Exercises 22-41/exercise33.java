//Transaction Handling in JDBC
import java.sql.*;
public class WalletTransfer {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:finance.db";
        try (Connection db = DriverManager.getConnection(url)) {
            db.setAutoCommit(false);
            try (Statement stmt = db.createStatement()) {
                stmt.executeUpdate("UPDATE wallets SET funds = funds - 200 WHERE wallet_id = 101");
                stmt.executeUpdate("UPDATE wallets SET funds = funds + 200 WHERE wallet_id = 202");
                db.commit();
                System.out.println("Transfer completed successfully.");
            } catch (SQLException innerEx) {
                db.rollback();
                System.out.println("Transfer rolled back due to error: " + innerEx.getMessage());
            }

        } catch (SQLException ex) {
            System.out.println("Database connection issue: " + ex.getMessage());
        }
    }
}
