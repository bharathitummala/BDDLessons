package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class RestaurantSystem {

	@Before("@Smoketest")
	public void beforeMsg(Scenario sc) {
		System.out.println("Before scenario: " + sc.getName());
	}

	@After("@Smoketest")
	public void afterMsg(Scenario sc) {
		System.out.println("After scenario: " + sc.getName());
	}

}
