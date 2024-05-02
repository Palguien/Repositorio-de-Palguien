import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Vaporeon {
	public static void main(String[] args) {
		final String PATH="C:\\File";
		File fichero=new File(PATH,"textaco.txt");
//		JFileChooser fileChooser= new JFileChooser(PATH);
//		fileChooser.showOpenDialog(null);
//		File fich=fileChooser.getSelectedFile();
//		System.out.println();
		char caracter='V';
		int cont=0;
		try {
			@SuppressWarnings("resource")
			FileInputStream fileInput = new FileInputStream(fichero);
			int c;		
			for (int i = 0; i < fichero.length(); i++) {
				c = fileInput.read();
				if(c==caracter) {
					cont++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(cont);
	}

}
