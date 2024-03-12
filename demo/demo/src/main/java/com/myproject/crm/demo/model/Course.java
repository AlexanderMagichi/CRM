package com.myproject.crm.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseID;

    @Column(name = "course_name", nullable = false)
    private String courseName;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "courses")
    private Set<Enrollment> enrollments;


}
