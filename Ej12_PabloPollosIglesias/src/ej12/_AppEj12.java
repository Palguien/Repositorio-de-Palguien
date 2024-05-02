package ej12;

import javax.swing.JOptionPane;

public class _AppEj12 {

	public static void main(String[] args) {
		String[] options= {"1","2","3","4"};
		//Inicializamos
		int option,num;
		Employee[] plantilla = new Employee[2];
//		Employee empleado=new Employee();
//		plantilla[0]=empleado;;
//		Boss jefe=new Boss();
//		plantilla[1]=jefe;
		//bucle y menu
		do {
			//display menu
			System.out.println("1-Modify the base salary for all employees");
			System.out.println("2-Modify the bonus of all chiefs");
			System.out.println("3-Display the data of all employees");
			System.out.println("4-Exit");
			option=JOptionPane.showOptionDialog(null, "Select one", "Menu", 0, 0, null, options, 0);
			option++;
			switch(option) {
			case 1:
				num=(Integer.parseInt(JOptionPane.showInputDialog("New base salary?")));
				Employee.setBaseSalary(num);
				break;
			case 2:
				num=(Integer.parseInt(JOptionPane.showInputDialog("New bonus for bosses?")));
				Boss.setBonusBoss(num);
				break;
			case 3:
				for (int i = 0; i < plantilla.length; i++) {
					System.out.println(plantilla[i].toString());
				}
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid option");
			}
		}while(option!=4);

	}

}
