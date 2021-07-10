package com.company.rest.works.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.company.rest.works.model.Answer;
import com.company.rest.works.model.Question;
import com.company.rest.works.model.User;
import com.company.rest.works.repo.QuestionRepository;
import com.company.rest.works.repo.UserRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = {UserRepository.class, QuestionRepository.class})
public class MongoConfig {

//	@Bean
//	public CommandLineRunner comRunner(UserRepository userRepo) {
//		return string -> userRepo.insert(new User(102, "Joey", 10000.00, new Date()));
//				
//	}
	
//	@Bean
//	public CommandLineRunner comRunner(QuestionRepository queRepo) {
//		return string -> queRepo.insert(new Question(51, "What day is it today?", 101, true, 
//					Arrays.asList(new Answer(61, 102, "Monday"), new Answer(62, 109, "Thursday"))
//				));
//				
//	}
}
