package Restart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling_xpathtraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//Sibling -parent traverse 
		
		//Hit the URL 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       //sibling to get text "login" //header/div/button[1]/following-sibling::button[1]
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
	
		//Get text signup 
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
		
		//child sibling //header/div/button[1]/parent::div
		
		System.out.println("Child traverse:"+driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		
		
	}

}
