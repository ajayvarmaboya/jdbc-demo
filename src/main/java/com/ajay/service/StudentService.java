package com.ajay.service;

import java.sql.SQLException;
import java.util.List;

import com.ajay.model.Student;

public interface StudentService {

    int addStudent(Student student) throws SQLException;

    Student getStudentById(int courseId) throws SQLException;

    List<Student> getAllStudents() throws SQLException;

    int updateStudent(Student student) throws SQLException;

    int deleteStudent(int courseId) throws SQLException;
}