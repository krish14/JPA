import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringHandling {
	 public static void main(String args[])
	   {
	 
		 String test="";
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 try {
			 
			 System.out.println("Enter string value");
			test=br.readLine();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 String reverse="";
		 
		 for(int i=test.length()-1;i>=0;i--)
		 {
			 System.out.println(test.charAt(i));
			 reverse=reverse+test.charAt(i);
		 }
		 
		 System.out.println(reverse);
		 
		 for(int j=0;j<=test.length()/2;j++)
		 {
			if(test.charAt(j)!=test.charAt(test.length()-1-j))
			{
				System.out.println("not a palindrome");
			}
			else
			{
				System.out.println("palindrome");
			}
		 }
		 
		 
		 
		 
		 if(test.equals(reverse.toString()))
		 {
			 System.out.println("palindrome");
			 
		 }
		 else
		 {
			 System.out.println("not a palindromehar");
		 }
		 
		 
		 int count=1;
		 System.out.println(++count); 
		 
		 int count1=1;
		 System.out.println(count1++); 
		 
	 
	   }
}
