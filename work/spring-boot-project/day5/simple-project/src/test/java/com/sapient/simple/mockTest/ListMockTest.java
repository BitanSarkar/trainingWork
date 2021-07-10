package com.sapient.simple.mockTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ListMockTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	
	@Test
	void mockListWithException() {
		List<String> mockList = mock(List.class);
		
		when(mockList.get(anyInt())).thenThrow(new RuntimeException("Throwing mock exception"));
		Assertions.assertThrows(RuntimeException.class, () -> mockList.get(0));
	}
}
