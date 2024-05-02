package filesYtal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//Do two files have the same content?
public class Act10 {

	public static void main(String[] args) {
		final String PATH="C:\\File";
		File file = new File(PATH,"example2.txt");
		File file2 = new File(PATH,"example.txt");
		if(filesIguales(file,file2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}

	}

	private static boolean filesIguales(File file, File file2) {
		int c,c2;
		long max = file.length();
		boolean iguales=true;
		if(file.length()!=file2.length()) {
			iguales = false;
			if(file.length()>file2.length()) {
				max=file.length();
			}else {
				max=file2.length();
			}
		}
		try {
			FileInputStream fileInput = new FileInputStream(file);
			FileInputStream fileInput2= new FileInputStream(file2);
			for (int i = 0; i < max; i++) {
				if((c = fileInput.read())!=(c2 = fileInput2.read())) {
					if(i>=file.length()) {
						System.out.println("<empty>!="+(char)c2);
					}
					if(i>=file2.length()) {
						System.out.println((char)c+"!=<empty>");
					}
					if(i<file2.length() && i<file.length()) {
						System.out.println("      "+(char)c+"!="+(char)c2);
					}
					
					iguales = false;
				}else {
					System.out.println("      "+(char)c+"="+(char)c2);
				}
			}
			fileInput.close();
			fileInput2.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return iguales;
	}

}
