package com.company.rest.works.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	private Integer id;
	private String name;
	private double income;
	private Date dob;
}
