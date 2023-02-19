package com.learningmanagementsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String name;

    private String email;

    @OneToMany(mappedBy = "student")
    private Set<Course> courses;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;


//    @ManyToOne
//    @JoinColumn(name = "course_course_id")
//    private Course course;

}