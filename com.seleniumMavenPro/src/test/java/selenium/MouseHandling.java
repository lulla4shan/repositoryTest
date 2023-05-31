package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement username = driver.findElement(By.xpath("//input[@name='password']//preceding::input[1]"));
		WebElement password = driver.findElement(By.xpath("//input[@name='username']//following::input[1]"));
		WebElement login = driver.findElement(By.xpath("//button[text()='Sign In']"));
		action.moveToElement(username).build().perform();
		//action.click(username).build().perform();
		//action.sendKeys("admin").build().perform();
		
		
		

	}

}
