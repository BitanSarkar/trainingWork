package com.company.rest.works.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
	
	@Id
	private Integer id;
	
	private String quesBody;
	private int userId;
	private boolean status;
	private List<Answer> answers;

}
