package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhatIsSubmitMethod_02 {
	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	//click on login button
	//WebElement loginButton = driver.findElement(By.name("login"));
	//loginButton.submit();
	//click on link text Forgotten password?
	Thread.sleep(5000);
	/*
	 * WebElement forgottenPassword =
	 * driver.findElement(By.linkText("Forgotten password?"));
	 * forgottenPassword.submit();
	 */
	WebElement createNewAccountButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	createNewAccountButton.submit();
	//End result is it is clicking only on the <form> nested button made 
	//with <button> type="submit"
}
}