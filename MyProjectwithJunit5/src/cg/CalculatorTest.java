package cg;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	static Calculator ob;
	
	@BeforeAll       //junit4 @BeforeClass
	public static void beforeAllTest() {
		System.out.println("BEFORE ALL TEST");
		ob=new Calculator();
	}
	
	
	@AfterAll     //junit4 @AfterClass
	public static void afterAllTest() {
	System.out.println("AFTER ALL TEST");
	ob=null;
	}
	
	
	@BeforeEach //junit4 @before
	public void beforeEachTest()
	{
	 System.out.println("before each test");
	 ob=new Calculator();
	}
	
	 @AfterEach   //junit4 @after
	 public void afterEachTest()
	 {
		 System.out.println("After each test");
		 ob=null;
	 }
	
	
	@Test
	void testadd() {
		System.out.println("test case testadd");
		//Calculator ob=new Calculator();
		//Assert.assertEquals(9,ob.add(4,5));
		assertEquals(9,ob.add(4,5));
		
	}
	
	@RepeatedTest(5)
	//@Test
	void testadd1() {
		System.out.println("test case testadd1");
		//Calculator ob=new Calculator();
		//Assert.assertEquals(9,ob.add(4,5));
		assertTrue(ob.add(4, 5)>0);
		assertTrue(ob.add(4, -5)>=0);
	}
    
	@Disabled
	@Test
	void testidgenerator()
	{
		System.out.println("done");
	  assertTrue(ob.idgenerator()>=0);
	  
	}
	

}
