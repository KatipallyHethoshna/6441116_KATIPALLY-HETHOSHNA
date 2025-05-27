import java.sql.*;

public class Exercise33_TransactionHandling {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:bank.db")) {
            conn.setAutoCommit(false);
            try (PreparedStatement debit = conn
                    .prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                    PreparedStatement credit = conn
                            .prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {

                debit.setDouble(1, 100);
                debit.setInt(2, 1);
                debit.executeUpdate();

                credit.setDouble(1, 100);
                credit.setInt(2, 2);
                credit.executeUpdate();

                conn.commit();
                System.out.println("Transaction successful");
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transaction failed and rolled back");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
