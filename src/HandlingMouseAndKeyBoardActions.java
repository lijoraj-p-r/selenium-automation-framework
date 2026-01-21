import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseAndKeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://iamsandesh23.github.io/selenium.github.io/");
		driver.manage().window().maximize();
		
//		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
//		driver.manage().window().maximize();
		
		//driver.get("https://demo.automationtesting.in/Static.html");
		
		//driver.manage().window().maximize();
		
		//WebElement blogsMenu = driver.findElement(By.xpath("//a[@href='#']"));
		
		//WebElement sel143 = driver.findElement(By.xpath("//span[normalize-space()='Selenium143']"));
		//WebElement pic = driver.findElement(By.xpath("//img[@src='pic.png']"));
		
		//WebElement searchField = driver.findElement(By.name("q"));
		//searchField.sendKeys("kodnest");
		
		//WebElement leftSlider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		
//		 WebElement angElement = driver.findElement(By.id("angular"));
//		 
//		 WebElement dropAreaField = driver.findElement(By.id("droparea"));
		
		WebElement link = driver.findElement(By.linkText("jqueryui"));
		 
		 
		Actions act = new Actions(driver);
		// hover to element
		//act.moveToElement(blogsMenu).moveToElement(sel143).click().perform();
		//act.build();// create an action
		//act.perform();// complete the action 
		
		// Right Click
		//act.contextClick(pic).perform();
		
		//Double Click 
		
		//act.doubleClick(searchField).perform();
		
		
		// Sliding actions 
		
//		act.dragAndDropBy(leftSlider, 300, 0).perform();
//		
//		Thread.sleep(Duration.ofSeconds(3));
//		
//		act.dragAndDropBy(leftSlider, -100, 0).perform();
		
		//Drag and drop 
		
//		act.dragAndDrop(angElement, dropAreaField).perform();
		
		
		//Keyboard Actions 
		
		//act.keyDown(Keys.COMMAND).click(link).keyUp(Keys.COMMAND).perform();
		
		
		
		
		
		
		
	
		
		
	
		
		
		
		
		
		

	}

}
