//package com.company.rest.works.resources;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.company.rest.works.model.Question;
//import com.company.rest.works.services.QuestionServices;
//
//@RestController
//public class QuestionResource {
//
//	@Autowired
//	private QuestionServices queSer;
//	
//	@GetMapping("/questions")
//	public List<Question> getAllQuestions(){
//		return queSer.getAllQuestions();
//	}
//	
//	@GetMapping(value = "/question")
//	public @ResponseBody Question getQuestionById(@RequestParam("quesId") Integer quesId ) {
//		return queSer.getQuestionById(quesId);
//	}
//	
//	
//	@PostMapping(value = "/questionInsert")
//	public @ResponseBody Question insertQuestion(@RequestBody Question question) {
//		return queSer.addQuestion(question);
//	}
//	
//	@PutMapping(value = "/questionUpdate")
//	public @ResponseBody Question updateQuestion(@RequestBody Question question) {
//		return queSer.updateQuestion(question);
//	}
//	
//	@GetMapping("/questionDelete")
//	public boolean deleteQuestion(@RequestBody Question question) {
//		queSer.deleteQuestion(question);
//		if(queSer.getQuestionById(question.getId()) != null){
//			return false;
//		}else { 
//			return true;
//		}
//	}
//	
//	@GetMapping("/questionDeleteById")
//	public boolean deleteQuestionById(@RequestParam("quesId") Integer quesId) {
//		queSer.deleteQuestionById(quesId);;
//		if(queSer.getQuestionById(quesId) != null){
//			return false;
//		}else { 
//			return true;
//		}
//	}
//}
