package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectBusca {

	WebDriver driver;

	public PageObjectBusca(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "miceImg")
	private WebElement mouse;

	@FindBy(how = How.ID, using = "32")
	private WebElement mouseazul;

	@FindBy(how = How.XPATH, using = "//*[@id=\"details_10\"]")
	private WebElement Elitebook;

	public void categoria() {
		// mouse.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", mouse);

	}

	public void clicaProduto() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", mouseazul);

	}

	public void clicaDetalhe() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Elitebook);

	}

}