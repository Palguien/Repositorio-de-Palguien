package filesYtal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//How many a character appears?
public class Act7 {
	public static void main(String[] args) {
		final String PATH="C:\\File";
		File file = new File(PATH,"example.txt");
		char cha='A';
		System.out.println("Hay "+countFile(file,cha)+" instancias de "+cha);
		
	}

	private static int countFile(File file,char cha) {
		int c, total=0;
		try {
			FileInputStream fileInput = new FileInputStream(file);
			while((c = fileInput.read())!=-1) {
				if((char)c==cha) {
					total++;
				}
			}
			fileInput.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return total;
	}
	
}
