package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {

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
	@DisplayName("初期状態でincrementメソッドを実行すると１が取得できる")
	void test1() {
		Counter counter = new Counter();
		assertEquals(1, counter.increment(), "初期実行1が出ないエラー");
	}

	@Test
	@DisplayName("incrementメソッドを1回実行した状態で、incrementメソッドを実行すると2が取得できる")
	void test2() {
		Counter counter = new Counter();
		counter.increment();
		assertEquals(2, counter.increment(), "2回目の実行で2が出ないエラー");
	}

	@Test
	@DisplayName("incrementメソッドを50回実行した状態で、incrementメソッドを実行すると51が取得できる")
	void test3() {
		Counter counter = new Counter();
		for(int i = 0;i < 50;i++) {
			counter.increment();
		}
		assertEquals(51, counter.increment(), "50回実行した状態で、incrementメソッドを実行すると51が取得できないエラー");
			
		
		
	}

}
