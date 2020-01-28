package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	public static WebElement mouse(WebDriver driver) throws InterruptedException {
		Thread.sleep(10000);
		element = driver.findElement(By.id("miceImg"));
		element.click();
		return element;
	}

	public static WebElement mouse_azul(WebDriver driver) throws InterruptedException {
		Thread.sleep(10000);
		element = driver.findElement(By.id("virtualFooter"));
		driver.findElement(By.id("32")).click();
		// assertTrue(driver.findElement(By.id("32")).isEnabled());
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("save_to_cart")));
		return element;
	}

	public static WebElement outros_produtos(WebDriver driver) throws Exception {
		Thread.sleep(10000);
		driver.findElement(By.id("details_10")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mainImg")));

		return element;
	}

}
