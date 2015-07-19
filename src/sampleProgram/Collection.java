package sampleProgram;

import java.io.File;
import java.util.*;


public class Collection {
	public static void main(String [] args)
    {
		
		 File f1 = new File("http://www.sndynamics.tk/img/grinding.jpg");
		 System.out.println(f1.canRead());
		 
		 
	     boolean success = f1.delete();
		System.out.println(success);
	     
	     
		List A=new ArrayList();
		A.add(1);
		A.add("H");
		A.add("G");
		A.add(2.00);
		
		
		List B=new ArrayList();
		
		for(int j=0;j<A.size();j++)
		{
			Object o=A.get(j);
			if(o instanceof Integer || o instanceof String || o instanceof Double  )
			{
			System.out.println(o+"");	
			B.add(o+"");
			}
			
		}
		
		System.out.println(B);
		
		
		
		
		
		
		
         ArrayList<String> al1= new ArrayList<String>();
         al1.add("hi");
         al1.add("How are you");
         al1.add("Good Morning");
         al1.add("bye");
         al1.add("Good night");

         ArrayList<String> al2= new ArrayList<String>();
         al2.add("Howdy");
         al2.add("Good Evening");
         al2.add("bye");
         al2.add("Good night");

         //Storing the comparison output in ArrayList<String>
         ArrayList<String> al3= new ArrayList<String>();
         
         for(int i=0;i<al2.size();i++)
         {
        System.out.println(al2.get(i));
        	 
         }
         
         for (String temp : al1)
        	 
         {
        	 if(al2.contains(temp))
        	 {
        		 
        		 al3.add(temp);
        	 }
        	 else 
        	 {
        		 System.out.println("not contains"+temp);
        		// al1.remove(temp);
        	 }
         }
        	 
        System.out.println("content equals"+al1.toString().contentEquals(al2.toString()));	 
         
         
             //al3.add(al2.contains(temp) ? "Yes" : "No");
         System.out.println(al1);

         for(String a:al1)
         {
        	System.out.println(a);
        	 
         }
         
         
         //Storing the comparison output in ArrayList<Integer>
         ArrayList<Integer> al4= new ArrayList<Integer>();
         for (String temp2 : al1)
              al4.add(al2.contains(temp2) ? 1 : 0);
         System.out.println(al4);
    }
}
