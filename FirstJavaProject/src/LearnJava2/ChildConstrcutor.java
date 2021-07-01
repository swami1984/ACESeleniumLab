package LearnJava2;

public class ChildConstrcutor  extends ContructorClass{
	
	
	public  ChildConstrcutor() {
		//super();
		System.out.println("child default constructor");
	}
	
public  ChildConstrcutor(int a) {
		
		System.out.println("child1 default constructor");
	}

public  ChildConstrcutor(int a,int b) {
	
	System.out.println("child1 default constructor ");
}
	

	public static void main(String[] args) {

		ChildConstrcutor cc = new ChildConstrcutor();
		
		

	}
	
	

}
