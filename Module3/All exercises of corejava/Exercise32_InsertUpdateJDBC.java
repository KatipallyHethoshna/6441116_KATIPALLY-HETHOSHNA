import java.sql.*;

public class Exercise32_InsertUpdateJDBC {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:students.db")) {
            String insertSQL = "INSERT INTO students (id, name) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setInt(1, 1);
            pstmt.setString(2, "John Doe");
            pstmt.executeUpdate();

            String updateSQL = "UPDATE students SET name = ? WHERE id = ?";
            pstmt = conn.prepareStatement(updateSQL);
            pstmt.setString(1, "Jane Doe");
            pstmt.setInt(2, 1);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
