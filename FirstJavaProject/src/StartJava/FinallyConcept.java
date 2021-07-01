package StartJava;

public class FinallyConcept {

	public static void main(String[] args) {
		
		division();
		

	}
	
	public static void test1(){
		
		try {
			
			System.out.println("test method");
		}catch(Exception e) {
			
			System.out.println("inside catch method");
		}
		
		
		finally {
			
			System.out.println("finally method");
		}
	}
	
	
	// real time example 
	
	public static void division() {
		int i = 10;
		
		try {
			
			System.out.println("inside try block");
			int k = i/0;			
		}
		//above step errow was throw and no nody is catched that expecttion in the below block
		//very ticky question in interview - exeception should be Arithmatic block exception
		catch(NullPointerException e) {
			System.out.println("inside catch block");
			System.out.println("divsion by zero error");
			
		}
		
		finally {
			
			System.out.println("Finally block executed without error");
		}
		
	}
	
	
	
}

