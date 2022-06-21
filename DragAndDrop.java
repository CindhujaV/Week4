package Week4day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		//Chrome Setup and Disable Notifications
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver Chrome = new ChromeDriver();
		Chrome.get("http://www.leafground.com/pages/drop.html");
		Chrome.manage().window().maximize();

		//Actions - Drag and Drop
		WebElement DragEle = Chrome.findElement(By.id("draggable"));
		WebElement DropEle = Chrome.findElement(By.id("droppable"));
		Actions DragAction = new Actions(Chrome);
		DragAction.dragAndDrop(DragEle, DropEle).perform();
		Thread.sleep(2000);
		Chrome.close();

		//Actions - DragandDropBy
		WebDriverManager.chromedriver().setup();
		ChromeOptions options1 = new ChromeOptions();
		options1.addArguments("--disable-notifications");
		ChromeDriver Chrome1 = new ChromeDriver();
		Chrome1.get("http://www.leafground.com/pages/drop.html");
		Chrome1.manage().window().maximize();
		WebElement DragEle1 = Chrome1.findElement(By.id("draggable"));
		WebElement DropEle1 = Chrome1.findElement(By.id("droppable"));
		Actions DropAction = new Actions(Chrome1);
		DropAction.dragAndDropBy(DragEle1, 100, 100).perform();
		//Thread.sleep(3000);
		Chrome.close();

		//Assigning value to x and y
		/*int x= DragEle1.getLocation().getX();
		int y = DragEle1.getLocation().getY();
		DropAction.dragAndDropBy(DragEle1, x+100, y+100).perform();*/

	}

}
