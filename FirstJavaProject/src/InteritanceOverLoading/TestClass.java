package InteritanceOverLoading;

public class TestClass {

	public static void main(String[] args) {
		
		//these are called method overriing - runtime poly 
		ChildClass tc = new ChildClass();
		tc.start();
		tc.stop();
		tc.theftsafty();
		tc.engine();
		
		
		//here we can accsss only common methods present in each class
		//this is also called Top-Casting
		ParentClass p = new ChildClass();
		p.start();
		p.stop();
	
		
		//can we do Down-Casting 
		//java will theow an error saying - ClassCastException: 
		
		ChildClass c =(ChildClass)new ParentClass();
			
	}
	
	//Method over-loading 
	public static void sum(){
		
		System.out.println("sum method");
	}
	
public static void sum(int a){
		
		System.out.println("sum method");
	}

public static void sum(int a,int b){
	
	System.out.println("sum method");
}
	

}
