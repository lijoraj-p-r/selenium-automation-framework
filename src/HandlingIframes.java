import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		// frame 1 
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Kodnest");
		
		driver.switchTo().defaultContent();// switch the focus of the selenium to the main page 
		
		//frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name ='mytext2']")).sendKeys("Automation");
		
		driver.switchTo().defaultContent();
		
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));	
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("This is awesome");
		
		
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.xpath("//label[@for='i9']//div[@class='bzfPab wFGF8']")).click();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).clear();
		
		
		
		
	
		
		

	}

}
