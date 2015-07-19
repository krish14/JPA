import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Hexa {

	static String xy="ABCD";
	
	public static void main(String[] args)
	{

TreeMap hm=new TreeMap();
		
		hm.put("1", "hari");
		hm.put("1", "hari");
		hm.put("2", "hari");
		
		Set set=hm.entrySet();
		
Iterator it=set.iterator();

while(it.hasNext())
{
Map.Entry mm=(Map.Entry)it.next();
System.out.println(mm.getKey()+""+mm.getValue());
	
}

        String longstring="test"+
                           "test";
        
        System.out.println(longstring);
		
        
        
        Integer fact=1;
        Integer input=6;
        
        for(int i=1;i<=input;i++)
        {
        	fact=fact*i;
        }
        
        System.out.println("fact=="+fact);
        
        
        
        
        
	double 	x=6;
	
	int y=5,z=2;
	
	ArrayList ll=new ArrayList();
	ll.add("");
	M1();
	System.out.println(xy);
		
	
	System.out.println(factorial(15));
	}
	
	
	public static void M1()
	{
		
	    xy=xy+"DEF";	
	    
	    M2(xy);
		
	}
	
	public static void M2(String xx)
	{
		xy=xy+"HHH";
		
	}
	
	public static int factorial(int N) { 
		   if (N == 1) return 1; 
		   
		   System.out.println("fact value"+N);
		   System.out.println(N * factorial(N-1));
		   return N * factorial(N-1); 
		} 

}
