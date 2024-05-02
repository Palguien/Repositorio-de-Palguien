package JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int resp;
		Dialogos dialog=new Dialogos();
		int num=dialog.pedirEntero("Dime un numero");
		dialog.mensajeInfo(Integer.toString(num),"Aplicación de Cris");
		float num2=dialog.pedirFloat("Dime un número decimal (punto decimal)");
		dialog.mensajeInfo(Float.toString(num2),"Aplicación de Cris");
		double num3=dialog.pedirDouble("Dime un número decimal (punto decimal)");
		dialog.mensajeInfo(Double.toString(num3),"Aplicación de Cris");
		resp=dialog.confirmaDialogo("¿Te gusta el java?");
		if (resp==0)
			dialog.mensajeInfo("Sí te gusta Java","Aplicación de Cris");
		else {
			if (resp==1)
				dialog.mensajeInfo("No te gusta Java","Aplicación de Cris");
			else
				dialog.mensajeInfo("FIN","Aplicación de Cris");
		}
	}

}
