package Week3day1;

public class SafariBrowser extends EdgeBrowser {
	
	public void readerMode()  {
		System.out.println("Read");
	}
	
	public void fullScreenMode()  {
		System.out.println("Fullscreen");
	}
	

	public static void main(String[] args) {
		
		SafariBrowser sb = new SafariBrowser();
		
		sb.readerMode();
		sb.fullScreenMode();
		sb.takeSnap();
		sb.clearcache();
		sb.openCognito();
		sb.navigateBack();
		sb.openCognito();
		sb.openUrl();
		
		System.out.println("name of browser :"+sb.browsername);
		System.out.println("name of browser :"+sb.Browserversion);
	}

}
