package practicejava;

public class Constructor {
	
	public Constructor() {
		
		System.out.println("default constrcutor");
	}
	
	public Constructor(int i) {
		
		System.out.println("sec constrcutor");
	}
	
	public Constructor(int i,int j) {
		
		System.out.println("thrd constrcutor");
	}
	

	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
		Constructor obj1= new Constructor(10);
		Constructor obj2 = new Constructor(10,20);
		
	}

}
