package usecase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubi
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		WebDriver click = new ChromeDriver ();
		click.manage().window().maximize();
		click.get("https://demoqa.com/buttons");
		Thread.sleep(5000);
		WebElement dclick,rclick;
		dclick=click.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		rclick=click.findElement(By.id("rightClickBtn"));
		Actions act =new Actions(click);
		act.doubleClick(dclick).perform();
		act.contextClick(rclick).perform();
		WebElement message1,message2;
		String texte1,texte2;
		message1=click.findElement(By.id("doubleClickMessage"));
		message2=click.findElement(By.id("rightClickMessage"));
		texte1=message1.getText();
		texte2=message2.getText();
		Assert.assertEquals("you have done a double click", texte1);
	
		
		

	}

}
