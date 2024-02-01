package TestNg_Framework.com_priority;

import org.openqa.selenium.By;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class priority {
	
	static OperaDriver driver;
	
  @Test(priority = 2)
  public void trying_priority(){
	  driver.findElement(By.name("email")).sendKeys("ankita@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("ankita");
  }
  
  @Test(priority = 1)

  public void cloginTest() {

	  driver.get("https://www.fb.com");

  }
  @Test
  public void open_browser() {
	  System.setProperty("webdriver.opera.driver", "D:\\test1\\operadriver_win64\\operadriver.exe");
		 
	  driver = new OperaDriver();
	  driver.get("https://www.fb.com");
  }
  @Test(priority=3)
  public void closeTest() {

	  driver.quit();

  }
  
}
