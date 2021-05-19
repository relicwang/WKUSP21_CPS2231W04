package week11_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//Purpose: Ask use to give a number,
//          and show corresponding month and number of days in the month
//         If the number is not valid, show incorrect number
public class PrintMonthAndDay {

	public static void main(String[] args) {
		// 1. Two Arrays represt. name of month and days of month
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		boolean repeat = true;
		while(repeat) {

			// 3. Access the corresponding month and dom in the array
			// and print it out
			try {
				// 2. Ask user to give us a integer number
				Scanner input = new Scanner(System.in);
				System.out.println("Please enter a number " + "represents the month");
				int number = input.nextInt();
				
				String month = months[number - 1];
				int days = dom[number - 1];
				System.out.printf("The month is %s, number of days are %d \n", month, days);
				repeat=false;
			
			} 
			catch (IndexOutOfBoundsException ex) {
				System.out.println("Incorrect Number");
			}
			catch(InputMismatchException ex) {
				System.out.println("Incorrect input type");
			}
			catch(Exception ex) {
				System.out.println("Incorrect Number");
			}
		
		}
	}

}
