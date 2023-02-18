package com.learningmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {

        private String name;

        private String description;

        private int[] teachers;

        private int[] students;
}
