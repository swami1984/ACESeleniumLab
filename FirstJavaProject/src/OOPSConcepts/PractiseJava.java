package OOPSConcepts;

public class PractiseJava {
	
	//global varibale or class variables 
	//global varibales are non static in nature 
	int mod;// global variable or non static global variable 
	static int wheel;// global varibale or static global variable
	
	int p;
	int q;

	public static void main(String[] args) {
		
		PractiseJava a = new PractiseJava();
		PractiseJava b = new PractiseJava();
		PractiseJava c = new PractiseJava();
		PractiseJava obj = new PractiseJava();
		a.mod = 2012;
		a.wheel = 4;
		
		b.mod = 2013;
		b.wheel = 4;
		//before swap
		obj.p=40;
		obj.q=50;
		
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		
		
		obj.add();
		add();
		
		int addition = obj.sum(10, 20);
		System.out.println(addition);
		
		//two ways to call static method 
		
		add();
		PractiseJava.add();
		
		// ways to call non static method
		
		int var = obj.sum(10, 10);
		System.out.println(var);		
		
		// after swap
		 obj.swap(obj);	
		 System.out.println(obj.p);
		 System.out.println(obj.q);
		 
		 //effective way of print similar values - using while loop 
		 int n =0;
			while(n<10) {
				
				System.out.println(n);
				n=n+1;
				
			}
			
			
		//For loop 
			
			for(int x=10;x>=1;x--) {
				
				System.out.println(x);
				
				
			}
		
	}
	
	
	//Calling functions:
	
	public static void add() {
		
		System.out.println("add method ");
	}
	
	// Calling function to see return type error :
	
	public int sum(int p, int q) {
		int c = p+q;
		return c;
		
	}
	
	//call by reference 
	
	public void swap(PractiseJava t) {
		
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
	}
	
	//Looping in java
	
	
	
			
	

}
