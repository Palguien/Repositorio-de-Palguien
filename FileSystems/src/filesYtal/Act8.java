package filesYtal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//Do two files have the same content?
public class Act8 {

	public static void main(String[] args) {
		final String PATH="C:\\File";
		File file = new File(PATH,"example - Copy.txt");
		File file2 = new File(PATH,"example.txt");
		if(filesIguales(file,file2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}

	}

	private static boolean filesIguales(File file, File file2) {
		int c,c2;
		if(file.length()!=file2.length()) {
			return false;
		}
		try {
			FileInputStream fileInput = new FileInputStream(file);
			FileInputStream fileInput2= new FileInputStream(file2);
			for (int i = 0; i < file.length(); i++) {
				if((c = fileInput.read())!=(c2 = fileInput2.read())) {
					System.out.println("Pos "+i);
					System.out.println((char)c+"!="+(char)c2);
					return false;
				}
				System.out.println((char)c+"="+(char)c2);
			}
			fileInput.close();
			fileInput2.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

}
