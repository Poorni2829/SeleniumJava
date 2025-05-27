package Week3Day2;

public class Amazon extends CanaraBank {

	@Override
	public void upiPayments() {
		System.out.println("UPIPayments is easy for nowadays");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("internetbanking nowadays not used regularyly");
		
	}

	@Override
	void recordPaymentDetails() {
		System.out.println("recordPayments is not used");
	}

  public static void main(String[] args) {
	  
	  Amazon AM = new Amazon();
	  
	  AM.cardPayments();
	  AM.CashonDelivery();
	  AM.recordPaymentDetails();
	  AM.internetBanking();
	  AM.upiPayments();
	  
	
	}
}
