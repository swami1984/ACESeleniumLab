package javabasics;

public class selenuim {

	int i = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		selenuim dc = new selenuim();
		
		
	int c= sum();
	System.out.println(c);
		
	}

	

	public static int sum() {
		
		System.out.println("static method");
		
		int a= 20;
		int b = 30;
		int c = a+b;
		
		return c;
		
	}
	

}
