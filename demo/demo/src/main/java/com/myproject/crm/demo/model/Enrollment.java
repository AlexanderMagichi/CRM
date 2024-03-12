package com.myproject.crm.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "enrollments")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrollmentID;

    @Column(name = "enrollment_date", nullable = false)
    private Date enrollmentDate;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "courseID", nullable = false)
    private Course course;
}
