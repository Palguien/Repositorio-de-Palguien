package practica3excep;

public class Lavavajillas extends Lavadoravajilla {
	protected int maxServicios;

	public Lavavajillas() {
		super();		
	}
	
	public Lavavajillas(Calif califEner,int consumo,int consumoMedio,int maxServicios) {
		super(califEner,consumo,consumoMedio);
		this.maxServicios=maxServicios;
	}
	
	public Lavavajillas(int maxServicios) {
		super();
		this.maxServicios=maxServicios;
	}

	public int getMaxServicios() {
		return maxServicios;
	}

	public void setMaxServicios(int maxServicios) {
		this.maxServicios = maxServicios;
	}	
}
