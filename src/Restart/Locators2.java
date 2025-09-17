package Restart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		//Implicit  wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Hit the URL into the browser 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		String name = "Abhi";
		
		//Maximize the browser 
		driver.manage().window().maximize();
		
		//Enter the username 
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		//Enter the password 
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy1");
		
		//Click on the sign in button
		driver.findElement(By.className("submit")).click();
		
		//Get the error message "* Incorrect username or password"
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//Click on the forgot your password link 
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Enter text in name text filed 
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Abhi");
		
		//Enter the email id 
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abhi12@rt.com");
		
		//Clear the email filed 
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		
		//Again enter email id by using xpath with index 
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("abhi13@rt.com");
		
		//Enter the phone number by parent to child xpath 
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9839487392");
		
		//click on the "reset login" button
       driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
       
       System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
       
       //Click on the "GO TO LOGIN"
       driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
       
       //Enter username 
       driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
       
       //Enter password 
       driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");

       Thread.sleep(1000);
       //Check the check box 
       driver.findElement(By.id("chkboxOne")).click();
       
       
       Thread.sleep(2000);
       //Click on the sign in button 
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       

		

		

	}

}
