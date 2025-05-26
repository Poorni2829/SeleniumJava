package Week3day1;

public class BaseLoginPage extends BasePage {
	
	 public void  performCommonTasks(String task) {
	    	System.out.println("value :" + task);
	    }
 
	 
	public static void main(String[] args) {

		BaseLoginPage BLP = new BaseLoginPage();
		
		BLP.performCommonTasks("task successfully completed");
		
		BLP.findElement("chromedriver.driver");
		  
		BLP.clickElement("user clicked the button ");
		 
		BLP.enterText("abcd and 1234");
		  

		  
				
			}
		
	}


