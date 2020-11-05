package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.TestController;

@SpringBootTest
class SpringJUnitTestApplicationTests {

	TestController myMath = new TestController();

	// MyMath.sum
	// 1,2,3 => 6
	@Test
	public void sum_with3numbers() {
		System.out.println("Test1");
		assertEquals(6,myMath.sum(new int[] { 1, 2, 3 }));
	
	}
	
	@Test
	public void sum_with1number() {
		System.out.println("Test2");
		assertEquals(3, myMath.sum(new int[] { 3 }));
	}

	
}
