package OOPSConceptPart2;

public interface USBank {
	
	
	int min_balance = 100;
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();
	
	//only method declaration
	//no method body 
	//in interface, we can create variables, by default var are static in nature 
	//value of variable will not be change 
	//no static method in interface 
	//interface are part OOPS cannot have static method
	//there is no main method
	//we can create a object of interface - they are in abstract in nature
		

}
