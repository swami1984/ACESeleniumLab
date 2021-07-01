package OOPSConceptPart2;

public class MethodOverLoading {

	public static void main(String[] args) {
		
	}
	
	
	//can we create multiple main with same name - inside the class - 
	// we an create - but we need to differentiate with data type arguments 
	//famous interview question
	//we can over load main method 
	public static void main(int a) {
		
	}
	
    public static void main(int a,int b) {
		
	}
	
	
	// we cannot create method inside a method 
	//duplicate method : same method names with same no of arguments are not allowed 
	//Method over loading - when method name is same with different arguments or input params within the same class
	public void sum() {
		
		System.out.println("sum method");
	}
	
	public void sum(int a) {
		
		System.out.println("sum method");
	}
	
public void sum(double d) {
		
		System.out.println("sum method");
	}
	
public void sum(int a,int b) {
		
		System.out.println("sum method");
	}
	

}
