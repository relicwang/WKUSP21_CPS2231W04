package week12_fileIO;

import java.io.*;
import java.util.Date;

//Purpose: Get the information (e.g. size) of the file using 
//           File class
public class GetStatusOfFile {
	
	public static void main(String[]args) {
	//Get info. about our file

	File files = new File("files");
	
	System.out.println("Is Directory/folder?"+ files.isDirectory());
	System.out.println("Is File?"+ files.isFile());

	if(files.isDirectory()) {
		File [] childFiles = files.listFiles();
		//==
		//  File  f1 = new File(files/test.txt)
		//  File  f2 = new File(files/test1.txt)
		//  File  f3 = new File(files/test2.txt)
		//  File  f4 = new File(files/test3.txt)
		//  File [] childFile ={f1,f2,f3,f4};
		
		for(File item: childFiles) {
			System.out.print(item.getName()+" size is: ");
			System.out.println(item.length());
			
			System.out.printf("%s created on %s \n", 
					item, new Date(item.lastModified()));
		}
	
	}
	
	//Rename test1.txt -> happy.txt
	
	File orgFile = new File("files/test3.txt");
	
	File destFile = new File("files/happyMost.txt");

	System.out.println("Renamed? "+orgFile.renameTo(destFile));
	
	System.out.println("orgFile object is exist? "+orgFile.exists());
	System.out.println("destFile object is exist? "+destFile.exists());

	
	
	//Step 3:   listFiles() ---
//	
//	System.out.println("The absolute path is: "+file.getAbsolutePath());
//	System.out.println("Size of file is: "+file.length());
//	
//	

	}
}
