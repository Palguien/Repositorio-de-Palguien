package filesYtal;

import java.io.File;
import java.io.IOException;

public class UsingFile {

	public static void main(String[] args) {
		
		final String PATH="C:\\File";
		File fileName = new File(PATH);
		File fileName2;
		if(!fileName.exists()) {
			System.out.println("Does not exists");
			System.out.println("relative: "+fileName.getPath());
			System.out.println("absolute: "+fileName.getAbsolutePath());
			try {
				fileName.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("relative: "+fileName.getPath());
			System.out.println("absolute: "+fileName.getAbsolutePath());
			if(fileName.isDirectory()) {
				System.out.println("is a directory");
				System.out.println("---Contents:");
				for (String elemento : fileName.list()) { //otra opción >>> filename.listFiles -> Da Array de File
					System.out.println("--->"+elemento);
					fileName2=new File(PATH,elemento);
					if(fileName2.isDirectory()) {
						System.out.println("is a directory");
					}else {
						System.out.println("is a file");
					}
				}
				System.out.println("------");
			}else {
				System.out.println("is a file");
			}
		}

	}

}
