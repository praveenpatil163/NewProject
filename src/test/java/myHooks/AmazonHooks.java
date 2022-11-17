package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;


//Using hooks we can get the name of the scenarios in the runtime.
//And also we can customize the scenario like pass or fail like that.
//Instead of order we can use the tag also in the hooks. tag can be used as the smoke or regression.

public class AmazonHooks {
	
	
	@Before("@Smoke")
	public void setUp_Browser() {
		System.out.println("Browser is setup");
	}
	
//	@Before(order=2)
//	public void setUp_url() {
//		System.out.println("Url is there to launch");
//	}
//	
//	@After()
//	public void tearDown() {
//		System.out.println("Close the browser");
//	}
	
	
	@After("@Smoke")
	public void tearDown_logout() {
		System.out.println("Logout is there");
	}
	
	@BeforeStep
	public void takeScreenshot() {
		System.out.println("Take screenshot before every step");
		
	}
	
	
	@AfterStep
	public void refreshPage() {
		System.out.println("Refresh page on every step");
		
	}

}
