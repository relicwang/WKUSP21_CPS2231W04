package week11_Exception;

import java.io.*;

public class FileClassPractice {

	public static void main(String[] args) {
		//1. Get file Info
		File file = new File("images9");

		System.out.println("Is file exist: " + file.exists());

		File newFile = new File("images7");
		System.out.println("Is name successfully revised: " + file.renameTo(newFile));

		
		System.out.println("Is file exist: " + file.exists());
		System.out.println("Is file exist: " + newFile.exists());

		if (file.exists()) {
			if (file.isDirectory()) {

				File[] files = file.listFiles();
				for (File curtFile : files) {
					System.out.println(curtFile.getName());
				}
			}
		}
		
		//2. Write text to file
		
	

	}

}
