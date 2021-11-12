package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

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
	void test1() {
//		Employee emp = new Employee();
		InputStream input = getClass().getResourceAsStream("Employee.txt");
		List<Employee> empList = Employee.load(input);
		Employee person = empList.get(0);
		assertAll("emp_error",
				() -> assertEquals("Ichiro",person.getFirstName(),"first_name_error"),
				() -> assertEquals("Tanaka",person.getLastName(),"last_name_error"),
				() -> assertEquals("ichiro@example.com",person.getEmail(),"email_error")
				);
		
		
//		for(Employee emp : empList) {
//			assertEquals(null, emp, "error");
//		}
//	
	}
}