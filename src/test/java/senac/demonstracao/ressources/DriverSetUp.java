package senac.demonstracao.ressources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp {
	public WebDriver driver;
	
	public void setUpDriver(String browserName, String url){
		
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}else if(browserName.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		iniciaBrowser(url);
	}
	
	private void iniciaBrowser(String url) {
		getDriver().get(url);
	}
	
	public WebDriver getDriver(){
		return driver;
	}
}
