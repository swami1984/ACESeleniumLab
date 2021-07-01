package javabasics;

public class Learnjava {

	public static void main(String[] args) {
		
		Learnjava lc = new Learnjava();
		
		lc.sum();// example for how to call non static method
		int d= lc.add();
		System.out.println(d);
				
		multi();//  calling static method

	}
	// we can override main method as well
	public static void main(int a ) {
		
	}

	// these are examples for method overloading 
	public void sum() {
		System.out.println("sum method");
	}
	
	public int  add() {
		
		System.out.println("dulicate method");
		int a=10;
		int b=20;
		int c= a+b;
		
		return c;
				
	}

	public static void  multi() {
		 System.out.println("static method");
	}
	
	
}
