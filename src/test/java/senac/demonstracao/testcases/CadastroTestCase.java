package senac.demonstracao.testcases;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import senac.demonstracao.ressources.DriverSetUp;
import senac.demonstracao.tasks.CadastroTask;

public class CadastroTestCase extends DriverSetUp {
	
	private CadastroTask cadastroTask;
	
	@Before
	public void setUpTest() {
		setUpDriver("chrome", "http://automationpractice.com/index.php");
		getDriver().manage().window().maximize();
		cadastroTask = new CadastroTask(getDriver());
	}
	
	//Método comentado porque após a promeira execução acaba quebrando devido ao email que resulta já cadastrado.
	/*
	@Test
	public void cadastroSucesso() {
		cadastroTask.irParaFormularioDeCadastro("emailaleatorio651243@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"kjkjghdrse@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Aglumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre", 
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
		);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("My account"));
	}
	*/
	
	@Test
	public void cadastroTodosOsCamposVazios() {
		cadastroTask.irParaFormularioDeCadastro("nonlosopiucosadevoscrivere@email.com");
		cadastroTask.limparTodosOsCamposFormularioCadastro();
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("There are 10 errors"));
	}
	
	@Test
	public void cadastroNomeUsuarioVazio() {
		cadastroTask.irParaFormularioDeCadastro("naopassa1@email.com");
		cadastroTask.preencherFormularioCadastro(
				"", 
				"Algumacoisa", 
				"naopassa1@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Aglumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre", 
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>firstname</b> is required."));
	}
	
	@Test
	public void cadastroNomeUsuarioInvalido() {
		cadastroTask.irParaFormularioDeCadastro("naopassa2@email.com");
		cadastroTask.preencherFormularioCadastro(
				"123456", 
				"Algumacoisa", 
				"naopassa2@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Aglumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre", 
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>firstname</b> is invalid."));
	}
	
	@Test
	public void cadastroSobrenomeUsuarioVazio() {
		cadastroTask.irParaFormularioDeCadastro("naopassa3@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"", 
				"naopassa3@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Aglumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre", 
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>lastname</b> is required."));
	}
	
	@Test
	public void cadastroSobrenomeUsuarioInvalido() {
		cadastroTask.irParaFormularioDeCadastro("naopassa4@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"123456", 
				"naopassa4@email.comm", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Aglumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre", 
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>lastname</b> is invalid."));
	}
	
	@Test
	public void cadastroEmailVazio() {
		cadastroTask.irParaFormularioDeCadastro("naopassa5@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Aglumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre", 
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>email</b> is required."));
	}
	
	@Test
	public void cadastroEmailInvalido() {
		cadastroTask.irParaFormularioDeCadastro("naopassa6@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"este é um email errado", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Aglumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre", 
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>email</b> is invalid."));
	}
	
	@Test
	public void cadastroSenhaVazia() {
		cadastroTask.irParaFormularioDeCadastro("naopassa7@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"naopassa7@email.com", 
				"", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Aglumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre", 
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>passwd</b> is required."));
	}
	
	@Test
	public void cadastroSenhaInvalida() {
		cadastroTask.irParaFormularioDeCadastro("naopassa8@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"naopassa8@email.com", 
				"123", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Aglumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre", 
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>passwd</b> is invalid."));
	}
	
	@Test
	public void cadastroNomeVazio() {
		cadastroTask.irParaFormularioDeCadastro("naopassa9@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"naopassa9@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"", 
				"Aglumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre", 
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>firstname</b> is required."));
	}
	
	@Test
	public void cadastroNomeInvalido() {
		cadastroTask.irParaFormularioDeCadastro("naopassa10@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"naopassa10@email.com", 
				"senha1",
				"1", 
				"Jennuary", 
				"2000", 
				"123456", 
				"Aglumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre", 
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>firstname</b> is invalid."));
	}
	
	@Test
	public void cadastroSobrenomeVazio() {
		cadastroTask.irParaFormularioDeCadastro("naopassa11@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Aglumacoisa", 
				"naopassa11@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre", 
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>lastname</b> is required."));
	}
	
	@Test
	public void cadastroSobrenomeInvalido() {
		cadastroTask.irParaFormularioDeCadastro("naopassa12@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"naopassa12@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"123456", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre", 
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>lastname</b> is invalid."));
	}
	
	@Test
	public void cadastroEnderecoVazio() {
		cadastroTask.irParaFormularioDeCadastro("naopassa13@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"naopassa13@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Algumacoisa", 
				"Ilegra", 
				"", 
				"Casa", 
				"Porto Alegre", 
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>address1</b> is required."));
	}
	
	@Test
	public void cadastroCidadeVazia() {
		cadastroTask.irParaFormularioDeCadastro("naopassa15@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"naopassa15@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Algumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"",
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>city</b> is required."));
	}	
	
	@Test
	public void cadastroEstadoVazio() {
		cadastroTask.irParaFormularioDeCadastro("naopassa17@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"naopassa17@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Algumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre",
				"", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("This country requires you to choose a State."));
	}	
	
	@Test
	public void cadastroEstadoInvalido() {
		cadastroTask.irParaFormularioDeCadastro("naopassa18@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"naopassa18@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Algumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre",
				"Estado que não existe", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("This country requires you to choose a State."));
	}	
	
	@Test
	public void cadastroCodPostalVazio() {
		cadastroTask.irParaFormularioDeCadastro("naopassa19@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"naopassa19@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Algumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre",
				"Georgia", 
				"", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("The Zip/Postal code you've entered is invalid. It must follow this format: 00000"));
	}	
	
	@Test
	public void cadastroCodPostalInvalido() {
		cadastroTask.irParaFormularioDeCadastro("naopassa20@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"naopassa20@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Algumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre",
				"Georgia", 
				"Cod postal errado", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("The Zip/Postal code you've entered is invalid. It must follow this format: 00000"));
	}
	
	@Test
	public void cadastroCelularInvalido() {
		cadastroTask.irParaFormularioDeCadastro("naopassa24@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"naopassa24@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Algumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre",
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"Celular inválido", 
				"Minha casa"
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>phone_mobile</b> is invalid."));
	}
	
	@Test
	public void cadastroPseudonimoVazio() {
		cadastroTask.irParaFormularioDeCadastro("naopassa245@email.com");
		cadastroTask.preencherFormularioCadastro(
				"Beltrano", 
				"Algumacoisa", 
				"naopassa245@email.com", 
				"senha1", 
				"1", 
				"Jennuary", 
				"2000", 
				"Beltrano", 
				"Algumacoisa", 
				"Ilegra", 
				"Rua Bem Ali, 1", 
				"Casa", 
				"Porto Alegre",
				"Georgia", 
				"12345", 
				"United States", 
				"Esta é uma informação relevante", 
				"12345678", 
				"87654321", 
				""
				);
		cadastroTask.clicarNoBotaoRegistrar();
		cadastroTask.espera();
		assertTrue(getDriver().getPageSource().contains("<b>alias</b> is required."));
	}	

	@After
	public void tearDown() {
		getDriver().quit();
	}

}
