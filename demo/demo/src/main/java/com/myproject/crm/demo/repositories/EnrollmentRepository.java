package com.myproject.crm.demo.repositories;

import com.myproject.crm.demo.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
