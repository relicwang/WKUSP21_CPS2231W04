package week11_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
//import static java.lang.System.out;

//Purpose: Have fun with file class
public class TestFile {

	public static void main(String[] args) {
//		//1. Acces Directory
//		File file = new File("docs");
//		
//		System.out.println("Is file a directory?  \n"+file.isDirectory());
//		
//		if(file.isDirectory()) {
//			File [] files = file.listFiles();
//			
//			for(File item: files) {
//				System.out.println(item.getName());
//				System.out.println(new Date(item.lastModified()));
//				System.out.println("Can Read? " +item.canRead());
//				System.out.println("Can Write? " +item.canWrite());
//			}
//		}
		
		//2. Write File
		File f1 = new File("docs/test5.txt");
		
		if(!f1.exists()) {
			System.out.println("The file is not exist");
			System.exit(0);
		}
		
		try {
			PrintWriter output = new PrintWriter(f1);
			output.print("Tom K Wu ");
			output.println(152);
			output.print("Jack K Peng ");
			output.println(152);
			
			output.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. Read File
		
		
		try {
			Scanner input = new Scanner(f1);
			while(input.hasNext()) {
				String info = input.next();
				
				System.out.println(info);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
