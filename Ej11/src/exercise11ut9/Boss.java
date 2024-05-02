package exercise11ut9;

import exercise6ut7b.EmployeeSpecial;

public class Boss extends Employee{
	EmployeeSpecial emp;	
	
	public Boss(){
		super();
	}
	
	public Boss(Object name){
		super();
		this.emp = (EmployeeSpecial) name;
	}
}
