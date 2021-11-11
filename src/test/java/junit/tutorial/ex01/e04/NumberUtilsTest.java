package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

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
	@DisplayName("入力値に「１０」を与えると、trueを返す")
	void test1() {
		assertEquals(true, NumberUtils.isEven(10),"isEven(10)_error");
		
	}

	@Test
	@DisplayName("入力値に「７」を与えると、falseを返す")
	void test2() {
		assertEquals(false, NumberUtils.isEven(7),"isEven(7)_error");
		
	}

}
