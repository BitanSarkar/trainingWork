package com.sapient.userservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.userservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
