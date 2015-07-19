import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Test {
public static void main(String args[])
{
	List ll =new ArrayList();
	
	ll.add("a");
	ll.add("b");
	ll.add("a");
	
	Collections.sort(ll);
	
	Iterator it=ll.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
String[] test=new String[ll.size()];


	ll.toArray(test);
	for(String xx:test)
	{
		System.out.println(xx);
		
	}
	
	
	
	HashMap map=new HashMap();
	
	map.put("1", "hari");
	map.put("2", "test");
	map.put("2", "zero");
	map.put("3", "check");
	
	
	Iterator mapit=map.entrySet().iterator();
	
	while(mapit.hasNext())

	{
		Map.Entry  entry=(Entry) mapit.next();
 
		System.out.println(entry.getKey()+"=="+entry.getValue());
		
		
	}
	
	
	
	
	
}
}
