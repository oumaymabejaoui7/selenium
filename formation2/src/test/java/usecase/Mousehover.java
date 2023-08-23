package usecase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		WebDriver nav = new ChromeDriver();
		nav.manage().window().maximize();
		nav.get("https://demoqa.com/menu");
		Thread.sleep(5000);
		WebElement item1;
		item1=nav.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		Actions act = new Actions(nav);
		act.moveToElement(item1).perform();

	}

}
