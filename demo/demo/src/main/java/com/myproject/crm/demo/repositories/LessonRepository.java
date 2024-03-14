package com.myproject.crm.demo.repositories;

import com.myproject.crm.demo.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
