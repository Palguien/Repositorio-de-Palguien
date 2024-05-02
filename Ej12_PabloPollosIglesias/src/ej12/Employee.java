package ej12;

import javax.swing.JOptionPane;

public class Employee {
	//atributes
	final static String company="Michelin";
	private String name;
	private int age;
	private int increase;
	private static int baseSalary=1000;
	//builders
	public Employee() {
		super();
		setName(JOptionPane.showInputDialog("Name?"));
		setAge(Integer.parseInt(JOptionPane.showInputDialog("Age?")));	
		setIncrease(Integer.parseInt(JOptionPane.showInputDialog("Increase percentage?")));	
	}
	
	public Employee(String name,int age,int increase) {
		super();
		setName(name);
		setAge(age);
		setIncrease(increase);
	}
	//method
	public int getSueldoTotal() {
		return baseSalary+(baseSalary*(increase/100));
	}
	//get y set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getIncrease() {
		return increase;
	}
	public void setIncrease(int increase) {
		this.increase = increase;
	}
	public static int getBaseSalary() {
		return baseSalary;
	}
	public static void setBaseSalary(int Salary) {
		baseSalary = Salary;
	}
	public static String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", increase=" + increase + ", baseSalary = "+baseSalary+"]";
	}
	
}
