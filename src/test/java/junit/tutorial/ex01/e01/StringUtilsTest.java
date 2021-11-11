package junit.tutorial.ex01.e01;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

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
	@DisplayName("「aaa」を入力すると「aaa」が取得できる")
	void test1() {
		String result = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", result, "aaa_error");
		
	}
	@Test
	@DisplayName("「HelloWorld」を入力すると「hello_world」が取得できる")
	void test2() {
		String result = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", result, "HelloWorld_error");
		
	}
	@Test
	@DisplayName("「practiceJunit」を入力すると「practice_junit」が取得できる")
	void test3() {
		String result = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", result, "practice_junit_error");
		
	}
	
	

}
