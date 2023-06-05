package runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"C:\\Users\\DELL\\Desktop\\maheshgithub prg\\Mahesh2\\src\\test\\resources\\features\\word.feature"},

		glue= {"stepDef"},
		monochrome=true,
		plugin= {"pretty","html:target/maheshword results"}

		)


public class WordtestRunner extends AbstractTestNGCucumberTests {

}
