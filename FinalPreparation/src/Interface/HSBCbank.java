package Interface;

public class HSBCbank implements  interfaceconcept{
	
	int max = 200;
	
	
	public void credit() {
		System.out.println("credit");
	}
	
	public void debit() {
		System.out.println("devit");
	}
	
	public void loan() {
		System.out.println("laon");
	}
	
 public void credit(int a ) {
	System.out.println("credit with value :"+a);
}
	
	
	
}
