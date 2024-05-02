package practicaClases;
/**
 * @author Pablo Pollos Iglesias
 *	Clase CuentaCorriente
 */
public class CuentaCorriente {
	
	//Atributos
	private String dni ;
	private String titular;
	private double saldo;
	private static float tipoInteres = 3.5f;
	private Gestor gestorCuenta;
	
	//Constructores
	/**
	 * Constructor de la clase CuentaCorriente
	 * @param dNI
	 * @param titular
	 */
	public CuentaCorriente(String dNI,String titular) {
		this(dNI,titular,0,null);
	}
	/**
	 * Constructor de la clase CuentaCorriente
	 * @param dNI
	 * @param titular
	 * @param saldo
	 */
	public CuentaCorriente(String dNI,String titular, double saldo) {
		this(dNI,titular,saldo,null);
	}
	/**
	 * Constructor de la clase CuentaCorriente
	 * @param dNI
	 * @param saldo
	 */
	public CuentaCorriente(String dNI,double saldo) {
		this(dNI,"",saldo,null);
	}
	/**
	 * Constructor de la clase CuentaCorriente
	 * @param dNI
	 * @param titular
	 * @param saldo
	 * @param gestor
	 */
	public CuentaCorriente(String dNI,String titular, double saldo, Gestor gestor) {
		setDNI(dNI);
		setTitular(titular);
		setSaldo(saldo);
		setGestorCuenta(gestor);
	}
	
	//Metodos
	/**
	 * Método que intenta sacar dinero de la cuenta
	 * @param dinero	double, dinero a retirar
	 * @return boolean	true si ha realizado la operación, false si no se ha podido
	 */
	public boolean extraerDinero(double dinero) {
		if(dinero>getSaldo()) {
			return false;
		}else {
			setSaldo(getSaldo()-dinero);
			return true;
		}	
	}
	/**
	 * Método que ingresa dinero en la cuenta
	 * @param dinero
	 */
	public void ingresarDinero(double dinero) {
		setSaldo(dinero+getSaldo());
	}
	/**
	 * Método de la clase CuentaCorriente que muestra el valor de los atributos
	 */
	public void mostrarInformacion() {
		System.out.println(toString());
	}
	
	//Gets y sets
	/**
	 * Método get del atributo DNI
	 * @return String	DNI
	 */
	public String getDNI() {
		return dni;
	}
	/**
	 * Método set del atributo DNI
	 * @param dNI	String
	 */
	public void setDNI(String dNI) {
		this.dni = dNI;
	}
	/**
	 * Método get del atributo titular
	 * @return String	titular
	 */
	public String getTitular() {
		return titular;
	}
	/**
	 * Método set del atributo titular
	 * @param titular	String
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}
	/**
	 *  Método get del atributo saldo
	 * @return	double positivo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 *  Método set del atributo saldo, privado para que haya que usar el método ingresarDinero
	 * @param saldo2	double
	 */
	private void setSaldo(double saldo2) {
		this.saldo = saldo2;
	}
	/**
	 * Método get del atributo tipoInteres (static)
	 * @return	float	tipo de Interés
	 */
	public static float getTipoInteres() {
		return tipoInteres;
	}
	/**
	 * Método set del atributo tipoInteres (static)
	 * @param tipoInteres
	 */
	public static void setTipoInteres(float tipoInteres) {
		CuentaCorriente.tipoInteres = tipoInteres;
	}
	/**
	 * Método get del atributo gestor
	 * @return gestorCuenta	Gestor
	 */
	public Gestor getGestorCuenta() {
		return gestorCuenta;
	}
	/**
	 * Método set del atributo gestor
	 * @param gestorCuenta	Gestor
	 */
	public void setGestorCuenta(Gestor gestorCuenta) {
		this.gestorCuenta = gestorCuenta;
	}
	
	/**
	 * Método toString de la clase CuentaCorriente
	 */
	@Override
	public String toString() {
		return "CuentaCorriente [DNI=" + dni + ", titular=" + titular + ", saldo=" + saldo + "]"+"Gestor de la cuenta >>"+getGestorCuenta().toString();
	}
}
