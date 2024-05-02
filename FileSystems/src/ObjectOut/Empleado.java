package ObjectOut;

import java.io.Serializable;

public class Empleado implements Serializable{
	//en caso de usar linea de serializacion binaria al escribir objetos en fichero para leerlos 
	//tienen que tener el mismo serialVersion y el mismo nombre de paquete
	private static final long serialVersionUID = 3L;
	
	double salary;
	int age;
	String name;
	
	public Empleado(String description, int units, double price ) {
		super();
		this.salary = price;
		this.age = units;
		this.name = description;
	}
	
	@Override
	public String toString() {
		return "Empleado [salario=" + salary + ", edad=" + age + ", nombre=" + name + "]";
	}
	
	
}
