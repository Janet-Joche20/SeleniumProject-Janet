package org.test.Excel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeni\\eclipse-workspace\\Excel1\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactin.com/HotelApp/");
		
		driver.findElement(By.id("username")).sendKeys("Janet");

		driver.findElement(By.id("password")).sendKeys("12345");
		
		driver.findElement(By.id("login")).click();
		
		
		
		
		
	}

}
