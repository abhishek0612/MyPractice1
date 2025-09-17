package Restart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		//Implicit  wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Hit the URL into the browser 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		String name = "Abhi";
		
		
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys(name); 
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		//Assert.assertEquals(driver.findElement(By.xpath("//div/h2[1]")).getText(),"Hello"+ name+",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		
	}
	
	public void getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String passwordText =  driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		
	}

}
