
package assignment2;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Dataprovider {
	WebDriver driver;
	  @BeforeClass
	  public void beforeClass() 
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthana.eramalla\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver=new ChromeDriver();  
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	  }
  @Test(dataProvider = "dp")
  public void test(String username, String password ) throws InterruptedException 
  {
	  Thread.sleep(2000);
	  driver.get("https://www.stealmylogin.com/demo.html");
	  driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys(username);
	  driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys(password);
	  driver.findElement(By.xpath("/html/body/form/input[3]")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Ravi", "Password1234" },
      new Object[] { "Sita", "atis00" },
      new Object[] {"Ramu","12345678" },
      new Object[] {"alex","hello456" },
    };
  }
 
  @AfterClass
  public void afterClass() {
  }

}
