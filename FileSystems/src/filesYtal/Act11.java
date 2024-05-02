package filesYtal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Act11 {

	public static void main(String[] args) {
		final String PATH="C:\\File";
		File fileName = new File(PATH,"ejemplo.txt");
		String str="dickweed \n salto de linea";
		char cha = 'A';
		try {
			FileOutputStream fileOut=new FileOutputStream(fileName,true);
			for (int i = 0; i < str.length(); i++) {
				fileOut.write(str.charAt(i));
			}
			fileOut.write(cha);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		printFile(fileName);

	}
	
	private static void printFile(File file) {
		int c;
		try {
			FileInputStream fileInput = new FileInputStream(file);
			while((c = fileInput.read())!=-1) {
				System.out.print((char)c);
			}
			System.out.println();
			fileInput.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
