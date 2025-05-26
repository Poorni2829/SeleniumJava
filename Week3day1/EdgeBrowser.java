package Week3day1;

public class EdgeBrowser extends Chrome {
	
	public void takeSnap() {
		
		System.out.println("picture");
	}
	
	public void clearCookies()  {
		
		System.out.println("cleared");
	}
	
	

	public static void main(String[] args) {
		
		EdgeBrowser ed = new EdgeBrowser();
		
		ed.takeSnap();
		ed.clearCookies();
		ed.clearcache();
		ed.openCognito();
		ed.navigateBack();
		ed.openCognito();
		ed.openUrl();
		
		System.out.println("name of browser :"+ed.browsername);
		System.out.println("name of browser :"+ed.Browserversion);
		
		

	}

}
