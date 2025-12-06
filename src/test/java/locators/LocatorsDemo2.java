package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//	cssSelector 
/*
tag#id
tag.class
tag[attribute='value']
tag.className[attribute='value'] 
 */


public class LocatorsDemo2 {

	public static void main(String[] args) {
		// Create a new instance of Chrome browser using WebDriver interface
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demo.nopcommerce.com/");
				
//				tag#id
//				driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shrit");
				
//				tag.class
//				driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mac");

//				tag[attribute='value']
//				driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("Tablets");
				
//				tag.className[attribute='value']
				WebElement input_box = driver.findElement(By.cssSelector("input.search-box-text[name='q']"));
				input_box.sendKeys("mac");
				input_box.click();
				

	}

}
