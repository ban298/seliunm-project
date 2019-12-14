import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FirstSel {

	public static void main(String[] args)  {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Chrome\\chromedriver.exe");
	
		driver=new ChromeDriver();
		
		driver.get("http://www.fastcareindia.in/");
		driver.manage().window().maximize();
		 
		//driver.findElement(By.name("firstname")).sendKeys("upendra ");
		//driver.findElement(By.name("lastname")).sendKeys(" pal");
		//driver.findElement(By.name("reg_email__")).sendKeys(" upendra@gmail.com");
		//driver.findElement(By.name("reg_passwd__")).sendKeys(" upendr1234");
		//driver.findElement(By.name("email")).sendKeys(" upendr1234");
		//driver.findElement(By.name("pass")).sendKeys(" 1234");
		//driver.findElement(By.id("loginbutton")).sendKeys(" click");
		//WebElement day=driver.findElement(By.id("day"));
		//Select select=new Select(day);
		//select.selectByVisibleText("16");
		
		//WebElement month=driver.findElement(By.id("month"));
		//Select select1=new Select(month);
		//select1.selectByVisibleText("Mar");
		
		//WebElement year=driver.findElement(By.id("year"));
		//Select select2=new Select(year);
		//select2.selectByVisibleText("1993");
		//driver.findElement(By.linkText("Cookie Policy")).click();
		
		//driver.findElement(By.linkText("Create a Page ")).click();
		//driver.findElement(By.partialLinkText("Cookie Policy")).click();
		//WebElement feamle=driver.findElement(By.id("u_0_6"));feamle.click();
		//WebElement male=driver.findElement(By.id("u_0_7"));male.click();
		//driver.findElement(By.id("loginbutton")).sendKeys(" click");
		//driver.findElement(By.name("websubmit")).sendKeys(" click");
		//driver.findElement(By.name("name")).sendKeys("upendra ");
		//driver.findElement(By.name("phone")).sendKeys("1234 ");
		//driver.findElement(By.name("email")).sendKeys("abc@gmail.com ");
		//driver.findElement(By.name("subject")).sendKeys("pest cantrol service ");
		//driver.findElement(By.name("location")).sendKeys("noida ");
		//driver.findElement(By.name("comments")).sendKeys("services ");
		//driver.findElement(By.id("submit")).sendKeys("click ");
		//WebElement Iservice=driver.findElement(By.name("Iservice"));
		//Select select1=new Select(Iservice);
		//select1.selectByVisibleText("Bird Spikes");
		//driver.findElement(By.id("submit")).sendKeys("click ");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.className("dropdown-toggle"))).build().perform();
		//driver.findElement(By.linkText("PEST CONTROL")).click();
		//driver.findElement(By.linkText("Commercial Pest Control Services")).click();
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		//for(int i=0;i<links.size();i++)
			//System.out.println(links.get(i));
			
			
		//driver.close();
		//driver.quit();
	}
	

}
