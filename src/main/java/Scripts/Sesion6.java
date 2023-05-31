package Scripts;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Poms.Amazon;
import Poms.GooglePage;
import Poms.TAP;

public class Sesion6 {
	
private WebDriver driver; 
	
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);	}
		
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://testautomationpractice.blogspot.com/");
		GooglePage gp = new GooglePage(driver);
		gp.clickwiki();
		gp.clickwiki();	
		gp.clickwiki();
		gp.clickwiki();	
		ArrayList<String> tabs1= new ArrayList<String>(driver.getWindowHandles());//se hace lista de pestañas		
		driver.switchTo().window(tabs1.get(0));
		driver.switchTo().window(tabs1.get(1));
		driver.get("https://www.bbva.mx/");
		driver.switchTo().window(tabs1.get(2));
		driver.get("https://www.gandhi.com.mx/");
		driver.switchTo().window(tabs1.get(3));
		driver.get("https://store.steampowered.com/?l=spanish");
		driver.switchTo().window(tabs1.get(4));
		driver.get("https://www.youtube.com/");
		
		ArrayList<String> tabs2= new ArrayList<String>(driver.getWindowHandles());
		for (int i = 0; i < tabs2.size(); i++ ) {			
			driver.switchTo().window(tabs2.get(i));
				if (driver.getTitle().equals("Bienvenidos a Steam")) {
					System.out.println(driver.getTitle());
					break;
				}

		}
		
	}
	
	@After
	public void teardown() {
		
		//driver.quit();
	}


}
