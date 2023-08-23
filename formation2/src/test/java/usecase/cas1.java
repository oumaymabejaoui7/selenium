package usecase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cas1 {

	public static void main(String[] args) throws InterruptedException {
		// chemin chrome driver
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
        //ouverture driver
		WebDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		//ouvrir url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//sleep
		Thread.sleep(5000);
		//identification des elements
		WebElement username ,password,login;
		username = driver.findElement(By.name("Username"));
		password = driver.findElement(By.name("Password"));
		login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		//action
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		login.click();
		//resultat attendu(verification de resultat)
		WebElement profil ;
		profil=driver.findElement(By.xpath("/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String texte;
		texte=profil.getText();
        Assert.assertEquals("MosesSagar", texte);
	    System.out.println("test ok");
	    driver.close();
	    
	}

}
