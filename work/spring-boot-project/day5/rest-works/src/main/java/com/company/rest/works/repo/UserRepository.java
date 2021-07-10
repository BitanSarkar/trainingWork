package com.company.rest.works.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.company.rest.works.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

	public List<User> findByName(String name);
	
	@Query(value = "{'income': {$gt:?0}}", fields = "{'name':1, 'income':1, _id:0}", sort = "{'income':1}")
	public List<User> findByIncome(double income);
}
