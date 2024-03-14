package com.myproject.crm.demo.repositories;

import com.myproject.crm.demo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
