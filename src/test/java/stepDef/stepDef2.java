package stepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDef2 extends BaseClass{
	@Then("search a word and click Enter and check page title")
	public void method7(DataTable dt) throws Exception {
	   
	  List<String> l= dt.asList();
	  
	  for(int i=1;i<l.size();i++)
	  {
		  driver.findElement(By.name("q")).sendKeys(l.get(i), Keys.ENTER);
		  Thread.sleep(3000);
		  if(driver.getTitle().contains(l.get(i)))
		  {
			  System.out.println("Test passed");
		  }
		  else
		  {
			  System.out.println("Test Failed");
		  }
		  driver.navigate().back();
		  Thread.sleep(3000);
	  }
	}
	

	@Then("close browser")
			public void close_browser() {
				driver.close();
				
				
				// @Then("close/quit browser")
					//public void method5() {
				//		driver.close();
						
			}
			
			
		}


