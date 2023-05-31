package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement amount = driver.findElement(By.xpath("(//li[@id='fourth']//a[@class='button button-orange'])[2]"));
		WebElement targetLocation = driver.findElement(By.xpath("//ol[@id='amt7']//li"));
		action.dragAndDrop(amount,targetLocation).perform();
		
		WebElement bank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']//a[@class='button button-orange']"));
		WebElement account = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		action.dragAndDrop(bank, account).perform();
		
	}

}
