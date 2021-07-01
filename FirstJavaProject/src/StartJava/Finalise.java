package StartJava;

public class Finalise {
	
	public void finalize() {
		
		System.out.println("finalized method called ");
	}

	public static void main(String[] args) {
		
		//finalise keyword is used to clean up java memory 
		
		Finalise f1 = new Finalise();
		Finalise f2 = new Finalise();
		//since object is created and nobody is refering the object to perform action 
		// here is finallise is used to clean up memory used by above two objects
		f1 = null;
		f2=null;
		
		System.gc();
		
		
		
		
		

	}

}
