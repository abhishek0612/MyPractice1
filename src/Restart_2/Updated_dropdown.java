package Restart_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updated_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.id("divpaxinfo")).click();
		 Thread.sleep(2000L);
		 
		 //while loop 
		// int i=1;
		// while(i<5) {
			 
			// driver.findElement(By.id("hrefIncAdt")).click(); //clicks 4 times 
		//	 i++;
		// }
		 
		 
		 //for loop
	for(int i=1;i<5;i++)
	{driver.findElement(By.id("hrefIncAdt")).click();
	
	}
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		System.out.println("TEST");
	}
       
	
	
	

}
