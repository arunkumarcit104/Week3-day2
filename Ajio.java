package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.ajio.com");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		
		
		Thread.sleep(5000);
		
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();

		System.out.println("Items Found: " +text);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='brands']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='brands']/following::div[text()='MORE']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='facet-list-title-name']"));
		
		System.out.println("Brand Count: " +findElements.size());
		
		for (WebElement brand : findElements) {
			
			String brandName=brand.getText();
			
			System.out.println("List of Brands: " +brandName);
			
		}
		
	}

}
