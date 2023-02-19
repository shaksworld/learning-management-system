package com.learningmanagementsystem.implementation;


import com.learningmanagementsystem.dto.StudentDto;
import com.learningmanagementsystem.model.Student;
import com.learningmanagementsystem.repository.CourseRepository;
import com.learningmanagementsystem.repository.StudentRepository;
import com.learningmanagementsystem.repository.UserRepository;
import com.learningmanagementsystem.services.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
@AllArgsConstructor
public class StudentImpl implements StudentService {

    StudentRepository studentRepository;

    CourseRepository courseRepository;

    UserRepository userRepository;


    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students.clear();
        studentRepository.findAll().forEach(student->{
            students.add(student);
        });

        log.info("Students: {}", students);
        return students;
    }

    @Override
    public Student getStudentById(Long id) {

        return StudentDto.findStudentById(id);
    }

    @Override
    public Student createStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setName(studentDto.getName());
        student.setEmail(studentDto.getEmail());
        student.setDepartment(studentDto.getDepartment());
        student.setCourses(Set.of(courseRepository.findById(studentDto.getStudentId()).get()));

        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student getCourseOfStudent(Long id) {
        Student student = studentRepository.findById(id).get();

        return student;
    }
}
