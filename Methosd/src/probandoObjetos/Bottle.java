package probandoObjetos;

public class Bottle {
	//Atributes
	/**
	 * int, capacidad máxima de la botella
	 */
	private int volumeMax;
	/**
	 * int, volumen de liquido actual en la botella
	 */
	private int volumenFill;
	/**
	 * String, material de la botella
	 */
	private String material;
	/**
	 * String, color de la botella
	 */
	private String color;	
	//Constructor
	public Bottle() {
		setVolumeMax(100);
		setMaterial("plastic");
		setColor("clear");
		setVolumenFill(getVolumeMax());
	}	
	/**
	 * Constructor de Bottle
	 * @param max	int, capacidad máxima de la botella
	 * @param material	String, material de la botella
	 * @param color		String, color de la botella
	 * @throws IllegalArgumentException si se introduce un material incorrecto
	 * @throws IllegalArgumentException si se introduce un color incorrecto
	 */
	public Bottle(int max, String material, String color) {
		setVolumeMax(max);
		setMaterial(material.toLowerCase());
		setColor(color);
		setVolumenFill(getVolumeMax());
	}	
	/**
	 * Constructor de Bottle
	 * @param max	int, capacidad máxima de la botella
	 * @param material	String, material de la botella
	 * @param color		String, color de la botella
	 * @param llenado 	int, como de llena esta la botella
	 * @throws IllegalArgumentException si se introduce un material incorrecto
	 * @throws IllegalArgumentException si se introduce un color incorrecto
	 */
	public Bottle(int max, int llenado, String material, String color) {
		setVolumeMax(max);
		setMaterial(material.toLowerCase());
		setColor(color);
		setVolumenFill(llenado);
	}
	//Metodos
	/**
	 * Método que llena al máximo de su capacidad a la botella
	 */
	public void llenarBotella() {
		setVolumenFill(getVolumeMax());
	}
	/**
	 * Método que llena la botella añadiendo la cantidad indicada (hasta el máximo de la capacidad)
	 * @param cantidad	int, cantidad de liquido a añadir
	 */
	public void llenarBotella(int cantidad) {
		setVolumenFill(cantidad);
	}
	/**
	 * Vacía la botella
	 */
	public void drainBotella() {
		setVolumenFill(-getVolumenFill());
	}
	/**
	 * Método que vacía la botella eliminando la cantidad indicada (hasta 0)
	 * @param cantidad	int, cantidad de liquido a vaciar
	 */
	public void drainBotella(int cantidad) {
		if(cantidad>getVolumenFill()) {
			setVolumenFill(0);
		}else {
			setVolumenFill(-cantidad);
		}
	}
	/**
	 * Método que muestra por pantalla los atributos del objeto Bottle
	 */
	public void printBottle() {
		System.out.println("\t>>Capacidad: "+getVolumeMax());
		System.out.println("\t>>Cantidad: "+getVolumenFill());
		System.out.println("\t>>Material: "+getMaterial());
		System.out.println("\t>>Color: "+getColor());
	}
	/**
	 * Metodo estático que lee un vector de Bottle e imprime los parámetros de cada Bottle que tiene
	 * @param bar	Bottle[]
	 */
	public static void printBottleString(Bottle[] bar) {
		System.out.println("------------------------------");
		for (int i = 0; i < bar.length; i++) {
			bar[i].printBottle();
			System.out.println("------------------------------");
		}
		
	}
	/**
	 * Metodo estático que lee un vector de Bottle e imprime aquellas vacías
	 * De no haber ninguna botella vacía avisa
	 * @param bar	Bottle[]
	 */
	public static void findEmptyBottles(Bottle[] bar) {
		boolean nada = true;
		System.out.println("------------------------------");
		for (int i = 0; i < bar.length; i++) {
			if(bar[i].getVolumenFill()==0) {
				nada=false;
				bar[i].printBottle();
				System.out.println("------------------------------");
			}	
		}
		if(nada) {
			System.out.println("No hay botellas vacías");
		}
		
	}
	//Get y set
	/**
	 * Método get de volumeMax
	 * @return	int
	 */
	private int getVolumeMax() {
		return volumeMax;
	}
	/**
	 * Método set de volumeMax
	 * @param volumeMax	int
	 * @throws IllegalArgumentException si se introduce un volumen máximo negativo
	 */
	private void setVolumeMax(int volumeMax) {
		if(volumeMax<=0) {
			throw new IllegalArgumentException("Debe tener volumen");
		}
		this.volumeMax = volumeMax;
	}
	/**
	 * Método get de VolumeFill
	 * @return	int
	 */
	public int getVolumenFill() {
		return volumenFill;
	}
	/**
	 * Método set de VolumeFill, añade la cantidad indicada hasta el máximo (VolumeMax)
	 * @param volumenFill cantidad a añadir
	 */
	private void setVolumenFill(int volumneFill) {
		if(volumneFill+this.volumenFill>getVolumeMax()) {
			this.volumenFill=getVolumeMax();
		}else {
			this.volumenFill = this.volumenFill+volumneFill;
		}
	}
	/**
	 * Método get de material
	 * @return	String
	 */
	private String getMaterial() {
		return material;
	}
	/**
	 * Método set de material
	 * @param material	String, material del que está hecha la botella
	 * @throws IllegalArgumentException si se introduce un argumento null
	 * @throws IllegalArgumentException si se introduce un material incorrecto
	 */
	private void setMaterial(String material) {
		if(material==null) {
			throw new IllegalArgumentException("El parámetro material no puede ser nulo");
		}
		if(material!="glass" && material!="plastic" && material!="wood" && material!="steel" && material!="bone") {
			throw new IllegalArgumentException("El parámetro material debe ser: glass, plastic, wood, steel or bone.");
		}
		this.material = material;
	}
	/**
	 * Método get de color
	 * @return	String
	 */
	private String getColor() {
		return color;
	}
	/**
	 * Método set de color
	 * @param color		String, color de la botella
	 * @throws IllegalArgumentException si se introduce un argumento null
	 * @throws IllegalArgumentException si se introduce un color incorrecto
	 */
	private void setColor(String color) {
		if(color==null) {
			throw new IllegalArgumentException("El parámetro color no puede ser nulo");
		}
		if(color!="clear" && color!="brown" && color!="green" && color!="blue" && color!="white") {
			throw new IllegalArgumentException("El parámetro color debe ser: clear, brown, green, blue, white");
		}
		this.color = color;
	}
}