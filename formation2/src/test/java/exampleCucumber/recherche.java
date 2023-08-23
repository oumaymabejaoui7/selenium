package exampleCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class recherche {
	WebDriver ddriver;
	@Given("ouvrir nnavigateur")
	public void ouvrir_nnavigateur() {
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		ddriver = new ChromeDriver();
		ddriver.manage().window().maximize();
		ddriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	   
	}

	@Given("ouvrir url de google {string}")
	public void ouvrir_url_de_google(String string) {
		ddriver.get(string);
	    
	}

	@When("saisir le nom de pays {string}")
	public void saisir_le_nom_de_pays(String string) {
		WebElement barre;
		barre=ddriver.findElement(By.name("q"));
		barre.sendKeys(string);
		
	    
	}

	@When("cliquer sur entrer")
	public void cliquer_sur_entrer() {
		WebElement barre;
		barre=ddriver.findElement(By.name("q"));
		barre.sendKeys(Keys.ENTER);
		
	   
	}

	@Then("verifier le resultat que la phrase contient {string}")
	public void verifier_le_resultat_que_la_phrase_contient(String string) {
		WebElement texte;
		texte=ddriver.findElement(By.id("result-stats"));
		String message ;
		message=texte.getText();
		if(message.contains(string)) {
			System.out.println("Test ok");
		}
		else 
			System.out.println("test ko");
		
	    
	}


	
	   
	}

	
	



