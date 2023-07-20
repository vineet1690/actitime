package pomRepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateStaleElementRefrenceException {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		
		WebElement googleSearchBox = driver.findElement(By.name("q"));
		
		
		
		googleSearchBox.sendKeys("selenium");
		
		driver.navigate().refresh();
		
		
		
		googleSearchBox.sendKeys("Automation");
		

	}

}
