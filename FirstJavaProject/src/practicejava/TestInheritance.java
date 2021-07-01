package practicejava;

public class TestInheritance {

	public static void main(String[] args) {
		
		Child ch = new Child();//method overriding - run time poly
		ch.start();
		ch.stop();
		ch.engine();
		ch.safetyteft();
		
		//compile time poly 
		//parent can access only similar methods in child 
		//not all the methods defined by child
		
		Inharitance in = new Child();
		in.start();
		in.stop();
		in.engine();
	
	}
	
	

}
