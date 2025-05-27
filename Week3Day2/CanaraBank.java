package Week3Day2;

public abstract class CanaraBank implements Payment {

	@Override
	public void cardPayments() {
		System.out.println("CardPayment is accepted in everywhere");
		
	}

	@Override
	public void CashonDelivery() {
		System.out.println("CashonDelivery is accepted in everywhere");
		
	}


	abstract void recordPaymentDetails();

	
	
}
