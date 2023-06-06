package stepDef;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDef1 extends BaseClass {
	@Given("launch the chrome browser")
	public void method1() {
		WebDriverManager.chromedriver().setup(); 
		ChromeOptions co=new ChromeOptions();	
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
	    }
	

	@When("Enter the url as {string}")
	public void method2(String url) throws Exception {
		    driver.get(url);
		    Thread.sleep(5000);
	    
	}
	    
	}

	
	
	

	
