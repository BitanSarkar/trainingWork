package com.sapient.stub;

import java.util.Arrays;
import java.util.List;

import com.sapient.contracts.IMessageService;

public class MessageStub implements IMessageService{

	@Override
	public List<String> getMessage(String user) {
		
		return Arrays.asList("Harry how are you", "I hope you are good Harry");
	}

	@Override
	public List<String> deleteMessageFromUser(String user) {
		List<String> messages = Arrays.asList("Harry how are you", "I hope you are good Harry", "peter come outside");
		messages.removeIf(s -> s.contains(user));
		return messages;
	}

}
