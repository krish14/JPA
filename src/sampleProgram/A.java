package sampleProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class A {
public static void main(String args[])
{

	String s1="helloharihhhh";

	Map<Character,Integer> map=new HashMap<Character, Integer>();
	
	for(int i=0;i<s1.length();i++)
	{
		System.out.println(s1.charAt(i));
		
		
		System.out.println(map.containsKey(s1.charAt(i)));
		if(map.containsKey(s1.charAt(i)))
		{
			int count=map.get(s1.charAt(i));
			System.out.println("tests"+count);
			
			map.put(s1.charAt(i),count+1);
		}
		else
		{
			System.out.println("test"+i);
			map.put(s1.charAt(i),1);
		}
		
		
	}
	
	for(int i=0;i<s1.length();i++)
	{
		
		
		System.out.println(map.get(s1.charAt(i)));
		if(map.get(s1.charAt(i))==2){System.out.println("TTT");}

			//System.out.println(s1.charAt(i));
	}
	
	/*Iterator it=map.entrySet().iterator();
	
	while(it.hasNext())
	{
		Map.Entry m=(Map.Entry)it.next();
	
		System.out.println(m.getKey()+"---"+m.getValue());
	
		
	
	}*/
	
	

}
}
