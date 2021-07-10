package com.company.rest.works.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.company.rest.works.model.Question;

public interface QuestionRepository extends MongoRepository<Question, Integer> {
	
	public void deleteById(Integer id);
	
//	@Query(sort = "{'id':1}", fields= "{'id':1}")
//	public Integer getHighestId();
}
