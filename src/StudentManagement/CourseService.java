package StudentManagement;

import java.sql.*;

public class CourseService {

    public void addCourse(String name, String instructor) {
        String query = "INSERT INTO courses (name, instructor) VALUES (?, ?)";

        try (Connection con = Database.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setString(2, instructor);
            ps.executeUpdate();

            System.out.println("Course added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllCourses() {
        String query = "SELECT * FROM courses";

        try (Connection con = Database.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            System.out.println("\n--- Course List ---");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("instructor"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
