package Week3day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      driver.get("https://www.amazon.in");
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      
      WebElement value = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
      
      value.sendKeys("Bags for boys");
      
      
      WebElement search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
      
      search.click();
      
      List<WebElement> totalrecord = driver.findElements(By.xpath("//span[contains(text(),'results for')]"));

      System.out.println("Number of matching elements: " + totalrecord.size());

      for (WebElement i : totalrecord) {
          System.out.println(i.getText());
      };
        
    WebElement safari = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]"));
    safari.click();
    
    
   WebElement gear = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]"));
   
   gear.click();
   
 WebElement sort = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
 
 sort.click();
 
 WebElement newestArrival = driver.findElement(By.xpath("//a[text()='Newest Arrivals']"));
 newestArrival.click();
 
 String name = driver.findElement(By.xpath("//span[text()='Verge 37L Casual Printed Backpack, 3 Compartments, Raincover, Armor Base, Organizer, Bottle Holder, Front Pocket, School Bag for Boys and Girls, College Bag, Office Bag, Travel Bag']")).getText();;
 System.out.println("name :"+name);
 
 String price = driver.findElement(By.xpath("//span[text()='1,199']")).getText();
 System.out.println("Price" +price);
 
 
 
 
 String title = driver.getTitle();
 
 System.out.println("Tittle :"+title);
 
 driver.close();
 
 
 
 
   

}}
