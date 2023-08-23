package usecase;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		WebDriver drag = new ChromeDriver();
		drag.manage().window().maximize();
		drag.get("\\https://demoqa.com/buttons\\");
		Thread.sleep(5000);
		WebElement dragme,drop,message ;
		dragme=drag.findElement(By.id("draggable"));
		drop=drag.findElement(By.id("droppable"));
		Actions act= new Actions(drag);
		act.dragAndDrop(dragme, drop).perform();
		
		String texte,texte1;
		texte=drop.getText();
		texte1= "dropped";
		
		
		Assert.assertEquals(texte1,texte);
		System.out.println("Test ok");
		drag.close();
				
		
      
	}

}
