package com.cg.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.AfterAll;
	import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.Test;

	import com.cg.bean.Account;
	
	import com.cg.service.AccountService;

	import sun.print.resources.serviceui;

	class TestusingJunit {
  {

		static AccountService as;
		@BeforeAll       //junit4 @BeforeClass
		public static void beforeAllTest() {
			System.out.println("BEFORE ALL TEST");
			AccountService as= new AccountService();
		}
		
		@AfterAll     //junit4 @AfterClass
		public static void afterAllTest() {
		System.out.println("AFTER ALL TEST");
		as=null;
		}

		@Test
		void testwithdraw() {
			Account ob=new Account(100,987654321, "hardika",10000);
			System.out.println("Add Tested");
			assertTrue(as.addAccount(ob));
		
		}
		@Test
		void testaddaccount() {
			Account ob=new Account(100,987654321, "hardika",10000);
			System.out.println("Add Tested");
			assertTrue(as.addAccount(ob));	
		}
		
		@Test
		void testaddaccount1() {
			Account ob=new Account(100,987654321, "hardika",10000);
			System.out.println("Add Tested");
			String s_id=Integer.toString(ob.getAid());
			assertTrue(validator.validat);
			assertTrue(as.addAccount(ob));	
		}

		@Test
		void testupdateaccount() {
			Account ob=new Account(101,987654321, "kalyani",20000);
			System.out.println("Update Tested");
			assertTrue(as.updateAccount(ob));	
		}
		
		@Test
		void testdeleteaccount() {
			Account ob=new Account(101,987654321, "kalyani",20000);
			System.out.println("delete Tested");
			assertTrue(as.updateAccount(ob));	
		}
		
		
		

		
		
	}


}
