package com.progress.github_actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	private static Calculator calculator;

	@BeforeClass
	public static void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void addTest() {
		assertEquals(calculator.add(25, 100), 125);
		assertEquals(calculator.add(-5, -100), -105);
		assertEquals(calculator.add(-5, 1), -4);
		assertEquals(calculator.add(25, -1), 24);
	}

	@Test
	public void multiplyTest() {
		assertEquals(calculator.multiply(1, 2), 2);
		assertEquals(calculator.multiply(2022, 222), 448884);
		assertEquals(calculator.multiply(1, 1090), 1090);
	}

}
