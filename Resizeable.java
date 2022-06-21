package Week4day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Resizeable {

	public static void takeScreenShot(ChromeDriver chrome) throws IOException {
		File source = chrome.getScreenshotAs(OutputType.FILE);
		File desc = new File("./screenshots/Resize.png");
		FileUtils.copyFile(source, desc);
		
	}
		
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Chrome setup and Disable notifications
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver Chrome = new ChromeDriver();
		Chrome.get("https://jqueryui.com/resizable");
		Chrome.manage().window().maximize();
		
		//Switch to frame
		Chrome.switchTo().frame(0);
		Thread.sleep(2000);
		
		//Performing Resize
		WebElement ResizeEle = Chrome.findElement(By.xpath("//div[@class=\'ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\']"));
		Actions ResizeAction = new Actions(Chrome);
		ResizeAction.clickAndHold(ResizeEle).moveByOffset(100, 50).release(ResizeEle).build().perform();
		Thread.sleep(1000);
		
		//Screenshot of Resize
		takeScreenShot(Chrome);
		
		
		Chrome.quit();
		
		

	}

	}
