package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSelectDropdown {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		/* code to select all values from a multi select dropdown.*/
		/* getOptions() - returns the list of all options in the dropdown  */
		
		/*WebElement dp = driver.findElement(By.id("multi-select-field"));
		Select sel = new Select(dp);
		List<WebElement> list = sel.getOptions();
		for (WebElement i: list){
	         System.out.println(i.getText());
	      }*/
		
		
		/* check if it is a multi select dropdown or not . isMultiple() used to return true if multi-select dropdown*/
		
		WebElement dp = driver.findElement(By.id("multi-select-field"));
		Select sel = new Select(dp);
		Boolean res = sel.isMultiple();
		System.out.println(res);
		
		
		/* Below code is for select values*/
		
		sel.selectByIndex(1);
		sel.selectByValue("Green");
		
		
		
		List<WebElement> list = sel.getAllSelectedOptions();
		for (WebElement i: list){
	         System.out.println(i.getText());
	      }
	      
	
		
		WebElement l = sel.getFirstSelectedOption();
		System.out.println(l.getText());
		
		sel.deselectByValue("Green");
		sel.deselectByIndex(1); 
		
		driver.quit();
	}

}
