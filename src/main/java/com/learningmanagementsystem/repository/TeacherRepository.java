package com.learningmanagementsystem.repository;

import com.learningmanagementsystem.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

        Teacher findByEmail(String email);
}
