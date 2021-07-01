package OOPSConcepts;

public class CallbyValueCallbyReference {
	
	int p;
	int q;
	

	public static void main(String[] args) {
		
		CallbyValueCallbyReference obj = new CallbyValueCallbyReference();
		int x = 10;
		int y = 20;

		int add = obj.addsum(x, y);// call  by value or passing by value 
		System.out.println(add);
		//before swaping 
		obj.p = 50;
		obj.q = 60;
		
		//after swaping 
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	
	public int addsum(int a,int b) {
		a = 30;
		b = 40;
		int c = a+b;
		return c;
	}
	
	
	//call by reference 
	
	public void swap(CallbyValueCallbyReference t) {
		
		int temp;
		temp =t.p;
		t.p=t.q;
		t.q= temp;
		
			
	}
	
	

}
