package StartJava;

public class B extends A {
	
	
	public B () {
		
		// Super is keyword is used to call parent method construtor
		//if super  keyword is there is defualt will not be called on parent constructor
		// 
		super();
	
	}
	
	public B (int i) {
		
		super(i);
		System.out.println("const with one params");
	
	}
	
	public B (int i,int j) {
		
		super(i,j);
		System.out.println("const with tw params");
	
	}

	public static void main(String[] args) {
		
		B obj = new B();
		B obj1= new B(10);
		B obj2= new B(10,20);
		

	}

}
