import java.util.Arrays;


public class Hcl  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="madam";
		try
		{
			
		    int length = str1.length();
		    System.out.println(""+length+"/2"+length / 2);
		    for (int i = 0; i < length / 2; i++) {
		 
		        if (str1.charAt(i) != str1.charAt(length - i - 1))
		        {
		        	System.out.println("not matched");
		        }
		        else
		        {
		        	System.out.println("palindrome");
		        }
		    }
//System.exit(0);		
		}
		finally
		{
			System.out.println("test");
		}
		
		  System.out.println(Math.min(Integer.MAX_VALUE, 0));
		  
		  System.out.println(1.0/0);
		  
		  
		  char[] chars = new char[] {'\u0097'};
	        String str = new String(chars);
	        byte[] bytes = str.getBytes();
	        System.out.println(Arrays.toString(bytes));
		    
	}
	
	static Integer m1(int n)
	{
	if (n==1) return 1;
		
	return n*m1(n-1);
	}


}
