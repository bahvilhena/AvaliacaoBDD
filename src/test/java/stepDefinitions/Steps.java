package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import pageObjects.Cadastro;
import pageObjects.DriverFactory;

public class Steps {
	
	Cadastro cadastro;
	
	public static WebDriver driver;
	
	
	
	@Dado("^que entro na pagina de registro$")
	public void que_entro_na_pagina_de_registro() throws Throwable {
		
		driver = DriverFactory.inicializarChromeCadastro();
						
	}

	@Quando("^preencho todos campos do formulario$")
	public void preencho_todos_campos_do_formulario() throws Throwable {
		
		cadastro = new Cadastro(driver);
		cadastro.dadospreenchimentocorreto();
		

	}

	@Quando("^sou registrado com sucesso$")
	public void sou_registrado_com_sucesso() throws Throwable {
		
		cadastro.registra();
		driver.quit();
//		List<WebElement> registra = driver.findElements(By.id("register_btnundefined"));
//		registra.get(0).click();
	}

	@Quando("^preencho todos campos do formulario com erro$")
	public void preencho_todos_campos_do_formulario_com_erro() throws Throwable {
	    
		cadastro = new Cadastro(driver);
		cadastro.dadospreenchimentoincorreto();
	}

	@Quando("^não consigo registrar$")
	public void não_consigo_registrar() throws Throwable {
	  
		cadastro.registra();
		driver.quit();
	}


	
	
}
