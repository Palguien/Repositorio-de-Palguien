package employeesAndMangers;

import javax.swing.JOptionPane;

public class Manager extends Employee {
	//Atributes
	private String uniDegree;
	private String department;
	//builder
	public Manager() {
		super();
		askManager();
	}
	//methods
	private void askManager() {
		setName(JOptionPane.showInputDialog("Name:"));
		setSalary(Integer.parseInt(JOptionPane.showInputDialog("Name:")));
		setUniDegree(JOptionPane.showInputDialog("UniDegree?:"));
		setDepartment(JOptionPane.showInputDialog("Department?:"));
	}
	public static Manager clone(Manager manager1) {
		Manager manager2 = new Manager();
		manager2.setName(manager1.getName());
		manager2.setSalary(manager1.getSalary());
		manager2.setDepartment(manager1.getDepartment());
		manager2.setUniDegree(manager1.getUniDegree());
		return (Manager) manager2;	
	}
	//Get y Set
	public String getUniDegree() {
		return uniDegree;
	}
	public void setUniDegree(String uniDegree) {
		this.uniDegree = uniDegree;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [uniDegree=" + uniDegree + ", department=" + department + ", getName()=" + getName()
				+ ", getSalary()=" + getSalary() + "]";
	}
	
}
