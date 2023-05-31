package Scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Poms.GooglePage;

public class Sesion2 {

	
	WebDriver driver; 
	
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);	
		
	
	}
		
	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.google.com/");
		GooglePage gp = new GooglePage(driver);
		Thread.sleep(3000);
		//busqueda google
		gp.typeOnSearchBar("Wikipedia");
		//click en primer resultado
		//gp.clickFirstResult();// funcion
		Thread.sleep(3000);
		//gp.printFirstResult();//funcion
		gp.clickResultById(1);
		//gp.printTitle();
		gp.print3();
		gp.print2();
		gp.print1();
	}
	
	@After
	public void teardown() {
		
		driver.quit();
	}

	public Sesion2() {
		// TODO Auto-generated constructor stub
	}

}
