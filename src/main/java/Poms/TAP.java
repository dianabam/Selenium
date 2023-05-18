package Poms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TAP {

	WebDriver driver;
	String alertButtonXpath  = "//button[text()='Click Me']";
	String imprimeAcept = "//*[@id=\"demo\"]";
	String imprimeCancel = "//*[@id=\"demo\"]";
	 
	public TAP(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public  void cliclAlertButton() {//click en el boton
		WebElement button= this.driver.findElement(By.xpath(this.alertButtonXpath));
		button.click();
	}

	
	public void acceptAlert() { //acepta en la alerta		
		this.driver.switchTo().alert().accept();
	}

	public void printacept() {//imprime texto
		List <WebElement> list = driver.findElements(By.xpath(imprimeAcept));
		
		for(WebElement element: list) {
			System.out.println(element.getText());
		}
	}
	
	public void cancelAlert() { //cancel en la alerta		
		this.driver.switchTo().alert().dismiss();
	}

	public void printcancel() {//imprime texto
		List <WebElement> list = driver.findElements(By.xpath(imprimeCancel));
		
		for(WebElement element: list) {
			System.out.println(element.getText());
		}
	}
}
