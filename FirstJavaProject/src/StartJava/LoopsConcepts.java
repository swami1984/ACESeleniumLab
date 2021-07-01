package StartJava;

public class LoopsConcepts {

	public static void main(String[] args) {
		 
		
		//while loop 
		//disad - it will infinite output if not give inremental part 
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i=i+1;
		}
		
		System.out.println("***********************");
		//For loop 
		
		//print in normal order
		for(int j=1;j<=10;j++) {
			
			System.out.println(j);
		}
		
		System.out.println("***********************");	
		//print in reverse order
		for(int k=10;k>=-10;k--) {
			
			System.out.println(k);
		}

	}

}
