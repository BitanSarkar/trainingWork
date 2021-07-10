package com.sapient.simple.mockTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import com.sapient.contracts.IMessageService;
import com.sapient.services.MessageService;
import com.sapient.stub.MessageStub;

class MessageUnitStubTest {

	@Test
	void testMessageServiceStubWithoutMocking() {
		IMessageService messageStub = new MessageStub();
		MessageService messageServ = new MessageService(messageStub);
		
		List<String> messageFromUser = messageServ.getMessagesFromUser("Harry");
		
		assertEquals(2, messageFromUser.size());
	}
	
	@Test
	void testMessageServiceStubMock() {
		IMessageService messageStub = mock(IMessageService.class);
		
		List<String> mockMessage = Arrays.asList("Harry how are you", "I hope you are good Harry");
		
		when(messageStub.getMessage("Harry")).thenReturn(mockMessage);
		
		MessageService messageServiceImpl = new MessageService(messageStub); 
		List<String> messageFromUser = messageServiceImpl.getMessagesFromUser("Harry");
		assertEquals(2, messageFromUser.size());
	}
	
	@Test
	@DisplayName("message Service Spy Test")
	void messageServiceSpyTest() {
		
		IMessageService messageServiceSpy
			= spy(IMessageService.class); 
		
		ArrayList<String> messages = spy(ArrayList.class);
		
		messages.add("harry how are you");
		messages.add("i know harry you inside"); 
		messages.add("peter come outside"); 
		
		
		when(messageServiceSpy.getMessage("harry")).
			thenReturn(messages); 
		
		 MessageService messageServiceImpl = new MessageService(messageServiceSpy);
		 List<String> messageFromUser = messageServiceImpl.getMessagesFromUser("harry"); 
		
		 assertEquals(2, messageFromUser.size());
	}
	
	/*----------------------------------------------------------------------------------------------*/
	
	@Test
	@DisplayName("Delete message from User using Mock")
	void testDeleteUserMessageMock() {
		IMessageService messageStub = mock(IMessageService.class);
		
		List<String> mockMessage = Arrays.asList("peter come outside");
		
		when(messageStub.deleteMessageFromUser("Harry")).thenReturn(mockMessage);
		
		MessageService messageServiceImpl = new MessageService(messageStub); 
		assertTrue(messageServiceImpl.deleteUserMessage("Harry"));
	}

	@Test
	@DisplayName("Delete message from User using Mock")
	void messageServiceDeleteFromUserSpyTest() {
		
		IMessageService messageServiceSpy
			= spy(IMessageService.class); 
		
		ArrayList<String> messages = spy(ArrayList.class);
		
		messages.add("harry how are you");
		messages.add("i know harry you inside"); 
		messages.add("peter come outside"); 
		
//		messages.removeIf(s -> s.contains("harry"));
		
		when(messageServiceSpy.deleteMessageFromUser("harry")).
			thenReturn(messages); 
		
		 MessageService messageServiceImpl = new MessageService(messageServiceSpy);		
		 assertFalse(messageServiceImpl.deleteUserMessage("harry"));
	}
}
