package Week3day1;

public class MethodOverLoading1 {
	
	public  void reportStep (String Message ,String Status) {
		System.out.println(Message+ " "+ Status);

	}
	
	public  void reportStep (String Message, boolean snap, String Status) {

    System.out.println(Message+" "+Status);
    
    if(snap) {
    	System.out.println("Snapshot Taken");
    }
    
    else {
    	
    	System.out.println("snapshot not taken");
    }
	}


	public static void main(String[] args) {
		
		MethodOverLoading1 Mobject = new MethodOverLoading1();
		
	Mobject.reportStep("Hii", "status");
	Mobject.reportStep("Hii", false, "status");
		
		
		
		
	}

}
