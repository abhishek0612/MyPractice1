package Restart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open  the browser
		WebDriver driver = new ChromeDriver();
		
		
		//Hit the URL
		driver.navigate().to("https://www.linkedin.com/feed/");
		
		
		//Get the title of page
		System.out.println(driver.getTitle());
		
		
		//Capture the URL of page 
		System.out.println(driver.getCurrentUrl());
		
		//Capture page source 
		System.out.println(driver.getPageSource());
	
		
		
	}

}
