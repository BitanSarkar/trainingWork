package com.sapient.userservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sapient.userservice.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	@Query(value = "SELECT * FROM users WHERE email=?1", nativeQuery = true)
	List<User> findIdByEmail(String email);
	
}
