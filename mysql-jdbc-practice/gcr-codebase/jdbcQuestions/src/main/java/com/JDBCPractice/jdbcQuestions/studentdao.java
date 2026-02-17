package com.JDBCPractice.jdbcQuestions;


import java.sql.*;

public class studentdao {

    // CREATE
    public void insertStudent(String name, String email, int age, String grade, String date) {

        String sql = "INSERT INTO students (name, email, age, grade, enrollment_date) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, age);
            ps.setString(4, grade);
            ps.setDate(5, Date.valueOf(date));

            ps.executeUpdate();
            System.out.println("✅ Student Inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ
    public void fetchStudents() {

        String sql = "SELECT * FROM students";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n📋 Student Records:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("email") + " | " +
                        rs.getInt("age") + " | " +
                        rs.getString("grade") + " | " +
                        rs.getDate("enrollment_date")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateStudent(int id, String newGrade) {

        String sql = "UPDATE students SET grade=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, newGrade);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            System.out.println("✅ " + rows + " Student Updated");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteStudent(int id) {

        String sql = "DELETE FROM students WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            System.out.println("✅ " + rows + " Student Deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
