package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ItemStockTest {
	ItemStock itemStock;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("book", 500);
		itemStock.add(item);
		this.itemStock = itemStock;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Disabled
	@DisplayName("初期状態で、getNumで０が取得できる")
	void test1() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item(null, 0);
		assertEquals(0, itemStock.getNum(item), "初期状態で、getNumで０が取得できないエラー");
	}

	@Test
	@Disabled
	@DisplayName("初期状態で、addでItemを追加するとgetNumで１が取得できる")
	void test2() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("book",500);
		itemStock.add(item);
		assertEquals(1, itemStock.getNum(item), "初期状態で、addでItemを追加するとgetNumで１が取得できないエラー");

	}
	
	@Test
	@DisplayName("Itemが１つ追加されている状態で、getNumで１が取得できる")
	void test3() {
		Item item = new Item("book", 500);
		assertEquals(1, itemStock.getNum(item), "Itemが１つ追加されている状態で、getNumで１が取得できないエラー");
		
	}
	
	@Test
	@DisplayName("Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで２が取得できる")
	void test4() {
		Item item = new Item("book", 500);
		itemStock.add(item);
		assertEquals(2, itemStock.getNum(item), "Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで２が取得できないエラー");
		
	}
	
	@Test
	@DisplayName("Itemが１つ追加されている状態で、addで異なるItemオブジェクトを追加するとgetNumで１が取得できる")
	void test5() {
		Item item = new Item("cd", 1000);
		itemStock.add(item);
		assertEquals(1, itemStock.getNum(item), "Itemが１つ追加されている状態で、addで異なるItemオブジェクトを追加するとgetNumで１が取得できないエラー");
		
	}

}
