package com.ajay.dao;

import java.sql.SQLException;
import java.util.List;

import com.ajay.model.Student;


public interface StudentDAO {
    int insertStudent(Student student) throws SQLException;
    List<Student> getAllStudents() throws SQLException;
    Student getStudentById(int id) throws SQLException;
    int updateStudent(Student student) throws SQLException;
    int deleteStudent(int id) throws SQLException;
}
