package OOPSConcepts;

public class Car {
	
	//Class global variable
	int mod;
	int wheel;
	
	

	public static void main(String[] args) {
		
		//object declaration for class Car
		//new operator or keyword used to create object
		// a is reference to object
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel =4;
		
		b.mod= 2016;
		b.wheel=4;
		
		c.mod = 2017;
		c.wheel=4;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		
		// shifting object to each other 
		
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(a.mod);
		System.out.println(c.mod);
		
		
		
		
				
		
				
				
		

	}

}
