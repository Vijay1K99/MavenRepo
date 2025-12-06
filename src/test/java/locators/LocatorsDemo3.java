package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		List<WebElement> parentElements = driver.findElements(By.xpath("//a[@class='menu__link']/parent::*"));

		// Example: Print text of each parent element
//		for(WebElement parent : parentElements) {
//		    System.out.println(parent.getText());
//		    
//		}	
		
		WebElement parent = driver.findElement(By.xpath("//a[@class='menu__link' and text()='Computers']/parent::*"));
		parent.click();

	}

}
