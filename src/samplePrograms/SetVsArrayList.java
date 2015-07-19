package samplePrograms;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetVsArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedSet<String> set = new TreeSet<String>();
		set.add("A");
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		
		//Collection, List, Set, Map, StoredSet, StoredMap
		Set s = Collections.unmodifiableSortedSet(set);
		System.out.println(s);
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("A");
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");

		a.removeAll(Collections.singleton(a));
		
		Iterator i = a.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	    // Try to modify the sorted set
		 s.add("E");
		 System.out.println(s);
		
	}

} 
