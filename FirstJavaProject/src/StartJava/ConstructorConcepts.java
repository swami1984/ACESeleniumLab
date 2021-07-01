package StartJava;

public class ConstructorConcepts {
	
	String name;
	int age;
	
	public ConstructorConcepts(String name,int age) {
		this.name =name;
		this.age = age;
		
		System.out.println("oid value passed");
	}
	
	//constructor over loading is possible with different params
	//A Java constructor is special method that is called when an object is instantiated. In other words, when you use the new keyword. ...
//A Java class constructor initializes instances (objects) of that class.
	
//Keyword 'THIS' in Java is a reference variable that refers to the current object. "this" is a reference to the current object, whose method is being called upon. 
	//You can use "this" keyword to avoid naming conflicts in the method/constructor 	
	
/*	
	public ConstructorConcepts() {
		System.out.println("defualt const");
	}
	
	public ConstructorConcepts(int i) {
		System.out.println("1 param const");
	}
	
	public ConstructorConcepts(int i,int j) {
		System.out.println("1 param const");
	}*/

	public static void main(String[] args) {
		
		//ConstructorConcepts obj = new ConstructorConcepts();
		ConstructorConcepts obj1=new ConstructorConcepts("tom",25);
		//ConstructorConcepts obj2 = new ConstructorConcepts(10,20);
		
		

	}

}
