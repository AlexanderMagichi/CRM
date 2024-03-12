package com.myproject.crm.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "lessons")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lessonID;

    @ManyToOne
    @JoinColumn(name = "courseID", nullable = false)
    private Course course;

    @Column(name = "lesson_name", nullable = false)
    private String lessonName;

    @Column(name = "lesson_content")
    private String lessonContent;

}
