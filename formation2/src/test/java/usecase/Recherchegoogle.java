package usecase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recherchegoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();
        //implicity wait
        drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        drive.get("https://www.google.com/");
        WebElement barre,ref ;
        barre=drive.findElement(By.id("APjFqb"));
        barre.sendKeys("Tunisie");
        barre.sendKeys(Keys.ENTER);
        ref=drive.findElement(By.id("result-stats"));
        //verification resultat attendu au resultat obtenu
         String ref1  ;
        ref1=ref.getText();
         if(ref1.contains("Environ")) {
        	 System.out.println("test ok");}
         else {
        	 System.out.println("test ko");
         }
	}

}
