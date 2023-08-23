package usecase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
       WebDriver list = new ChromeDriver();
       list.manage().window().maximize();
       list.get("https://demoqa.com/select-menu");
       list.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
       WebElement listelement ;
       listelement= list.findElement(By.id("oldSelectMenu"));
       Select slct =new Select(listelement);
       slct.selectByValue("7");
       
	}

}
