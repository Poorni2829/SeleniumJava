package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException  {

	  ChromeDriver driver = new ChromeDriver();
		
     driver.manage().window().maximize();
      
      driver.get("https://www.telerik.com/contact/");
      
      Thread.sleep(1000);
     
       WebElement  ww = driver.findElement(By.id("Dropdown-1"));
       
       Select ss = new Select(ww);
       
       ss.selectByIndex(5);
       
       Thread.sleep(3000);
       
      WebElement  ww1 = driver.findElement(By.id("Dropdown-2"));
       
       Select ss2 = new Select(ww1);
       
       ss2.selectByVisibleText("UI for React");
       
       Thread.sleep(3000);
       
       driver.findElement(By.id("Textbox-1")).sendKeys("shuruthi");
       
       driver.findElement(By.id("Textbox-2")).sendKeys("abcd");
       
       driver.findElement(By.id("Email-1")).sendKeys("Poorni123&mail.com");
       
       driver.findElement(By.id("Textbox-3")).sendKeys("abcd");
       
       driver.findElement(By.id("Textarea-1")).sendKeys("abcd");
       
       driver.findElement(By.id("Textbox-4")).sendKeys("1234");

       
       
  WebElement  ww2 = driver.findElement(By.id("Country-1"));
       
       Select ss3= new Select(ww2);
       
       ss3.selectByValue("France");
       
       Thread.sleep(3000);

       
       
       
      
       
      

	}

}
