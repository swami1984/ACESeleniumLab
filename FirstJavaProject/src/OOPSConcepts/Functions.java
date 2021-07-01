package OOPSConcepts;

public class Functions {
//main method is starting point or entry point for execution
	public static void main(String[] args) {
		Functions obj = new Functions();
		//one object will be created - obj is reference variable
		//after creating object, copy of all the non static methods or functions refer to this object
		obj.test();
		obj.pqr();
		int div=obj.qtp(30, 10);
		System.out.println(div);
	
		
	//main never return a value thats reason main method have void	

	}
	
	//non static method
	//method name here is : test
	//return type is : void - does not return any value 
	public void test() {
		
		System.out.println("Test method");
		
	}
	
	//method name here : pqr
	//return type is : int
	public int pqr() {
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
	}
	
	// x and y are inputs
	//return type int
	public int qtp(int x,int y) {
		
		System.out.println("qtp method");
		int s = x/y;
		 return s ;
		
		
	}
	

}
