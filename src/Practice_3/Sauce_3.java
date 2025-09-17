package Practice_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		String url ="https://www.saucedemo.com";
		//Open the URL
		driver.get(url);
		
		//Get the logo name 
		//System.out.println(driver.findElement(By.xpath("//div[@class='login_logo']")));

        String username ="standard_user";
		//Enter username 
		driver.findElement(By.id("user-name")).sendKeys(username);
		
		String password = "secret_sauce";
		//Enter password 
		driver.findElement(By.id("password")).sendKeys(password);
		
		//Click on the login button 
		driver.findElement(By.id("login-button")).click();

	}

}
