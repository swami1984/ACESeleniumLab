package StartJava;

public class javatraining {

	public static void main(String[] args) {
		
		// revese string
		
		/*String string = "Ratna";
		char chars[] = string.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
			System.out.println(chars[i]);
		}*/
		
		//count chars in string 
		
		/*String string = "my name is swamy";	
		char chars[]=string.toCharArray();
		int count =0;
		for(int i=0;i<chars.length;i++) {
				if(string.charAt(i)!=' ') {
					count++;
				}
		}
		
		
		System.out.println("total no of chars in string:"+count);*/
		
		
		/*String str = "welcome to java   tutorial on Java2blog";
		 
        int count = 1;
 
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);*/
		
		
		 int [] arr = new int [] {25, 11, 7, 75, 56};  
	        //Initialize min with first element of array.  
	        int min = arr[0];  
	        //Loop through the array  
	        for (int i = 0; i < arr.length; i++) {  
	            //Compare elements of array with min  
	           if(arr[i] >min)  
	               min = arr[i];  
	        }  
	        System.out.println("Smallest element present in given array: " + min);  
		
		
			
		}
		
		
		
		
		
	}

