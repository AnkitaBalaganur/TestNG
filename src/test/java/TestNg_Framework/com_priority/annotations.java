package TestNg_Framework.com_priority;

import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.*;

public class annotations {
	
	private OperaDriver driver;
	
	@BeforeTest
	public void open_browser() {
		  System.setProperty("webdriver.opera.driver", "D:\\test1\\operadriver_win64\\operadriver.exe");
			 
		  driver = new OperaDriver();
		  driver.get("https://www.fb.com");
	  }
	@Test
	 public void cloginTest() {

		  driver.get("https://www.fb.com");

	  }
	
	@AfterTest
	public void terminateBrowser(){
	driver.close();
	}
}
