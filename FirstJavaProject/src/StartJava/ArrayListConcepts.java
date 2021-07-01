package StartJava;

import java.util.ArrayList;

public class ArrayListConcepts {
//size of aray will increase based on value we add
//any kind of values we can add into arraylist like , char, string, double
	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add (12.55);
		
		
	
		
		System.out.println(ar.size());
		
		ar.remove(2);
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));
		//System.out.println(ar.get(3));// if we trying to access value which is not present 
		//java.lang.IndexOutOfBoundsException:
		
		//print all the values of array
		
		for(int i=0;i<ar.size();i++) {
			
			System.out.println(ar.get(i));
		}
		
		
		//how to add or restrict oly interger values in array
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(400);
		
		System.out.println(ar1);
		//ar1.add("Tom")// throuw an error saying is not applicable for the arguments (String) 
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("keertana");
		//ar2.add("Chetana");
		//ar2.add(122);throuw an error saying is not applicable for the arguments (int) 
				
		
	}

}
