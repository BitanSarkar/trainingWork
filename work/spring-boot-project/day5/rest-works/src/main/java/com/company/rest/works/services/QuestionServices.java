package com.company.rest.works.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.company.rest.works.model.Question;
import com.company.rest.works.repo.QuestionRepository;

@Service
@Component
public class QuestionServices {
	
	@Autowired
	private QuestionRepository queRepo;
	
	//read
	public List<Question> getAllQuestions(){
		return queRepo.findAll();
	}
	
	public Question getQuestionById(Integer quesId) {
		Optional<Question> queById = queRepo.findById(quesId);
		if (queById.isPresent()) {
			return queById.get();
		}
		return null; 
	}
	
	//create
	public Question addQuestion(Question que) {
		return queRepo.insert(que);
	}
	
	//update
	public Question updateQuestion(Question que) {
		return queRepo.save(que);
	}
		
	//delete
	public void deleteQuestion(Question que) {
		queRepo.delete(que);
	}
	
	public void deleteQuestionById(Integer id) {
		queRepo.deleteById(id);
	}

}
