package employeesAndMangers;

import java.util.Scanner;

public class _AppEmployees {

	public static void main(String[] args) {
		Employee[] personal = new Employee[7];
		Employee empleado = new Employee();
		Manager manager = new Manager();
		int num;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input employees");
		for (int i = 0; i < 5; i++) {
			System.out.println("Employee "+(i+1)+" :");
			System.out.println("Name?");
			empleado.setName(keyboard.nextLine());
			do {
				System.out.println("Salary?");
				num=keyboard.nextInt();
				keyboard.nextLine();
			}while(num<0);
			empleado.setSalary(num);
			personal[i]=Employee.clone(empleado);
		}
		System.out.println("Input managers");
		for (int i = 0; i < 2; i++) {
			System.out.println("Manager "+(i+1)+" :");
			System.out.println("Name?");
			manager.setName(keyboard.nextLine());
			do {
				System.out.println("Salary?");
				num=keyboard.nextInt();
				keyboard.nextLine();
			}while(num<0);
			manager.setSalary(num);
			System.out.println("Degree?");
			manager.setUniDegree(keyboard.nextLine());
			System.out.println("Department?");
			manager.setDepartment(keyboard.nextLine());
			personal[i+5]=Manager.clone(manager);
		}
		for (int i = 0; i < personal.length; i++) {
			System.out.println(personal[i].toString());
		}
		keyboard.close();

	}

}
