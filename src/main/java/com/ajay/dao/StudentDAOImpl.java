package com.ajay.dao;
import com.ajay.model.Student;
import com.ajay.util.DBConnection;
import java.sql.*;
import java.util.*;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public int insertStudent(Student student) throws SQLException{

        Connection con=null;

        PreparedStatement ps=null;

        try{
             con=DBConnection.getConnection();

         ps=con.prepareStatement("insert into training values(?,?,?,?,?)");

        ps.setInt(1,student.getCourseId());

        ps.setString(2,student.getName());

        ps.setBoolean(3,student.isFee());

        ps.setString(4,student.getCourse());

        ps.setString(5,student.getCourseName());

        int rows=ps.executeUpdate();

        return rows;

        }
        finally{
            if(ps!=null)ps.close();
            if(con!=null)con.close();
        }
        
        

       

    }

    @Override
    public List<Student> getAllStudents() throws SQLException{

        String sql="select * from training";

        List<Student> students=new ArrayList<>();

        try(
            Connection con=DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery()
        ){
            while(rs.next()){
                Student student =new Student();

                student.setCourseId(rs.getInt("courseid"));
                student.setName(rs.getString("name"));
                student.setFee(rs.getBoolean("fee"));
                student.setCourse(rs.getString("course"));
                student.setCourseName(rs.getString("course_name"));

                students.add(student);

            }
        }
        catch(SQLException e){
            throw new RuntimeException("Error occurred while fetching all students", e);
        }
        return students;

        
        
        
    }

    @Override

    public Student getStudentById(int courseId)throws SQLException{

        String sql="select * from training where courseId=?";
        

        try (
                Connection con=DBConnection.getConnection();
                PreparedStatement ps=con.prepareStatement(sql);
        )
        {
            ps.setInt(1,courseId);

            try(ResultSet rs=ps.executeQuery()){

                if(rs.next()){

                    Student student =new Student();

                    student.setCourseId(rs.getInt("courseId"));
                    student.setName(rs.getString("name"));
                    student.setFee(rs.getBoolean("fee"));
                    student.setCourse(rs.getString("course"));
                    student.setCourseName(rs.getString("course_name"));

                    return student;
                }

            }
        }catch(SQLException e){
            throw new RuntimeException("Error occurred while fetching student by ID", e);

        }
        return null;
            
        
    }
    @Override
    public int updateStudent(Student student)throws SQLException{

        String sql="update training set name=?, fee=?, course=?, course_name=? where courseId=?";

        try(
            Connection con=DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
        )

        {
            ps.setString(1, student.getName());
ps.setBoolean(2, student.isFee());
ps.setString(3, student.getCourse());
ps.setString(4, student.getCourseName());
ps.setInt(5, student.getCourseId());

            int rowsAffected = ps.executeUpdate();
            return rowsAffected;
        }catch(SQLException e){
            throw new RuntimeException("Error occurred while updating student", e);
        }
    }

    @Override
    public int deleteStudent(int courseID)throws SQLException{
        String sql="delete from training where courseId=?";

        try(
            Connection con=DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
        ){
            ps.setInt(1,courseID);
            return ps.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException("Error occurred while deleting student", e);
        }
    }
}


