package OOPSConcepts;

public class WrapperClass {

	public static void main(String[] args) {
		String s = "100";
		System.out.println(s+10);
		
		//data conversion from string to integer
		//integer, double,boolean
		int i = Integer.parseInt(s);
		System.out.println(i+10);
		
		//string to boolean
		String x = "true";
		boolean y = Boolean.parseBoolean(x);
		System.out.println(y);
		
		//integer  to string 
		int j = 200;
		
		String c = String.valueOf(j);
		System.out.println(c);
		
		//string to integer
		String u = "100A";
		int l =Integer.parseInt(u);
		System.out.println(i);// throw error number format exception NumberFormatException
				
		
		
				
				
		
				

	}

}
