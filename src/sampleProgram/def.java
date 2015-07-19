package sampleProgram;
import java.util.*;


public class def {
	public static void main(String[] args)
	{
	SortedSet<String> set = new TreeSet<String>();
    
    // populate the set
    set.add("Welcome");
    set.add("to");
    set.add("TP");
    set.add("TP");
    set.add("TP");
    System.out.println("Initial set value: "+set);
    
    set.remove("TP");
    System.out.println("Initial set value: "+set);
    
    // create unmodifiable sorted set
    Set unmodsortset = Collections.unmodifiableSortedSet(set);

    
    List ll=new ArrayList();
    
    ll.add("A");
    ll.add("A");
    ll.add("A");
    ll.add("b");
    ll.add("b");
    
    ll.removeAll(Collections.singleton("b"));
    Iterator it=ll.iterator();
    
    while ( it.hasNext())
    {
    	System.out.println(it.next());
    	
    }
    
    
    
    
    
    // try to modify the sorted set
   // unmodsortset.add("Hello");
}
}