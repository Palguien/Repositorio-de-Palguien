package filesYtal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputExample {

	public static void main(String[] args) {
		
		final String PATH="C:\\File";
		File file = new File(PATH,"example.txt");
		String str="\n\n venom of venus or a fairytale ";
		int c;	
		//printFile(file);
		try {
			FileOutputStream fileOut=new FileOutputStream(file,true);
			for (int i = 0; i < str.length(); i++) {
				fileOut.write(str.charAt(i));
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		printFile(file);
		
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
