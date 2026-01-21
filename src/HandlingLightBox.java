import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLightBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://www.ajio.com/shop/men?&utm_source=google&utm_medium=cpc&utm_campaign=GSB_Brand_TROAS_Sept2025&gad_source=1&gad_campaignid=23011145465&gbraid=0AAAAADP0DvcpAMosI5U6jwJPDOwZgBbVB&gclid=CjwKCAiA8vXIBhAtEiwAf3B-gznVEYonSotl-zObObUfpLj_-8_TiSro92BcRw7bsYPv9BVuVc0ddhoCpc4QAvD_BwE");
		driver.manage().window().maximize();
		
		Thread.sleep(Duration.ofSeconds(3));
		
		//driver.findElement(By.id("closeBtn-locale-banner-popup")).click();
		
		//Thread.sleep(Duration.ofSeconds(3));

		
		driver.findElement(By.name("searchVal")).sendKeys("footwear");
		
		

	}

}
