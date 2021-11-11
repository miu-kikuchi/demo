package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDivide() {
		Calculator calculator = new Calculator();
		try {
			calculator.divide(2,1);
			fail("IllegalArgumentExceptionが発生しませんでした");
		} catch (IllegalArgumentException e) {
			//成功
			assertEquals("divide by zero.", e.getMessage(), "エラーメッセージが違います");
		}
	}

}
