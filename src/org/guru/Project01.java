package org.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parasuraman\\eclipse-workspace\\Guru99\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.demo.guru99.com/V4/");
		
		driver.getTitle();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mngr435092");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pugUtug");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.close();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
