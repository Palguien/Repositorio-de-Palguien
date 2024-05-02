package employeesAndMangers;

import javax.swing.JOptionPane;

public class Employee {
	//Atributes
	private String name;
	private int salary;
	//builder
	public Employee() {
		super();
		askEmployee();
	}
	//methods
	private void askEmployee() {
		setName(JOptionPane.showInputDialog("Name:"));
		setSalary(Integer.parseInt(JOptionPane.showInputDialog("Name:")));
	}

	public static Employee clone(Employee empleado1) {
		Employee empleado2 = new Employee();
		empleado2.setName(empleado1.getName());
		empleado2.setSalary(empleado1.getSalary());
		return empleado2;	
	}
	
	//Get y Set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}
