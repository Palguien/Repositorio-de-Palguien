package exercise2;

public class Employee {
	//Atributes
	private static String companyName="COMPANY.SA";
	private Dni dni;
	private String name;
	private String city;
	private int day;
	private int month;
	private int year;
	private final int thisYear=2024;
	//Builder
	public Employee(Dni dni, String name, String city, int day, int month, int year) {
		super();
		this.dni = dni;
		this.name = name;
		this.city = city;
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	public Employee(Dni dni, String name, String city, String date) {
		super();
		this.dni = dni;
		this.name = name;
		this.city = city;
		setDate(date);
		
	}
	public Employee() {
		super();
	}
	//Methods
	//Calcula la edad del empleado teniendo en cuanta la fecha actual 3/5/2024
	public int calculatesAge() {
		return thisYear-year;
	}
	
	public void setDate(String date) {
		String aux ="";
		int dayAux,monthAux,yearAux;
		if(date.length()!=10) {
			throw new IllegalArgumentException("Fecha con formato incorrecto");
		}else {
			aux=aux+date.charAt(0)+date.charAt(1);
			dayAux=Integer.parseInt(aux);
			aux="";
			aux=aux+date.charAt(3)+date.charAt(4);
			monthAux=Integer.parseInt(aux);
			aux="";
			aux=aux+date.charAt(6)+date.charAt(7)+date.charAt(8)+date.charAt(9);
			yearAux=Integer.parseInt(aux);
			aux="";
			//Si funcionase comprobarfechas() lo usaríamos aquí
			setDay(dayAux);
			setMonth(monthAux);
			setYear(yearAux);
		}
	}
	//get y set
	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	public Dni getDni() {
		return dni;
	}
	public void setDni(Dni dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Employee [dni=" + dni + ", name=" + name + ", city=" + city + ", day=" + day + ", month=" + month
				+ ", year=" + year + "]";
	}
	
	
}
