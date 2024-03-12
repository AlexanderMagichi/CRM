package com.myproject.crm.demo.model;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;

import javax.persistence.*;
import java.util.Set;

@Data
@SpringBootConfiguration
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @ManyToMany
    @JoinTable(
            name = "user_enrollments",
            joinColumns = @JoinColumn(name = "userID"),
            inverseJoinColumns = @JoinColumn(name = "enrollmentID"))
    private Set<Enrollment> enrollments;


}
