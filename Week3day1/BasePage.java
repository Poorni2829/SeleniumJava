//Assignment4 method overriding

package Week3day1;

public class BasePage {

    public void findElement(String findElement) {
    	System.out.println("webdriver :" + findElement);
   }
    
    public void clickElement(String clickElement) {
    	System.out.println("click :" + clickElement);
    	
    }
    
    public void enterText(String enterText) {
    	System.out.println("username and Password :" + enterText);
    }
	
    
    public void  performCommonTasks(String task) {
    	System.out.println("task :" + task);
    }
    
	public static void main(String[] args) {
		
  BasePage Bp = new BasePage();
  
  Bp.findElement("chromedriver.driver");
  
  Bp.clickElement("user clicked the button ");
 
  Bp.enterText("abcd and 1234");
  
  Bp.performCommonTasks("user completed the task");
  
		
	}

}
