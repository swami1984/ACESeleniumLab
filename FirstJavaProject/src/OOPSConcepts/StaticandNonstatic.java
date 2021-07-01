package OOPSConcepts;

public class StaticandNonstatic {
	
	
	//static is keyword - if we want to access static method and varibale -call them directy
	//if non static - methods and variable can access by using object reference
	//can we access static method using object refe - yes we can access
	String name = "tom";//non static global variable 
	static int age = 26;// static global variable
	

	public static void main(String[] args) {
		
		//how to call static method inside main method
		//1 - direct calling 
		
		sum();
		//2- calling by classname 
		StaticandNonstatic.sum();
		//how to access global variables
		System.out.println(age);
		System.out.println(StaticandNonstatic.age);
		
		//how to call non static method and access non static variables
		
		StaticandNonstatic obj = new StaticandNonstatic();
		obj.sum();
		System.out.println(obj.name);
		
		//very imp - can i access static method by object reference? yes 
		
		obj.sum();// warnning should come as it is already in java free memory - since u can access this directly 
		

	}
	
	public void Sendmail() {
		
		System.out.println("send method");
	}
	
	public static void sum() {
		
		System.out.println("sum method");
	}

}
