package samplePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Constractor {

	/**
	 * @param args
	 */
	static String s = "THIS IS A STATIC SENTENSE";
	
	static {
		System.out.println(s);
	}
	
	Constractor(){
		System.out.println("CALLING CONSTRACTOR");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constractor c = new Constractor();
		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(1,"EMP01",8000));
		e.add(new Employee(5,"EMP05",3000));
		e.add(new Employee(3,"EMP03",4000));
		e.add(new Employee(4,"EMP04",2000));
		e.add(new Employee(2,"EMP02",6000));
		
		Collections.sort(e);
		
		for(Employee emp : e){
			System.out.println(emp.getGetId()+"--"+emp.getGetName()+"--"+emp.getGetSalary());
		}
		
	}

}
