package SeleniumAssignment.SeleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Windowpopup {
	
	 @Test
	  public void f() throws InterruptedException {
		 driver.findElement(By.xpath("/html/body/strong/div/a[1]/amp-img/img")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().dismiss();
		
	  }
	  WebDriver driver;
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthana.eramalla\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://popuptest.com/goodpopups.html");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @AfterClass
	  public void afterClass() {
	//	  driver.close();
	  }
}
