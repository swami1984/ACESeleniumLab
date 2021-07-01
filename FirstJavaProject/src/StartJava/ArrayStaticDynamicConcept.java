package StartJava;

public class ArrayStaticDynamicConcept {

	public static void main(String[] args) {
		
		int i[] = new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		//all are one-dim array 
		//advantage - can store multiple value in single variable 
		//dis - size of the array is fixed- static array // to overcome this issue - we use - ArrayList, Hashtable - Dynamic array
		//dis - stores only similar data types-// to overcome this issue - we use - object array - 
		
		
		
		System.out.println(i[2]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException - there is index found in this address
		
		System.out.println(i.length);//lenght of the array
		
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);// print all the values of array
		}
		
		//double array 
		
		double d[] = new double[4];
		d[0]=12.33;
		d[1]=14.55;
		
		System.out.println(d[1]);
		
		
		
		//Object class -used to store different data types values
		
		Object ob[] = new Object[5];
		ob[0]="keetu";
		ob[1] = 12;
		ob[2]=12.33;
		ob[3]="london";
		ob[4]= true;
		
		System.out.println(ob.length);
		System.out.println(ob[0]);
				
					
		

	}

}
