package exampleCucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class authenttification {
	WebDriver driver;
	@Given("ouvrir navigateur")
	public void ouvrir_navigateur() {
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	   
	}

	@Given("ouvrir url")
	public void ouvrir_url() {
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("saisir username")
	public void saisir_username() {
		WebElement username;
		username=driver.findElement(By.name("username"));
		username.sendKeys("admin");
	   
	}

	@When("saisir mot de passe")
	public void saisir_mot_de_passe() {
		WebElement password;
		password = driver.findElement(By.name("Password"));
		password.sendKeys("admin123");
	    
	}

	@When("cliquer sur le boutton login")
	public void cliquer_sur_le_boutton_login() {
		WebElement btn;
		btn=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		btn.click();
	    
	}

	@Then("verifier le nom du profile")
	public void verifier_le_nom_du_profile() {
		WebElement profil ;
		profil=driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']"));
		String texte;
		texte=profil.getText();
		Assert.assertEquals("Abcde Aszx", texte);
        
	    System.out.println("test ok");
	    driver.close();
	   
	}

}
