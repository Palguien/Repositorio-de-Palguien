package ficheros;

public class LineaOrden {

	private String descrip;
	private int unidades;
	private double precio;
	
	
	
	public LineaOrden(String descrip, int unidades, double precio) {
		this.descrip=descrip;
		this.precio=precio;
		this.unidades=unidades;
	}
	
	
	public String getDescrip(){
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip=descrip;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades=unidades;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}


	@Override
	public String toString() {
		return "LineaOrden [descrip=" + descrip + ", unidades=" + unidades + ", precio=" + precio + "]";
	}
	
	
}