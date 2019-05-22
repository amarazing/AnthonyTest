package demo_test_aid;
import org.testng.annotations.Test;

public class PrintTest {

	@Test
	public void printHello() {
		System.out.println("HelloWorld");

	}

	@Test
	public void customerNew() {
		String customer = "hello";
		System.out.println(customer.charAt(0));
	}


}
