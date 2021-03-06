package com.capg.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import com.capg.presentation.OrderAndCartPresentationImpl;
import com.capg.dto.CartDto;
import com.capg.exception.*;

public class OrderAndCartPresentationTest {
	OrderAndCartPresentationImpl oacpti;
	CartDto d=new CartDto();
	CartDto d1=new CartDto();
	CartDto d2=new CartDto();
	@Before
	public void setUp() throws Exception {
		oacpti=new OrderAndCartPresentationImpl();
	}

	@Test
	public void test() {
		d.setUserId("Veeru");
		d.setProductId(1);
		d.setQuantity(4);
		System.out.print("Test Case 1: ");
		 oacpti.addItemToCart(d);
		System.out.println();
	}
 
	@Test
	public void test1() {
		d1.setUserId("Ram");
		d1.setProductId(17);
		d1.setQuantity(4);
		System.out.print("Test Case 2: ");
		 oacpti.addItemToCart(d1);
		 System.out.println();
	}
	
	@Test
	public void test2() {
		d2.setUserId("Ram");
		d2.setProductId(1);
		d2.setQuantity(8);
		System.out.print("Test Case 3: ");
		oacpti.addItemToCart(d2);
		System.out.println();
	}
	
	@Test
	public void test3() {
		d2.setUserId("Ram");
		d2.setProductId(1);
		d2.setQuantity(4);
		System.out.print("Test Case 4: ");
		oacpti.addItemToCart(d2);
	}
	
	@After
	public void tearDown() throws Exception {
		oacpti=null;
	}
}
