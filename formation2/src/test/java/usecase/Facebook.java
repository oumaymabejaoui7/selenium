package usecase;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
	        WebDriver drive = new ChromeDriver();
	        drive.manage().window().maximize();
	        
	        drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	        drive.get("https://www.facebook.com/");
	        
	        WebElement boutton,nom,prenom,num,mdp,jour,mois,année,femme,homme,personnel;
	        boutton=drive.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
	        boutton.click();
	        nom=drive.findElement(By.xpath("//input[@placeholder='Prénom']"));
	        prenom=drive.findElement(By.xpath("//input[@name='lastname']"));
	        num=drive.findElement(By.xpath("//input[@name='reg_email__']"));
	        mdp=drive.findElement(By.xpath("//input[@name='reg_passwd__']"));
	        jour=drive.findElement(By.id("day"));
	        mois=drive.findElement(By.id("month"));
	        année=drive.findElement(By.id("year"));
	        femme=drive.findElement(By.xpath("//label[normalize-space()='Femme']"));
	        homme=drive.findElement(By.xpath("//label[normalize-space()='Homme']"));
	        personnel=drive.findElement(By.xpath("//label[normalize-space()='Personnalisé']"));
	        nom.sendKeys("amal");
	        prenom.sendKeys("bejaoui");
	        num.sendKeys("21586686");
	        mdp.sendKeys("oumayabejaoui6@gmail.com");
	         Select slct = new Select (jour);
	         slct.selectByValue("7");
	         Select slct1 = new Select (mois);
	         slct1.selectByValue("10");
	         Select slct2 = new Select(année);
	         slct2.selectByValue("2001");
	         femme.click();
	        
	        
	        
	      //  act.contextCl
		

	}

}
