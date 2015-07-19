package samplePrograms;

public class Employee implements Comparable<Employee>{

	/**
	 * @param args
	 */
private int getId;
private String getName;
private int getSalary;

public Employee(int getId, String getName, int getSalary) {
	super();
	this.getId = getId;
	this.getName = getName;
	this.getSalary = getSalary;
}

public int getGetId() {
	return getId;
}
public void setGetId(int getId) {
	this.getId = getId;
}
public String getGetName() {
	return getName;
}
public void setGetName(String getName) {
	this.getName = getName;
}
public int getGetSalary() {
	return getSalary;
}
public void setGetSalary(int getSalary) {
	this.getSalary = getSalary;
}

@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	return (this.getSalary - o.getSalary);
}


}
