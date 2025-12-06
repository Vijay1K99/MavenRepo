package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XapthAxisDmeo1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
//		Finding element with multiple attribute
//		WebElement input_text = driver.findElement(By.xpath("//input[@id='small-searchterms'][@name='q']"));
//		input_text.sendKeys("Mac");
		
//		Finding locator using relative xpath
			
//		1. Using and operator
		WebElement input_text=driver.findElement(By.xpath("//input[@id='small-searchterms'][@name='q']"));
		input_text.sendKeys("Mac");
		
//		Using text 
//		WebElement search_Box = driver.findElement(By.xpath("//button[text()='Search']"));
//		search_Box.click();
		
//		Using starts-with
//		WebElement search_box= driver.findElement(By.xpath("//button[starts-with(@type,'submit')]"));
//		search_box.click();
		
//		Using starts-with
//		WebElement search_box= driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
//		search_box.click();
		
		
		
	}

}
