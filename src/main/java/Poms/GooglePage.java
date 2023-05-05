package Poms;//page object model, son clases que representan paginas

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {

	WebDriver driver;
	String searchBarId = "APjFqb";
	String firstResult= "//h3[text()='Nintendo - Wikipedia']";
	String SecondResult= "//*[@id='firstHeading']/span";
	
	public GooglePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public GooglePage() {
		
	}

	public void typeOnSearchBar(String value) {
		
		WebElement searchBar = driver.findElement(By.id(searchBarId));
		searchBar.sendKeys(value);
		searchBar.sendKeys(Keys.ENTER);
	}
	public void clickFirstResult() {
		WebElement fr = driver.findElement(By.xpath(firstResult));
		fr.click();
	}
	
	public void printFirstResult() {
		WebElement fr = driver.findElement(By.xpath(SecondResult));
		System.out.println(fr.getText());
				
	}
}
