package assignment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Excelsheet {
	
	 @Test
	  public void f() throws IOException {
		String path="C:\\Users\\user\\Documents\\example.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i=1;i<=rows;i++) {
			
			Select sel1=new Select(driver.findElement(By.xpath("/html/body/form/input[1]")));
			String username=sheet.getRow(i).getCell(0).getStringCellValue();
//			sel1.selectByVisibleText(username);
			
			Select sel2=new Select(driver.findElement(By.xpath("/html/body/form/input[2]")));
			String password=sheet.getRow(i).getCell(1).getStringCellValue();
//			sel2.selectByVisibleText(password);
			
		}
		
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
	  }
	  WebDriver driver;
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\keerthana.eramalla\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.stealmylogin.com/demo.html");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @AfterClass
	  public void afterClass() {
		//  driver.close();
	  }
}


