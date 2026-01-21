import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreemnshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		driver.manage().window().maximize();
		
		
		//Screenshot of fullpage 
		
//		TakesScreenshot tss = (TakesScreenshot)driver;
//		File sourcescreenshotlocationelement = tss.getScreenshotAs(OutputType.FILE);// Take a screenshot 
//		File destinationfileLocation = new File("/Users/apple/Desktop/JavaPractice/SeleniumDemo/screenshots/image1.png");// save the file in the specific location 
//		
//		FileUtils.copyFile(sourcescreenshotlocationelement, destinationfileLocation);//copy the file in the specified location 
//		
//		driver.quit();
		
		// screenshot of specific portion or element in the page
		
		WebElement tableSection = driver.findElement(By.xpath("//div[@id='HTML30']//div[@class='widget-content']"));
		//TakesScreenshot tss = (TakesScreenshot)driver;
		File onesourcescreenshotlocationelement = tableSection.getScreenshotAs(OutputType.FILE);// Take a screenshot 
		File onedestinationfileLocation = new File("/Users/apple/Desktop/JavaPractice/SeleniumDemo/screenshots/image2.png");// save the file in the specific location
		FileUtils.copyFile(onesourcescreenshotlocationelement, onedestinationfileLocation);//copy the file in the specified location 

		driver.quit();
	}

}
