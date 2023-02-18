package com.learningmanagementsystem.implementation;

import com.learningmanagementsystem.dto.TeacherDto;
import com.learningmanagementsystem.model.Teacher;
import com.learningmanagementsystem.repository.TeacherRepository;
import com.learningmanagementsystem.services.TeacherService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class TeacherImpl implements TeacherService {

    private final TeacherRepository teacherRepository;


    @Override
    public Teacher getAllTeachers() {
        return null;
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return null;
    }

    @Override
    public Teacher createTeacher(TeacherDto teacherDto) {
        return null;
    }

    @Override
    public void deleteTeacher(Long id) {

    }

    @Override
    public Teacher updateTeacher(Long id, TeacherDto teacherDto) {
        return null;
    }
}
