package senac.demonstracao.tasks;

import org.openqa.selenium.WebDriver;
import senac.demonstracao.objects.CadastroObject;

public class CadastroTask extends CadastroObject {
	
	public CadastroTask(WebDriver driver) {
		super(driver);
	}
	
	public void espera() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clicarNoBotaoSignin() {
		espera();
		siginButton.click();
	}
	
	public void preencherCampoEmailCriar(String email) {
		emailCreateAccountTextField.sendKeys(email);
	}
	
	public void clicarNoBotaoCriarConta() {
		espera();
		createAnAccountButton.click();
	}
	
	public void clicarNoBotaoMr() {
		genderMaleRadio.click();
	}
	
	public void clicarNoBotaoMrs() {
		genderFemaleRadio.click();
	}
	
	public void preencherCampoNomeUsuario(String nomeUsuario) {
		customerFirstNameTextField.sendKeys(nomeUsuario);
	}
	
	public void preencherCampoSobrenomeUsuario(String sobrenomeUsuario) {
		customerLastNameTextField.sendKeys(sobrenomeUsuario);
	}
	
	public void preencherCampoEmail(String email) {
		emailTextField.clear();
		emailTextField.sendKeys(email);
	}
	
	public void preencherCampoSenha(String senha){
		passwordTextField.sendKeys(senha);
	}//TODO campo com no minimo 5 caracteres
	
	public void selecionarDiaNascimento(String dia) {
		//Select combobox = new Select(daysSelector);
		//combobox.selectByValue(dia);
		daysSelector.sendKeys(dia);
	}
	
	public void selecionarMesNascimento(String mes) {
		monthsSelector.sendKeys(mes);
	}
	
	public void selecionarAnoNascimento(String ano) {
		yearsSelector.sendKeys(ano);
	}
	
	public void selecionarOpcaoNoticias() {
		newsletterCheckBox.click();
	}
	
	public void selecionarOpcaoOfertas() {
		specialOffesCheckBox.click();
	}
	
	public void preencherCampoNome(String nome) {
		firstNameTextField.clear();
		firstNameTextField.sendKeys(nome);
	}
	
	public void preencherCampoSobrenome(String sobrenome) {
		lastNameTextField.clear();
		lastNameTextField.sendKeys(sobrenome);
	}
	
	public void preencherCampoEmpresa(String empresa) {
		companyTextField.sendKeys(empresa);
	}
	
	public void preencherCampoEndereco(String endereco) {
		addressLineOneTextField.sendKeys(endereco);
	}
	
	public void preencherCampoEnderecoDois(String endereco2) {
		addressLineTwoTextField.sendKeys(endereco2);
	}
	
	public void preencherCampoCidade(String cidade) {
		cityTextField.sendKeys(cidade);
	}
	
	public void selecionarEstado(String estado) {
		stateSelector.sendKeys(estado);
	}
	
	public void preencherCampoCodPostal(String codPostal) {
		postcodeTextField.sendKeys(codPostal);
	}
	
	public void selecionarPais(String pais) {
		countrySelector.sendKeys(pais);
	}
	
	public void preencherCampoMaisInfo(String info) {
		additionalInfoTextField.sendKeys(info);
	}
	
	public void preencherCampoTelefoneCasa(String telCasa) {
		homePhoneTextField.sendKeys(telCasa);
	}
	
	public void preencherCampoTelefoneCelular(String telCelular) {
		mobilePhoneTextField.sendKeys(telCelular);
	}
	
	public void preencherCampoPseudonimoEndereco(String pseudonimo) {
		adressAliasTextField.clear();
		adressAliasTextField.sendKeys(pseudonimo);
	}
	
	public void clicarNoBotaoRegistrar() {
		espera();
		submitAccountButton.click();
	}
	
	public void limparTodosOsCamposFormularioCadastro() {
		espera();
		customerFirstNameTextField.clear();
		customerLastNameTextField.clear();
		emailTextField.clear();
		passwordTextField.clear();
		firstNameTextField.clear();
		lastNameTextField.clear();
		companyTextField.clear();
		addressLineOneTextField.clear();
		addressLineTwoTextField.clear();
		cityTextField.clear();
		postcodeTextField.clear();
		additionalInfoTextField.clear();
		homePhoneTextField.clear();
		mobilePhoneTextField.clear();
		adressAliasTextField.clear();
	}
	
	public void irParaFormularioDeCadastro(String email) {
		clicarNoBotaoSignin();
		preencherCampoEmailCriar(email);
		clicarNoBotaoCriarConta();
	}
	
	public void preencherFormularioCadastro(String nomeUsuario, String sobrenomeUsuario, String email, String senha, String dia, String mes, String ano, String nome, String sobrenome, String empresa, String endereco, String endereco2, String cidade, String estado, String codPostal, String pais, String info, String telCasa, String telCelular, String pseudonimo) {
		espera();
		clicarNoBotaoMr();
		preencherCampoNomeUsuario(nomeUsuario);
		preencherCampoSobrenomeUsuario(sobrenomeUsuario);
		preencherCampoEmail(email);
		preencherCampoSenha(senha);
		selecionarDiaNascimento(dia);
		selecionarMesNascimento(mes);
		selecionarAnoNascimento(ano);
		selecionarOpcaoNoticias();
		selecionarOpcaoOfertas();
		preencherCampoNome(nome);
		preencherCampoSobrenome(sobrenome);
		preencherCampoEmpresa(empresa);
		preencherCampoEndereco(endereco);
		preencherCampoEnderecoDois(endereco2);
		preencherCampoCidade(cidade);
		selecionarEstado(estado);
		preencherCampoCodPostal(codPostal);
		selecionarPais(pais);
		preencherCampoMaisInfo(info);
		preencherCampoTelefoneCasa(telCasa);
		preencherCampoTelefoneCelular(telCelular);
		preencherCampoPseudonimoEndereco(pseudonimo);
	}
	
}