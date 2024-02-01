package model;

import javax.persistence.*;

@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lessonID;

    @ManyToOne
    @JoinColumn(name = "courseID")
    private Course course;

    private String lessonName;
    private String lessonContent;

}
