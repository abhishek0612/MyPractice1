package Practice_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//Open the URL
		driver.get("https://www.saucedemo.com/");
		
		//Get the logo name 
		//System.out.println(driver.findElement(By.xpath("//div[@class='login_logo']")));
		
		
		//Enter username 
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//Enter password 
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//Click on the login button 
		driver.findElement(By.id("login-button")).click();

	}

}
