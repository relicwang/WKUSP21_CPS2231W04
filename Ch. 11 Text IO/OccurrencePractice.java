package week11_Exception;

import java.io.*;
import java.util.Scanner;

//Purpose: Remove the occurrence of the string (args[0]) in given file (args[1]).
public class OccurrencePractice {

	public static void main(String[] args) throws Exception{
	
		//1. Validate the args (has 2 args) 
		if(args.length!=2) {
			System.out.println("Incorrect Arguments");
			System.exit(1);
		}
		
		//2. Check whether file exist
		File file = new File(args[1]);
		
		if(!file.exists()) {
			System.out.println("File is not exist");
			System.exit(2);
		}
		
		//3.Read the file and removed the text (arg[0])
		
		Scanner input = new Scanner(file);
		
		StringBuilder sb = new StringBuilder();
		
		boolean isFirstLine = true;
//		String lineSeparator = System.getProperty("line.separator");
		String lineSeparator = "\n";
		System.out.println(lineSeparator);
		
		while(input.hasNext()) {
			String orgText = input.nextLine();
			String newText = orgText.replaceAll(args[0], "");
			if(isFirstLine) {
				sb.append(newText);
				isFirstLine=false;
			}
			sb.append(newText);
			sb.append(lineSeparator);
		}
		
		//Write the  text back to the file
		PrintWriter output = new PrintWriter(file);
		output.print(sb.toString());
		output.close();
	}

}
