package com.sapient.services;

import java.util.ArrayList;
import java.util.List;

import com.sapient.contracts.IMessageService;

public class MessageService {

	private IMessageService messageService;
	
	public MessageService(IMessageService mesServ) {
		this.messageService = mesServ;
	}
	
	public List<String> getMessagesFromUser(String user){
		List<String> filteredMessages = new ArrayList<>();
		
		List<String> messages = messageService.getMessage(user);
		
		for(String mes : messages) {
			if(mes.contains(user)) {
				filteredMessages.add(mes);
			}
		}
		
		return filteredMessages;
	}

	public boolean deleteUserMessage(String user) {
		List<String> messages = messageService.deleteMessageFromUser(user);
		for(String mes : messages) {
			if(mes.contains(user)) {
				return false;
			}
		}
		
		return true;
	}
}
