package OOPSConcepts;

public class LocalandGlobalVariable {

	
	//Global Variables or class variables
	//in order to access global through the program we need to create object and use 
	 String s = "tom";
	int age = 23;
	
			
	public static void main(String[] args) {
		
		int i = 23;//Local variables 
		LocalandGlobalVariable obj = new LocalandGlobalVariable();
		//System.out.println(obj.s);
		System.out.println(obj.age);
		
		

	}
	
	
	public void pqr() {
		//local variables 
		int a = 10;
		int b = 30;
		int c = 40;
		
		
	}

}
