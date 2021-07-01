package LearnJava2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList <Integer>aa = new LinkedList();
		aa.add(100);
		aa.add(200);
		aa.add(300);
		aa.add(400);
		
		//how to get size of hashtable
		//System.out.println(aa.size());
		//how to get value 
		//
		//System.out.println(aa.get(0));
		
		//how to add values to first position
		
		//aa.addFirst(600);
		//aa.addLast(900);
		
		System.out.println(aa.get(1));
		
		System.out.println("contents of hashmap"+aa);
		
		//print all values 
		//for each loop
		
		System.out.println("for each loop");
		for(Integer ia:aa) {
			System.out.println(ia);
		}
		
		//forloop 
		System.out.println("for loop");
		for(int i=0;i<aa.size();i++) {
			System.out.println(aa.get(i));
		}
		
		
		//Iterator loop
		System.out.println("using Iterator");
		Iterator<Integer> itr = aa.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());			
			
		}
		
		System.out.println("using while");
		
		int k =0;
		while(k<aa.size()) {
			
			System.out.println(aa.get(k));
			k=k+1;
		}
		

		
		

	}

	

}
