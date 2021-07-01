package practicejava;

public class ChildClass extends ParentClass{
	
	
	public ChildClass() {
		super(10);
		System.out.println("child class constr");
		
	}

	public static void main(String[] args) {
	
		ChildClass c = new ChildClass();

	}

}
