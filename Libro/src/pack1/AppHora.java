package pack1;
/**
 * @author Pablo
 */
public class AppHora {

	public static void main(String[] args) {
		
		try {
			Hora h1 = new Hora();
			dialogs.Dialogs.infoMessage(h1.toString());
			for (int i = 0; i < 35; i++) {
				h1.sumarSegundos();
			}
			dialogs.Dialogs.infoMessage(h1.toString());
		}catch(InvalidInicializationException e) {
			dialogs.Dialogs.showError("Objeto no inicializado por entrada incorrecta");
		}
		

	}

}
