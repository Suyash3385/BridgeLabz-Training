package com.JDBCPractice.jdbcQuestions;
import java.sql.*;
public class StudentApp {
	private static final String url="jdbc:mysql://localhost:3306/student_db";
	private static final String username="root";
	private static final String password="root@123";
	
	//connection
	public static Connection getConnection()throws SQLException{
		return DriverManager.getConnection(url,username,password);
		
	}
	//insert 
	public static void insert(String name,String email,int age,String grade) {
		String sql="INSERT INTO students(name,email,age,grade, enrollment_date)VALUES(?,?,?,?,?)";
		try(Connection conn=getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql)){
				 pstmt.setString(1, name);
				pstmt.setString(2, email);
				pstmt.setInt(3, age);
				pstmt.setString(4, grade);
				pstmt.setDate(5, new java.sql.Date(System.currentTimeMillis()));
				
				int rows=pstmt.executeUpdate();
				System.out.println(rows+ "inserted");
		}
		catch (SQLException e) {
			System.out.println("insert failed");
			e.printStackTrace();
		}
						
		
	}

    // SELECT ALL
    public static void getAllStudents() {

        String sql = "SELECT * FROM students";

        try (Connection conn=getConnection();
             Statement stmt=conn.createStatement();
             ResultSet rs=stmt.executeQuery(sql)) {

            System.out.println("\nID\tName\t\tEmail\t\tAge\tGrade");

            while (rs.next()) {
                System.out.printf("%d\t%s\t%s\t%d\t%s%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("grade"));
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // SELECT BY ID
    public static void getStudentById(int id) {

        String sql = "SELECT * FROM students WHERE id = ?";

        try (Connection conn=getConnection();
             PreparedStatement pstmt=conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Grade: " + rs.getString("grade"));
            } 
            else {
                System.out.println("\nStudent not found!");
            }

        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        insert("John Doe", "john@email.com", 20, "A");
        insert("Jane Smith", "jane@email.com", 22, "B");

        getAllStudents();
        getStudentById(1);
    }
}


