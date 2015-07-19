import java.util.*;



public class Stringtest {

	public static void main(String[] args)
	{
		
		//M1("");
		
		
		List ll=new ArrayList();
		
		ll.add("asss");
		
	 ll.add(10);
	 ll.add(1.00);
	 ll.add("badd");
	 
	 Collections.sort(ll, Collections.reverseOrder());
	 
	 Iterator it=ll.iterator();
	 
	 while (it.hasNext())
	 {
		 
		System.out.println(it.next()); 
	 }
	 
		
		
	}
	
	
	
	
	public static void M1(String x,int val)
	{
		
		
		
		
	}
}
