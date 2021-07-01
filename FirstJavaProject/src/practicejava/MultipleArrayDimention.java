package practicejava;

public class MultipleArrayDimention {

	public static void main(String[] args) {
	
			Integer a[][] = new Integer[3][5];
			
			a[0][1]=100;
			a[0][2]=200;
			//a[0][3]=300;
			
			//how to get the size of the array
			//rows
			System.out.println(a.length);
			//colums 
			System.out.println(a[0].length);
			
		    for(int i=0;i<a.length;i++) {
		    	for(int j=0;j<a[0].length;j++) {
		    		
		    		System.out.println(a[i][j]);
		    	}
		    }
			
	
		
	}
	
}	
