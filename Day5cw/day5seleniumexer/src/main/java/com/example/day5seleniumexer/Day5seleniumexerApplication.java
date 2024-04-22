package com.example.day5seleniumexer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day5seleniumexerApplication {

	public static void main(String[] args) {
		try{

			WebDriver driver=new ChromeDriver();
			driver.get("https://www.demoblaze.com/");
			driver.manage().window().fullscreen();
			// JavascriptExecutor js = (JavascriptExecutor)driver;
 
        // Scroll to bottom of page
          //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
// 		  JavascriptExecutor js = (JavascriptExecutor)driver;
// long prevScrollHeight = 0;
// while (true) {
//   long currentScrollHeight = (Long) js.executeScript("return document.body.scrollHeight");
//   if (prevScrollHeight == currentScrollHeight) {
//     break;
//   }
//   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//   prevScrollHeight = currentScrollHeight;
//   Thread.sleep(100); // Adjust delay as needed
// }
			driver.findElement(By.linkText("Laptops")).click();

			Thread.sleep(3000);
			driver.findElement(By.linkText("MacBook air")).click();
			driver.findElement(By.xpath("//*[@id='tbodyid']/div[3]/div/div/h4/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Add to cart")).click();
			Thread.sleep(10000);
			driver.switchTo().alert().accept();
			Thread.sleep(10000);
			driver.findElement(By.linkText("Cart")).click();
			driver.findElement(By.xpath("//*[@id='navbarExample']/ul/li[4]/a")).click();
			driver.findElement(By.xpath("//*[contains(@id='navbarExample')]/ul/li[4]/a")).click();
		}
		catch(Exception e)
		
		{
			
		}

		SpringApplication.run(Day5seleniumexerApplication.class, args);
	}

}
