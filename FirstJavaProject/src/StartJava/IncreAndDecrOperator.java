package StartJava;

public class IncreAndDecrOperator {

	public static void main(String[] args) {
		System.out.println("******Post***************");
		int i=1;
		int j=i++;//post increment
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("*******pre**************");
		
		int a =1;
		int b =++a;//pre-increment
		
		System.out.println(a);
		System.out.println(b);
		
		//post decrement 
		
		int m = 2;
		int n = m--;
		
		//m=2 --> n=m -> 2 -1 = 1 so n = 1 , m = 2 
		System.out.println("********post decrement*************");
		System.out.println(m);
		System.out.println(n);
		
		//pre decrement 
		// x =2 --> x =y --> y =1 ; x = 2 
		System.out.println("********pre decr*************");
		int x = 2;
		int y =--x;
		System.out.println(x);
		System.out.println(y);
		
		
					

	}

}
