package practicejava;

public class HDFCBank implements USBank,HSBC{
	
	public void credit() {
		System.out.println("credit methid");
	}

	public void debit() {
		System.out.println("debit method");
	}

	public void Loan() {
		System.out.println("loan saction");
	}


	public void Autoloan() {
		System.out.println("hdfc auto loan");
	}
	
	public void eduloan() {
		System.out.println("hdfc edu loan");
	}

	public void min_bal() {
		System.out.println("min bal rule defined by US bank");
	}
	
	public void personalLoan() {
		System.out.println("pl loan");
	}


}
