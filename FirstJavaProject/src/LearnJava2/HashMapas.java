package LearnJava2;

import java.util.Hashtable;
import java.util.Iterator;

public class HashMapas {

	public static void main(String[] args) {
	
		Hashtable <Integer,Integer>ht = new Hashtable();
		
		ht.put(1, 100);
		ht.put(2, 200);
		ht.put(3, 300);
		ht.put(4,400);
		
		System.out.println(ht.size());
		
		System.out.println(ht.get(1));
		
		
		Iterator<Integer> tr = ht.keySet().iterator();
		while(tr.hasNext()) {
			System.out.println(tr.next());
		}
		
		for(Integer itr:ht.values()) {
			System.out.println(itr);
		}
		
		
	
		
		
		
		

	}

}
