import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automation {
	public static void main(String[] args)  {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome\\chromedriver.exe");
	
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		//driver.findElement(By.name("name")).sendKeys("upendra pal");
		//driver.findElement(By.name("phone")).sendKeys("984534");
		//driver.findElement(By.name("email")).sendKeys("xyz@g.com");
		//driver.findElement(By.name("subject")).sendKeys("php,java");
		//driver.findElement(By.name("location")).sendKeys("noida");
		//WebElement service =driver.findElement(By.name("Iservice"));
		//Select select=new Select(service);
		//select.selectByIndex(1); 
		//driver.findElement(By.name("comments")).sendKeys("pest cantrol service provide pest cantrol service");
		//driver.findElement(By.id("submit")).click();
		 //driver.close();
		// driver.quit();
		 driver.findElement(By.id("id")).sendKeys("upendra pal");
		
		
		
		
}
}
