package practicejava;

import java.util.Hashtable;
import java.util.Iterator;



public class HashTableConcept {

	public static void main(String[] args) {
	
		        Hashtable<Integer,Double > ht = new Hashtable();
		        
		        ht.put(1, 12.33);	       
		        ht.put(3, 12.77);
		        
		        //print value 
		        System.out.println(ht.get(1));
		        //how to get size of the hashmap        
		        System.out.println(ht.size());
		        
		        //how to print all values of hashmap
		        
		        //using Iterator
		        System.out.println("*******while loop*********");
		        
		        Iterator<Integer> itr=ht.keySet().iterator();
		        while(itr.hasNext()) {
		        	System.out.println(itr.next());
		        }
		     
		        
		        System.out.println("*********for loop*******");
		        for(Double str:ht.values()) {
		        	System.out.println(str);
		        }
	}

}
