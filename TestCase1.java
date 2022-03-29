package com.Utilities.Utils;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 extends Launch{

	public TestCase1(String url) {
		super(url);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String url ="https://demo.guru99.com/insurance/v1/index.php";
		Launch launch = new Launch(url);
		WebElement register =driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		Select title = new Select(driver.findElement(By.id("user_title")));
		title.selectByValue("Ms");
		WebElement firstname=driver.findElement(By.id("user_firstname"));
		firstname.sendKeys("Selemium");
		WebElement surname =driver.findElement(By.id("user_surname"));
		surname.sendKeys("Java");
		WebElement phone = driver.findElement(By.id("user_phone"));
		phone.sendKeys("123456");
		Select dobYear = new Select(driver.findElement(By.name("year")));
		dobYear.selectByIndex(3);
		Select dobMonth = new Select(driver.findElement(By.name("month")));
		dobMonth.selectByIndex(6);
		Select dobDate = new Select(driver.findElement(By.name("date")));
		dobDate.selectByValue("22");
		WebElement licencetypep=driver.findElement(By.xpath("//input[@value='Provisional']"));
		licencetypep.click();
		Select licencePeriod = new Select(driver.findElement(By.name("licenceperiod")));
		licencePeriod.selectByIndex(5);
		Select occupation = new Select(driver.findElement(By.id("user_occupation_id")));
		occupation.selectByVisibleText("Doctor");
		WebElement street = driver.findElement(By.name("street"));
		street.sendKeys("2nd cross");
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Bangalore");
		WebElement country =driver.findElement(By.name("county"));
		country.sendKeys("India");
		WebElement postalCode = driver.findElement(By.xpath("//input[@name='post_code']"));
		postalCode.sendKeys("560040");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("abc@gmail.com");
		WebElement password =driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("abc@1");
		WebElement c_password =driver.findElement(By.xpath("//input[@name='c_password']"));
		c_password.sendKeys("abc@1");
		WebElement create =driver.findElement(By.xpath("//input[@value='Create']"));
		}
		finally {
			Launch.close();
	}
	}

}
