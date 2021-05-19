package week12_fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//Purpose: Write content to the file
public class WriteToFile {

	public static void main(String[] args) {
		File happyFile = new File("files/happy.txt");
		
		
		if(!happyFile.exists()){
			System.out.println("File is not exist!");
			System.exit(1);
		}
		else if(!happyFile.canWrite()) {
			System.out.println("File is not writable!");
			System.exit(2);

		}
		
		try {
			PrintWriter pw = new PrintWriter(happyFile);
			
			pw.println("abc");
			pw.println("123");
			pw.println("happy wku");

			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
