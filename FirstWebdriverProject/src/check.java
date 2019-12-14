import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class check {
	public static void main(String[] args)  {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome\\chromedriver.exe");
	
		driver=new ChromeDriver();
		
driver.get("https://www.garginfotech.com/contact-us");
driver.manage().window().maximize();
driver.findElement(By.id("fname")).sendKeys("upendra");
driver.findElement(By.id("choose")).sendKeys("pal");
driver.findElement(By.name("email")).sendKeys("xyz@gmail.com");
driver.findElement(By.name("mobile")).sendKeys("7065326");
driver.findElement(By.name("location")).sendKeys("php java,c++");
driver.findElement(By.name("message")).sendKeys( "i am noida ");
driver.findElement(By.id("contactFormSubmit")).click();
		
		
	}

	
		
	}

		
	
	
		


