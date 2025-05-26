//Assignment2 -sub class

package Week3day1;

public class LoginTestData  extends TestData{
	
	void enterUsername() {
		System.out.println("Username : Poorni");
	}
	
	void enterPassword() {

		System.out.println("Password : 12345");
	}
	

	public static void main(String[] args) {
		
		LoginTestData ld = new LoginTestData();
		
		ld.enterUsername();
		
		ld.enterPassword();
		
		ld.navigateToHomePage();
		
		TestData Td = new TestData();

		System.out.println("abcd");
		
	  
		

	}

}
