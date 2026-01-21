import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderorDatePickers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);// switch the focus to the frame 
		
		//type-1 : using sendkeys() directly pass the values in the respective field 
		//driver.findElement(By.id("datepicker")).sendKeys("11/25/2025");
		
		// type 2 
		
		String year = "2024";
		String month = "December";
		String date = "25";
		
		driver.findElement(By.id("datepicker")).click();// open the calender
		
		//handling the year and month 
		while(true) {
			
			String monthelement = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yearelement = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(monthelement.equals(month) && yearelement.equals(year)) 
			{
				
				break;
			}
			
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//future/next
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//past/previous
	
		}
		
		//Handling the date
		
		 List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td//a"));
		 
		 for(WebElement requireddate:alldates) {
			 
			 if(requireddate.getText().equals(date)) {
				 
				 requireddate.click();
				 
				 break;
				 
			 }
		 }
		

	}

}
