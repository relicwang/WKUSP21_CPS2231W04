package twoDimensionArray;

import java.util.Arrays;

//Purpose: Record the temperature history of past three weeks

public class TemperatureHistory {

	public static void main(String[] args) {
		//Approach 1: 
		int[][] temperature = new int [3][7];
	
		
		//Week 1 Temperature
		temperature[0][0]=8;
		temperature[0][1]=16;
		temperature[0][2]=12;
		temperature[0][3]=10;
		temperature[0][4]=9;
		temperature[0][5]=14;
		temperature[0][6]=7;
		
		//Week 2 Temperature
		temperature[1][0]=12;
		temperature[1][1]=4;
		temperature[1][2]=19;
		temperature[1][3]=4;
		temperature[1][4]=12;
		temperature[1][5]=3;
		temperature[1][6]=14;

		//Week 3 Temperature
		temperature[1][0]=9;
		temperature[1][1]=27;
		temperature[1][2]=27;
		temperature[1][3]=6;
		temperature[1][4]=3;
		temperature[1][5]=28;
		temperature[1][6]=13;
		
		//Approach 2: 
		int[][] temperature2 = {{8,16,12,10,9,14,7},
								{12,4,19,4,12,3,14},
								{9,27,27,6,3,28,13}
								};
	

		
		//Print Element using our own code)
		//		Idea: int rowIndex = 2;//0 -> 1 ->2
		for(int rowIndex =0;rowIndex<temperature2.length;rowIndex++) {
			for(int columnIndex=0;columnIndex<temperature2[rowIndex].length;columnIndex++) {
				System.out.printf("%-4s", temperature2[rowIndex][columnIndex]);
			
			}
			System.out.println();
		}
		
		//Print Element using library:Arrays.toString()
		for(int rowIndex =0;rowIndex<temperature2.length;rowIndex++) {
			System.out.println(Arrays.toString(temperature2[rowIndex]));
		}
		
		System.out.println(Arrays.toString(temperature2));//Incorrect
		
		
		//Compute the sum of all element
		double sum =0;

		//1. Iterate through all rows/1D Array
		for(int rowIndex=0;rowIndex<temperature2.length;rowIndex++) {		
			
			//2. Iterate through all element among current 1D Array
			for(int colIndex=0;colIndex<temperature2[rowIndex].length;colIndex++) {
				sum+=temperature2[rowIndex][colIndex];
				}
			
		
		}
		System.out.println("The Total Temperature  is: "+ sum);

		//Compute the sum of individual Week
		//1. Iterate through all rows/1D Array
		for(int rowIndex=0;rowIndex<temperature2.length;rowIndex++) {		
			double weelySum =0;
			
			//2. Iterate through all element among current 1D Array
			for(int colIndex=0;colIndex<temperature2[rowIndex].length;colIndex++) {
				weelySum+=temperature2[rowIndex][colIndex];
				}
			
			System.out.println("The Total Temperature for Week "+rowIndex+" is: "+ weelySum);
		}
		
		
		
		//Compute Average Temperature
		double averageTemp= sum/(temperature2.length*temperature2[0].length);
		System.out.println("The average temperature is "+averageTemp);
		
		
		
		//Count total number of days that has temperature > 8
		
		int totalDays = 0;
		//1. Iterate through all rows/1D Array
		for(int rowIndex=0;rowIndex<temperature2.length;rowIndex++) {		
			//2. Iterate through all element among current 1D Array
			for(int colIndex=0;colIndex<temperature2[rowIndex].length;colIndex++) {
				if(temperature2[rowIndex][colIndex]>8) {
					totalDays++;
				}
			}
		
		}
		System.out.println("Total Number of days that has temperature has than 8"
				+ " is "+totalDays);
		
		//Find Highest Temperature among 3 week
		
		double highestTemp = temperature2[0][0];
		
		for(int rowIndex=0;rowIndex<temperature2.length;rowIndex++) {
			for(int colIndex=0;colIndex<temperature2[rowIndex].length;colIndex++) {
				if(highestTemp<temperature2[rowIndex][colIndex]) {}
				highestTemp=temperature2[rowIndex][colIndex];
			}
		}
		
		
		//Find largest value for each row
		//  == Find highest temperature for each week 
		
		//1. double highestTempPerRow;//
		for(int rowIndex=0;rowIndex<temperature2.length;rowIndex++) {
			
			double highestTempPerRow=temperature2[rowIndex][0];
			
			for(int colIndex=0;colIndex<temperature2[0].length;colIndex++) {
				if(highestTempPerRow<temperature2[rowIndex][colIndex]) {
					highestTempPerRow=temperature2[rowIndex][colIndex];
				}		
			}
			
			//DONE VISITING CURRENT ROW
			
			System.out.println("The highest temperature for Week "+rowIndex +" is "+ highestTempPerRow);
		}
		
		//Find largest value for each column 
		//  == Find highest temperature for individual week of day in past 3 weeks
		//Give us colIndex one after another -> help us visiting each columns
		
		for(int colIndex=0;colIndex<temperature2[0].length;colIndex++) {
			double highestTempPerColumn=temperature2[0][colIndex];
			
			//Give us rowIndex -> visit individual elements in each columns
			for(int rowIndex=0;rowIndex<temperature2.length;rowIndex++) {
				if(highestTempPerColumn<temperature2[rowIndex][colIndex]) {
					highestTempPerColumn=temperature2[rowIndex][colIndex];				
				}	
			}
			System.out.println("The highest temperature for Day "+colIndex +" in history is "+ highestTempPerColumn);
		}

	
	}
}
	
	
	
