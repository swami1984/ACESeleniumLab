package StartJava;

public class TwoDArrayConcepts {

	public static void main(String[] args) {
		
		String x[][] = new String[3][5];// 2D Array declaration in Java
		System.out.println(x.length);// total no of rows
		System.out.println(x[0].length);// total no of columns
		
		//Int of Array
		
		x[0][0]="a";
		x[0][1]="swamy";
		x[0][2]= "A";
		x[0][3]="keertana";
		
		
		// print all the values in 2d Array 
		
		for(int row =0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++)
				
				System.out.println(x[row][col]);
				
		}


	}

}
