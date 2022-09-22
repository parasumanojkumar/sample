package org.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript02 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parasuraman\\eclipse-workspace\\Guru99\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.demo.guru99.com/V4/");
		
		driver.manage().window().maximize();
		
		driver.getTitle();
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr435092");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pugUtug");
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		
		WebElement text = driver.findElement(By.xpath("//marquee[@behavior='alternate']"));
		System.out.println(text.getText());
		
		
		driver.close();
		
		
		
	}
}
