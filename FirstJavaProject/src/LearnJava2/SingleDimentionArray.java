package LearnJava2;

public class SingleDimentionArray {

	public static void main(String[] args) {


		int ar[] = new int[3];
		
		ar[0]=1;
		ar[1]=2;
		ar[2]=100;
		
		System.out.println(ar.length);
		
		System.out.println(ar[1]);
		
		//how to print all values 
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("*************For each loop*******************");
		
		for(Integer ir:ar) {
			System.out.println(ir);
		}
		
		

	}

}
