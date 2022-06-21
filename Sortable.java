package Week4day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver Chrome = new ChromeDriver();

		Chrome.get("http://www.leafground.com/pages/sortable.html");
		Chrome.manage().window().maximize();

		WebElement Item4 = Chrome.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement Item6 = Chrome.findElement(By.xpath("//li[text()='Item 6']"));

		Actions SortAction = new Actions(Chrome);

		//Sort Element using ClickandHole and MoveTOElement
		SortAction.clickAndHold(Item6).moveToElement(Item4).release().perform();

		Thread.sleep(2000);
		Chrome.quit();
	}

}


