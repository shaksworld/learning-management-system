package com.learningmanagementsystem.repository;

import com.learningmanagementsystem.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
