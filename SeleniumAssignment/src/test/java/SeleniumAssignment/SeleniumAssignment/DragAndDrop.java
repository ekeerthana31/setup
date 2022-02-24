package SeleniumAssignment.SeleniumAssignment;


import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class DragAndDrop {
	@Test
	public void f() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
		Actions action=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  WebElement destination=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));	
	  
	 action.dragAndDrop(source, destination).perform();
	  }
	  WebDriver driver;
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthana.eramalla\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
	  }

	  @AfterClass
	  public void afterClass() {
		//  driver.close();
	  }
  

}
