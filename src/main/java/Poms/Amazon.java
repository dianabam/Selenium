package Poms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	WebDriver driver;
	String Amazon  = "//*[@id=\"tads\"]/div/div/div/div/div[1]/a/div[1]/span";
	String BarraAmazon = "//*[@id=\"twotabsearchtextbox\"]";
	String SelectSamsung = "//*[@id=\"p_89/SAMSUNG\"]/span/a/span";
	String OrdenarPrecio = "//*[@id=\"s-result-sort-select\"]";
	String Primer = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[2]/div[1]/h2";
	
	public Amazon(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void clickFirstResult() {//CLICK Amazon 
		WebElement fr = driver.findElement(By.xpath(Amazon));
		fr.click();
	}
	
	public void AmazonBar(String value) {//buscar en la barra de amazon
		WebElement searchBar = driver.findElement(By.xpath(BarraAmazon));
		searchBar.sendKeys(value);
		searchBar.sendKeys(Keys.ENTER);
	}
	
	public void samsung() {//CLICK Amazon 
		WebElement fr = driver.findElement(By.xpath(SelectSamsung));
		fr.click();
	}
	
	public String SeleccionaMenor(int option) {//Seleccionar de menor a mayor precio
		String value = "";
		Select cb = new Select(this.driver.findElement(By.xpath(OrdenarPrecio)));
		cb.selectByIndex(option);
		return value;
	}
	
	public void ImprimeCelular() {
		WebElement fr = driver.findElement(By.xpath(Primer));
		System.out.println(fr.getText());
				
	}
	
}
