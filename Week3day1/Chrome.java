package Week3day1;

public class Chrome extends BrowserGP {
	
	
	public void openCognito() {
		System.out.println("Chrometab");
	}
	
	public void clearcache() {
		System.out.println("delete all message");
	}
	

	public static void main(String[] args) {
	  
		Chrome ch = new Chrome();
		
		ch.clearcache();
		ch.openCognito();
		ch.navigateBack();
		ch.openCognito();
		ch.openUrl();		
System.out.println("name of browser :"+ch.browsername);
System.out.println("name of browser :"+ch.Browserversion);

		


	}

}
