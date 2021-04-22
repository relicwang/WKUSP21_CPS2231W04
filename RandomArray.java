package twoDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

//Purpose: Create a random double array where 
//           the dimension is specified by user
//           the range of random value is [0,49)
public class RandomArray {

	public static void main(String[] args) {
		//1. Get dimension from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows"
				+ " and number of columns seperated by a space:");
		int numOfRow = input.nextInt();
		int numOfColumn = input.nextInt();

		//2. Define a double array
		double [][] randomArray = new double [numOfRow][numOfColumn];
		
		//3. Fill the array with random value in [0,49)
		for(int rowIndex =0; rowIndex< randomArray.length;rowIndex++) {
			for(int colIndex=0; colIndex<randomArray[rowIndex].length;colIndex++) {
				randomArray[rowIndex][colIndex]=Math.random()*49;
			}
		}
		
		//4. Print the array
		for(int rowIndex =0; rowIndex< randomArray.length;rowIndex++) {
			System.out.println(Arrays.toString(randomArray[rowIndex]));
		}
		
		
	}
	

}
