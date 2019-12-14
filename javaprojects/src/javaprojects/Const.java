package javaprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Const {

	public  Const() {
		System.out.println("hello ");
		
	}
	
	public Const(int x) {
		System.out.println("hello word");
		
	}
	public Const(int x,String y) {
		System.out.println("popup word");
		
	}
	public Const(int x,int y) {
		System.out.println("upendra pal");
		
	}
	
		
	
	public static void main(String[] args) {
		Const s=new  Const();
		Const s1=new  Const(6,"popup");
		Const s2=new  Const(5,12);
		
}
}
WebElement firstname=driver.findElement(By.name("firstname"));firstname.sendKeys("upendra");
WebElement lastname=driver.findElement(By.name("lastname"));lastname.sendKeys("pal");
WebElement mobile_email =driver.findElement(By.name("reg_email__"));mobile_email.sendKeys("upendra@gmail.com");
WebElement password=driver.findElement(By.name("reg_passwd__"));password.sendKeys("123456");
WebElement email=driver.findElement(By.name("email"));email.sendKeys("upendra kumar");
WebElement password2=driver.findElement(By.name("pass"));password2.sendKeys("123456789");

String  value=itr.next();
System.out.println(value);	

value=itr.next();
System.out.println(value);	


value=itr.next();
System.out.println(value);	

value=itr.next();
System.out.println(value);

boolean val=itr.hasNext();

System.out.println(val);

