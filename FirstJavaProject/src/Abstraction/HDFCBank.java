package Abstraction;

public class HDFCBank  extends Bank{
// here we override only abstract methiod defined in parent 
	// no need to define other non abstract method defined in parent - advantage of abstarct 
	
	@Override
	public void loan() {
		System.out.println("Loan Method -------HDFC ");
		
	}
	
	
	
	
	

}
