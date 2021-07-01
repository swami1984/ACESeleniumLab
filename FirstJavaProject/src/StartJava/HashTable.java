package StartJava;

import java.util.Hashtable;
import java.util.Iterator;



public class HashTable {

	public static void main(String[] args) {
		//there is no index concept in hashtable
		//inserting values in the form of key value pair
		//getting values by key name 
		Hashtable <Integer,String>ht = new Hashtable();
		
		ht.put(1 ,"swamy");
		ht.put(2, "ammu");
		//ht.put(1, 100);
		
		System.out.println(ht.size());

		System.out.println(ht.get("a"));
	
		
		
		//how to restrict only interger values 
		
		Hashtable<Integer,Integer> ht1 = new Hashtable<Integer,Integer> ();
		
		ht1.put(1, 100);
		//ht1.put(1, "swamy");// throw n error saying this is integer type
		//The method put(Integer, Integer) in the type Hashtable<Integer,Integer> is not applicable for the arguments (int, String)

		
System.out.println("*******print key set********");
	
//print key in hash map
//while loop - using iterator
Iterator<Integer> itr = ht.keySet().iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	
	System.out.println("*******print key set********");
	//For each loop - similar in UFT - vb script
	for(String str:ht.values()) {
		System.out.println(str);
		
	}
		



	}

}
