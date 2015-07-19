package samplePrograms;

import java.util.ArrayList;
import java.util.List;

public class CollectionType {
	
	public static void main(String args[]){
		
		List a = new ArrayList();
		a.add(1);
		a.add("H");
		a.add("M");
		a.add("1.0");
		a.add(12.12);
		
		for(int i=0; i<a.size(); i++){
			Object x = a.get(i);
			if (x instanceof String || x instanceof Integer || x instanceof Double){
				System.out.println(x.toString());
			}
		}
		
		ArrayList<String> b = new ArrayList();
		b.add("HI");
		b.add("ITS");
		b.add("WORKING");
		b.add("FINE");
		
		ArrayList<String> c = new ArrayList();
		c.add("HELLO");
		c.add("ITS");
		c.add("WORKING");
		c.add("FINE");		
		
		ArrayList<String> d = new ArrayList();
		
		for(int j=0; j<b.size(); j++){
			if(b.get(j).contains(c.get(j))){
				System.out.println(b.get(j)+"==="+c.get(j));
			}
		}
		
		System.out.println("comparing both a and b as string : "+b.toString().compareToIgnoreCase(c.toString()));
		System.out.println("comparing both a and b as string : "+b.toString().contentEquals(c.toString()));
	}
	

}
