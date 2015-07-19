package sampleProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Constractor {
	
	static int count=0;
	Constractor()
	{
		System.out.println("created");
		count++;
	}
	
	static{
		System.out.println("static");
	}
	{
		System.out.println("test");
	}
	public void m1()
	{
		System.out.println("m1");
		System.out.println(count);
	}
	
	public static void main(String args[])
	{
		
		Constractor test=new Constractor();
		String str="H AAAA";
		
		str.replaceAll("\\s+","");
		
		System.out.println(str.replaceAll("\\s+",""));
		
		test.m1();
		
		
		List<Employee> emp=new ArrayList<Employee>();
		
		emp.add(new Employee(1, "A", 20, 2000));
		emp.add(new Employee(3, "E", 20, 3000));
		emp.add(new Employee(2, "C", 10, 4000));
		emp.add(new Employee(5, "B", 20, 5000));
		emp.add(new Employee(4, "D", 20, 6000));
		
		for(Employee e:emp)
		{
		System.out.println(e.getId()+"-"+e.getName());	
		}
		
		Collections.sort(emp);
		
		System.out.println(emp);
		
		for(Employee e: emp)
		{
		System.out.println(e.getId()+"-"+e.getName());	
		}
		
		
		
		
	}
}
