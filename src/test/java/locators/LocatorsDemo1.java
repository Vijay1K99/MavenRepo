package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com/automation-practice-form");
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		
//		Locate Element by id
//		WebElement fname  = driver.findElement(By.id("firstName"));
//		fname.sendKeys("Vijay");
		
		
//		Locate Elemnet by class
//		WebElement wrapper = driver.findElement(By.className("practice-form-wrapper"));
//		List<WebElement> wrappers = driver.findElements(By.className("practice-form-wrapper"));
//		System.out.println(wrappers.size());  
		
//		driver.findElement(By.className("custom-control-label")).click();
		
		
		
//		Locate Element By tagname
//		List<WebElement> tags  = driver.findElements(By.tagName("input"));
//		tags.get(1).sendKeys("kumar");
		
		
//		Locate element By Partial text
//		driver.findElement(By.linkText("Home")).click();
		
		List<WebElement> tag=driver.findElements(By.tagName("a"));
		System.out.println(tag.size());
		
		
	
//		driver.quit();
	}

}
