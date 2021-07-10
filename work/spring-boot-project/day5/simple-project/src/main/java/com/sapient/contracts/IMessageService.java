package com.sapient.contracts;

import java.util.List;

public interface IMessageService {

	List<String> getMessage(String user);
	
	List<String> deleteMessageFromUser(String user); 
}
