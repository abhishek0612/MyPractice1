package Restart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Browser 
		
		
        
		//Chrome Browser
		//WebDriver driver  = new ChromeDriver();
		
		
		//Firefox Browser
		//WebDriver driver  = new FirefoxDriver();
		
		//Microsoftedge Browser
		WebDriver driver  = new EdgeDriver();
		
		
		//Hit the URL 
		driver.get("https://rahulshettyacademy.com");
		
		//Fullscreen
		//driver.manage().window().fullscreen();
		//driver.close();
		
		//Get the page title
         System.out.println(driver.getTitle());
         
         //Get the URL 
        System.out.println(driver.getCurrentUrl());
        
        //Close the current window
        //driver.close();
	}

}
