package pack1;

import javax.swing.JOptionPane;
/**
 * @author Pablo
 */
public class Hora {
	//atributes
	/**
	 * atribute hora 	int[0,inf)
	 */
	private int hora;
	/**
	 * atribute minutos 	int[0,59]
	 */
	private int minutos;
	/**
	 * atribute segundos 	int[0,59]
	 */
	private int segundos;
	//builder
	/**
	 * Builder without parameters of hora. Asks for parameters later
	 * @throws InvalidInicializationException	if the introduced parameters that the method askData() asks are invalid
	 */
	public Hora() throws InvalidInicializationException {
		super();
		askData();
	}
	/**
	 * Builder with parameters of hora.
	 * @throws InvalidInicializationException	if the introduced parameters are invalid
	 */
	public Hora(int hora,int minutos,int segundos) throws InvalidInicializationException {
		try {
			setHora(hora);
			setMinutos(minutos);
			setSegundos(segundos);
		}catch(Exception e) {
			throw new InvalidInicializationException();
		}
		
	}
	//methods
	/**
	 * method that asks for values to set in Hora
	 * @throws InvalidInicializationException	if the values are negative or aut of range
	 */
	private void askData() throws InvalidInicializationException {
		try {
			setHora(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la hora")));
			setMinutos(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la minutos")));
			setSegundos(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la segundos")));
		}catch(Exception e) {
			throw new InvalidInicializationException();
		}
		
	}
	public void sumarSegundos() {
		segundos++;
		if(segundos>=60) {
			segundos=0;
			minutos++;
		}
		if(minutos>=60) {
			minutos=0;
			hora++;
		}
	}
	//get y set
	/**
	 * get from hora atribute
	 * @return int(not negative)
	 */
	public int getHora() {
		return hora;
	}
	/**
	 * set from hora atribute
	 * @param hora	int
	 * @throws NegativeNumberException	if hora is negative
	 */
	public void setHora(int hora) throws NegativeNumberException {
		if(hora<0) {
			throw new NegativeNumberException();
		}
		this.hora = hora;
	}
	/**
	 * get from minutos atribute
	 * @return int[0-59]
	 */
	public int getMinutos() {
		return minutos;
	}
	/**
	 * set from minutos atribute
	 * @param minutos	int
	 * @throws NegativeNumberException	if minutos is negative
	 * @throws OutOfRangeException	if minutos>=60
	 */
	public void setMinutos(int minutos) throws NegativeNumberException, OutOfRangeException {
		if(minutos<0) {
			throw new NegativeNumberException();
		}
		if(minutos>59) {
			throw new OutOfRangeException();
		}
		this.minutos = minutos;
	}
	/**
	 * get from segundos atribute
	 * @return int[0-59]
	 */
	public int getSegundos() {
		return segundos;
	}
	/**
	 * set from segundos atribute
	 * @param segundos	int
	 * @throws NegativeNumberException	if segundos is negative
	 * @throws OutOfRangeException	if segundos>=60
	 */
	public void setSegundos(int segundos) throws NegativeNumberException, OutOfRangeException {
		if(segundos<0) {
			throw new NegativeNumberException();
		}
		if(segundos>59) {
			throw new OutOfRangeException();
		}
		this.segundos = segundos;
	}
	/**
	 * ToString from Hora
	 */
	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + "]";
	}
	
		
}
