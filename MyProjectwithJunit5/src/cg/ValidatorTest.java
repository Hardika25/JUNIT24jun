package cg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.MethodSource;

class ValidatorTest {

	@ParameterizedTest
	@ValueSource(strings= {"racecar","radar","nitin","naman"})
	void test3(String data) {
		Validator ob=new Validator();
		System.out.println("test is palindrome with value "+data);
		assertTrue(ob.ispalindrom(data));
	}
	
	@ParameterizedTest
	@CsvSource({"4,5","10,20","100,500"})
	void test4(int a, int b)
	{
	Calculator ob=new Calculator();
	System.out.println("test add with values a=" +a + " b=" +b);
	}
	
	
	
	
	
	@ParameterizedTest
	@MethodSource("testaddwithOutput")
	void withMethodSource(int a,int b,int op)
	{
		Calculator ob=new Calculator();
		System.out.println("test add with values a=" +a + " b=" +b + " output" +op);
		assertEquals(op,ob.add(a, b));
	}
	
	
	private static Stream<Arguments> testaddwithOutput()
	{
		return Stream.of(
				Arguments.of(4,5,9),
				Arguments.of(100,500,600)
				
				);
		
	}
	
	
	
	@ParameterizedTest
	@EnumSource(Size.class)
	
	void withSomeEnumValues(Size size) {
		
		System.out.println("test enum value" +size);
		Validator ob = new Validator();
		assertEquals(size.getMl(),ob.getSizeinMl(size));
		// executed once for TimeUnit.NANOSECONDS
		// and once for TimeUnit.MICROSECONDS
	}
	
	@Test
	void test1() {
	
		Validator ob = new Validator();
		String data ="100";
		Assumptions.assumeTrue(data!=null);
		System.out.println("assert true");
		assertTrue(ob.validateNo(data));
		System.out.println("assert false");
		data="abc";
		assertFalse(ob.validateNo("abc"));
		
	}


	@Test
	void test2() {
		Validator ob = new Validator();
		//assertTrue(ob.validateNo(null));
		assertThrows(NullPointerException.class,()->ob.validateNo(null)); //lambda expr
	

	}
	
	/*//()->ob.validateNo(null)
	 * 
	 * class-----implements Executable
	 * {
	 * 
	 * 
				  public boolean execute()
				  {
				     return ob.validateNo(null);
				  }
				  
	 */

}
