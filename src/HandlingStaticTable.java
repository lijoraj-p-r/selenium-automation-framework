import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//finding the rows in a table 
		// If we are having only one table in the webpage 
		int noofrows = driver.findElements(By.tagName("tr")).size();
		
		//int noofrows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		//System.out.println(noofrows);
		
		// finding the no of columns 
		int noofcolumns= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//System.out.println(noofcolumns);
		
		// Reading only one element from the table for a specific row and column 
		
		//String subject = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")).getText();
		//System.out.println("The subject name is :" + subject);
		
		// Reading the data for all the rows and columns
		
		for(int row = 2; row<=noofrows; row++) {
			
			for(int col = 1; col<=noofcolumns;col++) {
				
			String tabledata = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td["+col+"]")).getText();//["+row+"]["+col+"]if we want want to pass the variables dynamically
			System.out.print(tabledata +"\t");

			}
			System.out.println();

			
		}

	
	}
	

}
