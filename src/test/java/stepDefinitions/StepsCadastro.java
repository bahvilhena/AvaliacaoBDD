package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Screenshoot;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageObjects.DriverFactory;
import pageObjects.PageObjectCadastro;

public class StepsCadastro {

	WebDriver driver;
	PageObjectCadastro cadastro;

	@Dado("^que entro na pagina de registros$")
	public void que_entro_na_pagina_de_registros() throws Throwable {
		driver = DriverFactory.inicializarChromeCadastro();
		cadastro = PageFactory.initElements(driver, PageObjectCadastro.class);
	}

	@Quando("^eu preencho todos campos do formulario$")
	public void eu_preencho_todos_campos_do_formulario() throws Throwable {
		cadastro.dadospreenchimentocorreto();
	}

	@Entao("^vai registrar com sucesso$")
	public void vai_registrar_com_sucesso() throws Throwable {
		cadastro.promotion();
		cadastro.aceite();
		Assert.assertTrue(driver.findElement(By.cssSelector("div#formCover > sec-view > div > input")).isSelected());
		cadastro.registra();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menuUserLink\"]/span[1]")));
		Screenshoot.getScreenshot(driver);
		driver.quit();
	}

	@Quando("^preencho todos os campos do formulario com erro$")
	public void preencho_todos_os_campos_do_formulario_com_erro() throws Throwable {
		cadastro.dadospreenchimentoincorreto();
	}

	@Entao("^nao consigo registrar o usuario$")
	public void nao_consigo_registrar_o_usuario() throws Throwable {
		cadastro.promotion();
		cadastro.aceite();
		Assert.assertTrue(driver.findElement(By.cssSelector("div#formCover > sec-view > div > input")).isSelected());
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"registerPage\"]/article[1]/sec-form[1]/div[2]/sec-sender[1]")));
		Screenshoot.getScreenshot(driver);
		driver.quit();
	}

}
