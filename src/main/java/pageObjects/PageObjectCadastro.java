package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectCadastro {

	public PageObjectCadastro(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement txtbx_usuario;
	
	public void enter_usuario (String usuario) {
		txtbx_usuario.sendKeys(usuario);
	}
	
	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement txtbx_email;
	
	public void enter_email(String email) {
		txtbx_email.sendKeys(email);
	}
	
	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement txtbx_senha;
	
	public void enter_senha(String senha) {
		txtbx_senha.sendKeys(senha);
	}
	
	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement txtbx_confirmasenha;
	
	public void enter_confirmasenha(String confirmasenha) {
		txtbx_confirmasenha.sendKeys(confirmasenha);
	}
	
	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement txtbx_primeironome;
	
	public void enter_primeironome(String primeironome) {
		txtbx_primeironome.sendKeys(primeironome);
	}
	
	
	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement txtbx_ultimonome;
	
	public void enter_ultimonome (String ultimonome) {
		txtbx_ultimonome.sendKeys(ultimonome);
	}
	
	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement txtbx_telefone;
	
	public void enter_telefone (String telefone) {
		txtbx_telefone.sendKeys(telefone);
	}
	
	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement slc_pais;
	
	public void enter_pais(String pais) {
		Select oSelect = new Select(slc_pais);
		oSelect.selectByVisibleText("Brazil");
		
	}
	
	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement txtbx_cidade;
	
	public void enter_cidade(String cidade) {
		txtbx_cidade.sendKeys(cidade);
	}
	
	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement txtbx_endereco;
	
	public void enter_endereco(String endereco) {
		txtbx_endereco.sendKeys(endereco);
	}
	
	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement txtbx_estado;
	
	public void enter_estado(String estado) {
		txtbx_estado.sendKeys(estado);
	}
	
	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement txtbx_codigopostal;
	
	public void enter_codigopostal(String codigopostal) {
		txtbx_codigopostal.sendKeys(codigopostal);
	}
	
	@FindBy(how = How.CSS , using = "div#formCover > sec-view > div > input")
	private WebElement btn_aceite;
	
	public void aceite() {
		btn_aceite.click();
	}
	
	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btn_registra;
		
	public void registra() {
		btn_registra.click();
	}
	
	public void dadospreenchimentocorreto() {
		
		enter_usuario("braulio");
		enter_email("braulio@teste4.com");
		enter_senha("Abc123");
		enter_confirmasenha("Abc123");
		enter_primeironome("braulio");
		enter_ultimonome("vilhena");
		enter_telefone("123453");
		enter_pais("brazil");
		enter_cidade("sao paulo");
		enter_endereco("rua mana");
		enter_estado("sao paul");
		enter_codigopostal("2323232");
		aceite();
				
		
	}

	public void dadospreenchimentoincorreto() {
		
		enter_usuario("braulio");
		enter_email("braulio@teste4.com");
		enter_senha("abc123");
		enter_confirmasenha("abc123");
		enter_primeironome("braulio");
		enter_ultimonome("vilhena");
		enter_telefone("123453");
		enter_pais("brazil");
		enter_cidade("sao paulo");
		enter_endereco("rua mana");
		enter_estado("sao paul");
		enter_codigopostal("2323232");
		aceite();
				
		
	}
	
}
