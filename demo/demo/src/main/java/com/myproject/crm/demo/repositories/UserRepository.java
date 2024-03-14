package com.myproject.crm.demo.repositories;

import com.myproject.crm.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
