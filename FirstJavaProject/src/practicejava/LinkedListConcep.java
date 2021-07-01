package practicejava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcep {

	public static void main(String[] args) {
		
		
		LinkedList <Integer>ll = new LinkedList();
		ll.add(1000);
		ll.add(2000);
		ll.add(3000);
		ll.add(4000);
		
		System.out.println(ll.size());
		
		System.out.println(ll.get(0));
		
		//for loop
		
		System.out.println("********for loop");
		
		
		for(int k =0;k<ll.size();k++) {
			System.out.println(ll.get(k));
		}
		
		System.out.println("********for each loop");
		
		for(Integer it :ll) {
			System.out.println(it);
		}
		
		System.out.println("********while loop using iterator");
		
		Iterator itr = ll.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
	
		}
				
				System.out.println("********while loop" );
				
			int q=0;
			while(q<ll.size()) {
				System.out.println(ll.get(q));
			q=q+1;
			
			}
		

	}

}
