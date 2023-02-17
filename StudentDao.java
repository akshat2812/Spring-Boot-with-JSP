package student_info.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import student_info.model.Student;

public class StudentDao {
	public int registerStudent(Student student) throws ClassNotFoundException{
		int result=0;
		String sql="INSERT INTO student_info VALUES (?,?,?,?,?,?)";
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","Narutocr7@28");
			PreparedStatement preparedstatement=connection.prepareStatement(sql)){
			preparedstatement.setString(1, student.getId());
			preparedstatement.setString(2, student.getName());
			preparedstatement.setString(3, student.getSemester());
			preparedstatement.setString(4, student.getEnglish());
			preparedstatement.setString(5, student.getMaths());
			preparedstatement.setString(6, student.getScience());
			
			System.out.println(preparedstatement);
			result=preparedstatement.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
}	
