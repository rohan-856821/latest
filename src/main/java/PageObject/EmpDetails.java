package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmpDetails {
	public static WebElement id(WebDriver driver) {
		return driver.findElement(By.id("employee_id"));
	}
	public static WebElement firstname(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='first_name']"));
	}
	public static WebElement lastname(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='last_name']"));
	}
	public static WebElement newpassword(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='password']"));
	}
	public static WebElement confirmpassword(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='confirmpassword']"));
	}
	public static WebElement DOJ(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='date']"));
	}
	public static WebElement rateperhour(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='rateperhour']"));
	}
	public static WebElement offno(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='offno']"));
	}
	public static WebElement mobno(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='mobno']"));
	}
	public static WebElement emailid(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='emailid']"));
	}
	public static WebElement address1(WebDriver driver) {
		return driver.findElement(By.xpath("//textarea[@name='address1']"));
	}
	public static WebElement address2(WebDriver driver) {
		return driver.findElement(By.xpath("//textarea[@name='address2']"));
	}
	public static WebElement country(WebDriver driver) {
		return driver.findElement(By.xpath("//select[@id='country']"));
	}
	public static WebElement interest(WebDriver driver) {
		return driver.findElement(By.xpath("//textarea[@name='interest']"));
	}
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='submit']"));
	}

}
