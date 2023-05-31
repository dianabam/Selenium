package Scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Poms.GooglePage;
import Poms.TAP;

public class Sesion3 {

	private WebDriver driver; 
	
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);	}
		
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.google.com/");
		GooglePage gp = new GooglePage(driver);
		TAP tap = new TAP(driver);
		Thread.sleep(3000);
		//busqueda google
		gp.typeOnSearchBar("test automation practice");
		//click en e primer resultado
		gp.clickResultById(0);
		//clicl en booton para alerta
		tap.cliclAlertButton();
		//aceptar alerta
		Thread.sleep(1000);
		tap.acceptAlert();		
		tap.printacept();//imprime acept
		tap.cliclAlertButton();
		//cancelar alerta
		Thread.sleep(1000);
		tap.cancelAlert();	
		tap.printcancel();//imprime acept
		
	}
	
	@After
	public void teardown() {
		
		driver.quit();
	}


}
