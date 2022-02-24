package assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTab {
	
	  @Test
	  public void f() {
		  System.out.println( driver.getTitle());
		  driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
		  driver.get("http://openclinic.sourceforge.net/openclinic/medical/patient_search_form.php");
		  System.out.println( driver.getTitle());
//		  driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
		  WebElement dropdown= driver.findElement(By.id("search_type"));
			Select option=new Select(dropdown);
			option.selectByIndex(2);
			driver.findElement(By.id("search_text")).sendKeys("hello");
			driver.findElement(By.id("search_patient")).click();
	  }
	  WebDriver driver;
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthana.eramalla\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @AfterClass
	  public void afterClass() {
		//  driver.close();
	  }

}
