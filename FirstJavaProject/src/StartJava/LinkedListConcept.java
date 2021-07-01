package StartJava;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListConcept {

	public static void main(String[] args) {
		//add
		LinkedList<String> a = new LinkedList<String>();
		a.add("test");
		a.add("qtp");
		a.add("selenium");
		
		//print
		
		System.out.println("Content of linked list: "+a);
		//add first
		
		a.addFirst("swamy");
		a.addLast("got job at Philips");
		
		System.out.println("Content of linked list: "+a);
		
		//how to get values
		System.out.println(a.get(0));
		
		//how to set
		
		System.out.println(a.set(3, "shravani"));
	
		System.out.println("Content of linked list: "+a);
		System.out.println(a.set(0, "anju"));
		System.out.println("Content of linked list: "+a);
		
		//how to remove and first and last element
		
		/*a.removeFirst();
		a.removeLast();
		
		//how to remove specific element 
		
		a.remove(0);*/
		
		
		//how to print all the values of Linked List 
		//for loop
		System.out.println("for loop");
		for(int n = 0;n<a.size();n++) {
			System.out.println(a.get(n));
			
		}
			
		//advanced for loop
		System.out.println("advanced for loop");
		for(String str:a) {
			System.out.println(str);
		}
		System.out.println("Iterator loop");			
		//iterator
		
		java.util.Iterator<String> it = a.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		//while 
		System.out.println("while loop");
		int k =0;
		while(k<a.size()) {
			
			System.out.println(a.get(k));
			k=k+1;
		}
		
				
		
		
		
		

	}

}
