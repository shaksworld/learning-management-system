package com.learningmanagementsystem.services;

import com.learningmanagementsystem.dto.CourseDto;
import com.learningmanagementsystem.dto.TeacherDto;
import com.learningmanagementsystem.model.Teacher;
import com.learningmanagementsystem.repository.TeacherRepository;

public interface TeacherService {

        Teacher getAllTeachers();

        Teacher getTeacherById(Long id);

        Teacher createTeacher(TeacherDto teacherDto);

        void deleteTeacher(Long id);

        Teacher getCourseOfTeacher(CourseDto courseDto, Long id);


}
