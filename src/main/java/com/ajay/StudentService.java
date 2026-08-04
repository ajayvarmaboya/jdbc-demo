package com.ajay;
import java.util.List;

import java.sql.SQLException;

public class StudentService {
    private StudentDAO dao=new StudentDAO();

    private void validateStudent(Student student) {
        if(student==null){
            throw new IllegalArgumentException("Student object is null");
        }
        if(student.getCourseId()<=0){
            throw new IllegalArgumentException("Course id is invalid");
        }
        if(student.getName()==null || student.getName().isEmpty()){
            throw new IllegalArgumentException("Student name is invalid");
        }
        if(student.getCourse()==null || student.getCourse().isEmpty()){
            throw new IllegalArgumentException("Course is invalid");
        }
        if(student.getCourseName()==null || student.getCourseName().isEmpty()){
            throw new IllegalArgumentException("Course name is invalid");
        }
    }

    public int addStudent(Student student)throws SQLException{
     
        validateStudent(student);
        return dao.insertStudent(student);
     
    }

    public Student getStudentById(int courseId) throws SQLException{
        if(courseId<=0){
            throw new IllegalArgumentException("Course id is invalid");
        }
        return dao.getStudentById(courseId);
    }

    public List<Student> getAllStudents()throws SQLException{
        validateStudent(null); // This will throw an exception if called with null
        return dao.getAllStudents();
        
    }

    public int updateStudent(Student student) throws SQLException {
        validateStudent(student);
        return dao.updateStudent(student);
    }

    public int deleteStudent(int courseId) throws SQLException {
        if(courseId<=0){
            throw new IllegalArgumentException("Course id is invalid");
        }
        return dao.deleteStudent(courseId);
    }
}
