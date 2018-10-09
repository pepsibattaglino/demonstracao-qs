package senac.demonstracao.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroObject {
	private WebDriver driver;

	public CadastroObject (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//pagina home
	@FindAll({
		@FindBy(className = "login"),
		@FindBy(css = "div[text='Sign in']")
	})
	public WebElement siginButton;
	
	//pagina login
	@FindAll({
		@FindBy(id = "email_create"),
		@FindBy(name = "email_create")
	})
	public WebElement emailCreateAccountTextField;
	
	@FindAll({
		@FindBy(id = "SubmitCreate"),
		@FindBy(name = "SubmitCreate")
	})
	public WebElement createAnAccountButton;	
	
	//pagina criar conta
	@FindAll({
		@FindBy(id = "id_gender1"),
		@FindBy(name = "id_gender1")
	})
	public WebElement genderMaleRadio;
	
	@FindAll({
		@FindBy(id = "id_gender2"),
		@FindBy(name = "id_gender2")
	})
	public WebElement genderFemaleRadio;
	
	@FindAll({
		@FindBy(id = "customer_firstname"),
		@FindBy(name = "customer_firstname")
	})
	public WebElement customerFirstNameTextField;
	
	@FindAll({
		@FindBy(id = "customer_lastname"),
		@FindBy(name = "customer_lastname")
	})
	public WebElement customerLastNameTextField;
	
	@FindAll({
		@FindBy(id = "email"),
		@FindBy(name = "email")
	})
	public WebElement emailTextField;
	
	@FindAll({
		@FindBy(id = "passwd"),
		@FindBy(name = "passwd")
	})
	public WebElement passwordTextField;
	
	@FindAll({
		@FindBy(id = "days"),
		@FindBy(name = "days")
	})
	public WebElement daysSelector;
	
	@FindAll({
		@FindBy(id = "months"),
		@FindBy(name = "months")
	})
	public WebElement monthsSelector;
	
	@FindAll({
		@FindBy(id = "years"),
		@FindBy(name = "years")
	})
	public WebElement yearsSelector;
	
	@FindAll({
		@FindBy(id = "newsletter"),
		@FindBy(name = "newsletter")
	})
	public WebElement newsletterCheckBox;
	
	@FindAll({
		@FindBy(id = "optin"),
		@FindBy(name = "optin")
	})
	public WebElement specialOffesCheckBox;
	
	@FindAll({
		@FindBy(id = "firstname"),
		@FindBy(name = "firstname")
	})
	public WebElement firstNameTextField;
	
	@FindAll({
		@FindBy(id = "lastname"),
		@FindBy(name = "lastname")
	})
	public WebElement lastNameTextField;
	
	@FindAll({
		@FindBy(id = "company"),
		@FindBy(name = "company")
	})
	public WebElement companyTextField;
	
	@FindAll({
		@FindBy(id = "address1"),
		@FindBy(name = "address1")
	})
	public WebElement addressLineOneTextField;
	
	@FindAll({
		@FindBy(id = "address2"),
		@FindBy(name = "address2")
	})
	public WebElement addressLineTwoTextField;
	
	@FindAll({
		@FindBy(id = "city"),
		@FindBy(name = "city")
	})
	public WebElement cityTextField;
	
	@FindAll({
		@FindBy(id = "id_state"),
		@FindBy(name = "id_state")
	})
	public WebElement stateSelector;
	
	@FindAll({
		@FindBy(id = "postcode"),
		@FindBy(name = "postcode")
	})
	public WebElement postcodeTextField;
	
	@FindAll({
		@FindBy(id = "id_country"),
		@FindBy(name = "id_country")
	})
	public WebElement countrySelector;
	
	@FindAll({
		@FindBy(id = "other"),
		@FindBy(name = "other")
	})
	public WebElement additionalInfoTextField;
	
	@FindAll({
		@FindBy(id = "phone"),
		@FindBy(name = "phone")
	})
	public WebElement homePhoneTextField;
	
	@FindAll({
		@FindBy(id = "phone_mobile"),
		@FindBy(name = "phone_mobile")
	})
	public WebElement mobilePhoneTextField;
	
	@FindAll({
		@FindBy(id = "alias"),
		@FindBy(name = "alias")
	})
	public WebElement adressAliasTextField;
	
	@FindAll({
		@FindBy(id = "submitAccount"),
		@FindBy(name = "submitAccount")
	})
	public WebElement submitAccountButton;
		
	public WebDriver getDriver() {
		return driver;
	}

}
