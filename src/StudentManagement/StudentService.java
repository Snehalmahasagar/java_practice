package StudentManagement;

import java.sql.*;
import java.util.*;

public class StudentService {

    public void addStudent(String name, String email) {
        String query = "INSERT INTO students (name, email) VALUES (?, ?)";

        try (Connection con = Database.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.executeUpdate();

            System.out.println("Student added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllStudents() {
        String query = "SELECT * FROM students";

        try (Connection con = Database.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            System.out.println("\n--- Student List ---");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
