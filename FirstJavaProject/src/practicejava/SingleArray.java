package practicejava;

public class SingleArray {

	public static void main(String[] args) {
		
		int i [] = new int [3];
		
		i[0]=100;
		i[1]=200;
		i[2]=300;
		
		System.out.println(i[0]);
		
		//print all values 
		//for loop
		System.out.println("for loop");
		for(int a=0;a<i.length;a++) {
			System.out.println(i[a]);
		}
		
		//while loop
		System.out.println("while loop");
		int k=0;
		while(k<i.length) {
			System.out.println(i[k]);
			k=k+1;
		}
				
		
	}

}
