package filesYtal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Create copy (filename.txt -> filename - copia.txt)
public class Act9 {

	public static void main(String[] args) {
		final String PATH="C:\\File";
		String fileStr="example";
		String fileStrCopy=fileStr+" - Copia.txt";
		File fileName = new File(PATH,(fileStr+".txt"));
		File fileNameCopy = new File(PATH,(fileStrCopy));
		try {
			fileNameCopy.createNewFile();
			FileInputStream fileInput = new FileInputStream(fileName);
			FileOutputStream fileOut=new FileOutputStream(fileNameCopy);
			int c;		
			for (int i = 0; i < fileName.length(); i++) {
				c = fileInput.read();
				fileOut.write((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}