package runners;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "src/test/java/feature",
		glue= {"stepDefiniions'},"
				plugin= {"pretty","htmp: target/cuumber-reports.html"},
						monochrome=true,
						tags='@smoketest",
						
		
		
		
		)

public class RuncucumberTest {

}
