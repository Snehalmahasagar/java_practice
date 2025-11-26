package StudentManagement;

import java.sql.*;

public class EnrollmentService {

    public void enrollStudent(int studentId, int courseId) {
        String query = "INSERT INTO enrollments (student_id, course_id) VALUES (?, ?)";

        try (Connection con = Database.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, studentId);
            ps.setInt(2, courseId);
            ps.executeUpdate();

            System.out.println("Student enrolled successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewEnrollments() {
        String query = """
                SELECT e.id, s.name AS student, c.name AS course
                FROM enrollments e
                JOIN students s ON e.student_id = s.id
                JOIN courses c ON e.course_id = c.id
                """;

        try (Connection con = Database.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            System.out.println("\n--- Enrollment List ---");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                        rs.getString("student") + " -> " +
                        rs.getString("course"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

