package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

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

	@ParameterizedTest
	@ValueSource(doubles = {  0.0, 10.5 })
	void p_test1(double n) {
		Range range = new Range(0.0,10.5);
	    assertTrue(range.contains(n),"error");
	}
	
	@ParameterizedTest
	@ValueSource(doubles = { -0.1, 10.6})
	void p_test2(double n) {
		Range range = new Range(0.0,10.5);
	    assertFalse(range.contains(n),"error");
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {  -5.1, 5.1})
	void p_test3(double n) {
		Range range = new Range(-5.1,5.1);
	    assertTrue(range.contains(n),"error");
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {  -5.2, 5.2})
	void p_test4(double n) {
		Range range = new Range(-5.1,5.1);
	    assertFalse(range.contains(n),"error");
	}
	
	@Test
	@DisplayName("-0.1test")
	void test1() {
		Range range = new Range(0.0,10.5);
		assertEquals(false, range.contains(-0.1),"-0.1_error");
	}
		

	@Test
	@DisplayName("-0.0test")
	void test2() {
		Range range = new Range(0.0,10.5);
		assertEquals(true, range.contains(0.0),"0.0_error");
	}

	@Test
	@DisplayName("10.5test")
	void test3() {
		Range range = new Range(0.0,10.5);
		assertEquals(true, range.contains(10.5),"10.5_error");
	}

	@Test
	@DisplayName("10.6test")
	void test4() {
		Range range = new Range(0.0,10.5);
		assertEquals(false, range.contains(10.6),"10.6_error");
	}
	
	@Test
	@DisplayName("-5.2test")
	void test5() {
		Range range = new Range(-5.1,5.1);
		assertEquals(false, range.contains(-5.2),"-5.2_error");
	}
	
	@Test
	@DisplayName("-5.1test")
	void test6() {
		Range range = new Range(-5.1,5.1);
		assertEquals(true, range.contains(-5.1),"-5.1_error");
	}

	@Test
	@DisplayName("5.1test")
	void test7() {
		Range range = new Range(-5.1,5.1);
		assertEquals(true, range.contains(5.1),"5.1_error");
	}
	
	@Test
	@DisplayName("5.2test")
	void test8() {
		Range range = new Range(-5.1,5.1);
		assertEquals(false, range.contains(5.2),"5.2_error");
	}
}
