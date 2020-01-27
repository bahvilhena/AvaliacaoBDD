package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	
	
	public static WebElement element = null;


	public static WebElement novaconta(WebDriver driver) {

		element = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));

		return element;

	}
	
	public static WebElement busca_produto(WebDriver driver) {

		element = driver.findElement(By.id("autoComplete"));

		return element;

	}
	
	
	
}
