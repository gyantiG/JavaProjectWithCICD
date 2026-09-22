package com.springboot.security.SpringBootSecurityDay1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.springboot.security.SpringBootSecurityDay8.service.Calculator;

public class CalculatorTest {

	@Test
	void testAddition() {

		Calculator calculator = new Calculator();
		int result = calculator.add(10, 20);
		assertEquals(30, result);
	}
}
