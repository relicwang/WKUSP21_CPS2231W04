package week12_fileIO;

import java.io.*;
import java.util.Scanner;

//Purpose:Read content from file
public class ReadContentFromFile {

	public static void main(String[] args) throws Exception{
		File fileHappy = new File("files/happy.txt");
		
		Scanner input = new Scanner(fileHappy);
		
		while(input.hasNext()) {
			System.out.println(input.nextLine());
		}
		
	}

}
