package practicejava;

public class IncreDecre {

	public static void main(String[] args) {
		
		int i =1;
		int j = i++;// post increment -intially i will 1 , that i wll be pass to j = so j =1 ; i =2
		System.out.println("post  increment");
		System.out.println(i);
		System.out.println(j);
		//pre increment as - ik will 1 , q will 2 - , k=2 
		int k=1;
		int q=++k;
		System.out.println("pre increment");
		System.out.println(k);
		System.out.println(q);
		
		//post decrement
		
		int p=2;
		int h=p--;
		
		//intially p is 2 , h will be 1 
		// p will be 1 , h will 2 
		System.out.println("post decrement");
		System.out.println(p);
		System.out.println(h);
		
		
		System.out.println("pre- decrement");
		int d =2;
		int m =--d;
		
		//intially d =2 =m=1
		//d=1
		System.out.println(m);
		System.out.println(d);
		
				
		
		
		
		
		

	}

}
