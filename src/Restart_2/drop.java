package Restart_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		
		
		WebElement dropdown= driver.findElement(By.xpath("//img[@class='-dOa_b']"));
		
		
		Select staticdropdown = new Select(dropdown);
		staticdropdown.selectByIndex(3);	        
	}

}
