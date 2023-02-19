package com.learningmanagementsystem.services;

import com.learningmanagementsystem.dto.StudentDto;
import com.learningmanagementsystem.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student createStudent(StudentDto studentDto);

    void deleteStudent(Long id);

    Student getCourseOfStudent(Long id);
}
