package com.learningmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

    private String name;

    private String description;

    private int[] courses;

    private int[] teachers;

    private int[] students;
}
