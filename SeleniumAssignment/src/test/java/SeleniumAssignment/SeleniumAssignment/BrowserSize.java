package SeleniumAssignment.SeleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrowserSize {
	
	@Test
	public void f() throws InterruptedException, IOException {
		List<WebElement> links=(List<WebElement>) driver.findElement(By.linkText("a"));
		System.out.println(links.size());
		
	   for(int i=1;i<=links.size();i++)
	   {
			WebElement element=links.get(i);
			String URL=element.getAttribute("href");
			URL link=new URL(URL);
			
		  HttpURLConnection connection=(HttpURLConnection)link.openConnection();
		  
		  Thread.sleep(2000);
		  connection.connect();
		  
		  int response=connection.getResponseCode();
		  
		  if(response>=400)
		  {
			  System.out.println(URL+"-"+"is broken link");
		  }
		  else
		  {
			  System.out.println(URL+"-"+"is a valid link");
		  }
	   }
		
		
	  }
	  WebDriver driver;
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthana.eramalla\\Downloads\\chromedriver_win32\\chromedriver.exe");

		    driver=new ChromeDriver();
			driver.get("http://www.zlti.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @AfterClass
	  public void afterClass() {
		//  driver.close();
	  }

}
