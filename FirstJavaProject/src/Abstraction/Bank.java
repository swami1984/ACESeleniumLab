package Abstraction;

public abstract class Bank {
	
	int i =100;
	final int k = 20;
	static int j = 1000;
	
	
	public abstract void loan();//abstract method 
	//what is abstarct means --- child class will implement only abstract method or protype from parent class
		// implementation logic will be defined by child class only - in very simple way - hiding implemenation 
	// we achieving not 100 % abstraction - partiall abstraction
	//abstract classs can have - abstract and non abstract method also
	//we cannot the object of abstract class
	//we can create static and non static and as well as final variables 
	
	//below two methods are non abstract method 
	public void credit() {
		System.out.println("credit method");
		
	}
	
	public void debit() {
		System.out.println("debit method");
	}
	
	public static void ins() {
		
	}
	
	void reg() {
		
	}

}
