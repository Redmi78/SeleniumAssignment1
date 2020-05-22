package com.Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		//firefox browser
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		//IE browser
		//WebDriverManager.iedriver().setup();
		//WebDriver driver = new InternetExplorerDriver();
		WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("jeans");

driver.findElement(By.className("nav-input")).click();

driver.findElement(By.xpath("//span[contains(text(),\"Amazon Essentials Men's Slim-Fit Stretch Jean\")]")).click();;

System.out.println(driver.findElement(By.cssSelector("#priceblock_ourprice")).getText());
driver.findElement(By.name("field-keywords")).sendKeys("MUGS");
driver.findElement(By.linkText("About Amazon")).click();
System.out.println("about amazon title " +  driver.getTitle());
driver.navigate().back();
driver.findElement(By.partialLinkText("Sell on")).click();
System.out.println("Sell on Title " +  driver.getTitle());

driver.close();
driver.quit();


	}

}
