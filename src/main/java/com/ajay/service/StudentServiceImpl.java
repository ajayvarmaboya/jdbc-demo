package com.ajay.service;
import java.util.List;

import com.ajay.model.Student;
import com.ajay.dao.StudentDAO;

import java.sql.SQLException;

public class StudentServiceImpl implements StudentService {
    private StudentDAO dao;

    public StudentServiceImpl(StudentDAO dao) {
        this.dao = dao;
    }

    private void validateStudent(Student student) {

    if(student == null){
        throw new IllegalArgumentException("Student object cannot be null.");
    }

    if(student.getCourseId() <= 0){
        throw new IllegalArgumentException("Course ID must be greater than zero.");
    }

    if(student.getName() == null || student.getName().isBlank()){
        throw new IllegalArgumentException("Student name cannot be null or blank.");
    }

    if(student.getCourse() == null || student.getCourse().isBlank()){
        throw new IllegalArgumentException("Course cannot be null or blank.");
    }

    if(student.getCourseName() == null || student.getCourseName().isBlank()){
        throw new IllegalArgumentException("Course name cannot be null or blank.");
    }
}
    
    @Override
    public int addStudent(Student student)throws SQLException{
     
        validateStudent(student);
        return dao.insertStudent(student);
     
    }

    @Override
    public Student getStudentById(int courseId) throws SQLException{
        if(courseId<=0){
            throw new IllegalArgumentException("Course id is invalid");
        }
        return dao.getStudentById(courseId);
    }
    @Override
    public List<Student> getAllStudents()throws SQLException{
         // This will throw an exception if called with null
        return dao.getAllStudents();
        
    }
    @Override
    public int updateStudent(Student student) throws SQLException {
        validateStudent(student);
        return dao.updateStudent(student);
    }
    @Override
    public int deleteStudent(int courseId) throws SQLException {
        if(courseId<=0){
            throw new IllegalArgumentException("Course id is invalid");
        }
        return dao.deleteStudent(courseId);
    }
}
