package StartJava;

public class InterviewProgr {

	public static void main(String[] args) {
		
		String string = "swammmy word ";
		char chars[] = string.toCharArray();
		int count =0;
		
		for(int i =0;i<chars.length;i++) {
			if(chars[i]!=' ' && chars[i+1]!= ' ' ) {
				count++;
			}
		}
		
		System.out.println("total no of words present"+count);
		
	}

}
