package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IFrame {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		
		
		driver.switchTo().frame("frame1");
		WebElement dp = driver.findElement(By.id("sampleHeading"));
		System.out.println(dp.getText());
		driver.switchTo().parentFrame();*/
		
		
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		driver.switchTo().frame("packageListFrame");
		
		WebElement org_openqa_selenium = driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']"));
		
		org_openqa_selenium.click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("packageFrame");
		WebElement org_openqa_seleniumText = driver.findElement(By.xpath("//a[@href='package-summary.html']"));
		System.out.println(org_openqa_seleniumText.getText());
		driver.switchTo().parentFrame();
		
	}

}
