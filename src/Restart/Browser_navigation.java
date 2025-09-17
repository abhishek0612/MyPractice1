package Restart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		//Maximize screen 
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		
		//Navigate to another window
		driver.navigate().to("https://rahulshettyacademy.com/#/index");
		
		//get back previous browser
		driver.navigate().back();
		
		driver.navigate().forward();
	}
	

}
