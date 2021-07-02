package juint;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.sapient.juint.App;

public class AppTest {

	App ob;
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Before class");
	}
	
	@Before
	public void setUp() {
		ob = new App();
		System.out.println("Before a test case");
	}
	
	@After
	public void tearDown() {
		ob = null;
		System.out.println("After a test case");
	}
	
	@Test
	public void testSayHi() {
		String name = "Bitan";
		assertEquals("Hi "+name, ob.sayHi(name));
	}

	//@Test(timeout = 1000)
	//@Ignore
	@Test
	public void testStoreEmployeValid() {
		String name = "Bitan";
		assertEquals("Stored "+name, ob.storeEmployee(name, 100));
	}
	
	@Test(expected = RuntimeException.class)
	public void testStoreEmployeNotValid() {
		String name = "bitan";
		assertEquals("Stored "+name, ob.storeEmployee(name, 100));
	}
	
	@Test
	public void checkNullValue() {
		String name = "Sid";
		assertNull(ob.sayHi(name));
	}

}
