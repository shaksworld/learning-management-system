package com.learningmanagementsystem.dto;

import com.learningmanagementsystem.model.Department;
import com.learningmanagementsystem.model.Student;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long studentId;
    private String name;
    private String email;
    private Department department;


    public static Student findStudentById(Long id) {
        return null;
    }


}
