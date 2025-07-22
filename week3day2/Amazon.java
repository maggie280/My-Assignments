package week3day2;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("cash");
	}

	@Override
	public void upiPayments() {
		
		System.out.println("payment done");
		
	}

	@Override
	public void cardPayments() {
		
		System.out.println("card access");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("netbanking process");
		
	}
	
	public static void main(String[] args) {
		
		Amazon a = new Amazon();
		a.cashOnDelivery();
		a.upiPayments();
		a.cardPayments();
		a.cashOnDelivery();
		a.internetBanking();
		
	}
	
	

}
