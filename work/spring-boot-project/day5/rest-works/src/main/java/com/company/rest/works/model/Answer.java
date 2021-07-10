package com.company.rest.works.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Answer {

	private Integer ansId;
	private Integer ansUserId;
	private String ansBody;
}
