package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import pageObjects.PageObjectBusca;

public class StepsBusca {

	PageObjectBusca pageobjectbusca;
	public static WebDriver driver;

	@Dado("^clico no produto com sucesso$")
	public void clico_no_produto_com_sucesso() throws Throwable {

		pageobjectbusca.clicaProduto();
		driver.quit();
	}

	@Dado("^clico em um produto e localiza outro$")
	public void clico_em_um_produto_e_localiza_outro() throws Throwable {

		pageobjectbusca.clicaDetalhe();
		driver.quit();
	}
}
