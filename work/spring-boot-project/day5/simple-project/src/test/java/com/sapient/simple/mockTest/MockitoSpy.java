package com.sapient.simple.mockTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MockitoSpy {

	@Test
	void spyArrayList() {
		ArrayList demoArray = spy(ArrayList.class);
		assertEquals(0, demoArray.size());
		
	}

}
