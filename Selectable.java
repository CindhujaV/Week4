package Week4day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable notifications--");
		ChromeDriver Chrome = new ChromeDriver();
		Chrome.get("https://jqueryui.com/selectable/");
		Chrome.manage().window().maximize();
		
		//Switch Frame and Action Selectable
		Chrome.switchTo().frame(0);
		Actions SelAction = new Actions(Chrome);
		WebElement Item1 = Chrome.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement Item2 = Chrome.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement Item3= Chrome.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement Item4 = Chrome.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement Item5 = Chrome.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement Item6 = Chrome.findElement(By.xpath("//li[text()='Item 6']"));
		WebElement Item7 = Chrome.findElement(By.xpath("//li[text()='Item 7']"));
		
		
	
		// Select element using KeyDown and KeyUp
		SelAction.keyDown(Keys.CONTROL).click(Item1).click(Item2).click(Item3).click(Item4).click(Item5).keyUp(Keys.CONTROL).perform();
		
		// Select element using ClickAndHold
		SelAction.clickAndHold(Item6).clickAndHold(Item7).release().perform();
		
		Thread.sleep(2000);
		Chrome.quit();
		
	}
}
		
			
		
		