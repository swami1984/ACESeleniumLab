package LearnJava2;

public class DimentionArray2 {

	public static void main(String[] args) {


		int ar[][]= new int[3][5];
		
	     ar[0][1]= 100;
	     ar[0][2]=200;
	     ar[0][3]=300;
	     ar[0][4]=400;
	     
	     System.out.println(ar.length);
	     
	     for(int i=0;i<ar.length;i++) {
	    	 for(int j=0;j<ar[0].length;j++) {
	    		 
	    		 System.out.println(ar[i][j]);
	    	 }
	     }
	    	 
	     
	     
	     
	    		 
		

	}

}
