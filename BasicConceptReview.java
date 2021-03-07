package preTest;

import java.util.Scanner;

//Purpose: Review of CPS 1231 Basic Concept
public class BasicConceptReview {

	public static void main(String[] args) {
		//1. Varibles
		int numOfIndex   = 1;
		long l  = 100000000;
		String j;
		double d;
		boolean b;
		char    c;
		
		numOfIndex=5;
		
		//2. Constants
		final double PI_VALUE =3.1415;
//		PI_VALUE =  3.1416;
		
		//3. Selection
			//if-else
		double score =95;
		String grade ="";
		if(score>=94) {
			grade="A";
		}
		else if(score>90){
			grade="A-";
		}
		else if(score>85) {
			grade="B+";
		}
		else {
			grade="B";
		}
		
		//Switch
		int price = 2;
		
		switch(price) {
			case 1:
////				System.out.println(price);break;
//			case 2:
//				System.out.println(price);break;
//			case 3:
//				System.out.println(price); break;
//			default:
//				System.out.println(price);
		}
		//A. 1    B. 1 1 1 1
		
	//Loops: For Loop, While Loop, Do-While Loop
		
		//a. For Loop:
		for(int i=0;i<50;i++) {
			
		}
		
		//b. While Loop
		int numToGuess =(int)(Math.random()*11);// -> [0,1)*11 ->[0,11)
//		System.out.println(numToGuess);

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your guess between 0 to 10");
		
		int userGuess = input.nextInt();
		
		while(userGuess!=numToGuess) {
			System.out.println("Your guess is not correct. Please eneter a new numbers:");		
			userGuess = input.nextInt();
		}
		
		System.out.println("Awesome! Your guess is correct!");		

	
		//c. do-While Loop
//		do {
//			//Statements
//		}while(true);
		
		
		//Math Function
			//a. Math.random()
		
			//b. trig. Functions
			//Math.sin(), Math.cos()
			
			//Goal: Round to nearest int. 
		    //Example: 1.9 -> 2
			//         1.1 -> 1
		
		
		 	double num1 = 1.1;
		 	
//			System.out.println(
//						Math.ceil(num1)); 
//			System.out.println(
//						Math.floor(num1));
//			System.out.println(
//					(int)Math.rint(num1));
			
		//Method:
		//Test Cases for sum Method:
		//1. Both are +
		System.out.println(sum(3,5)==8);
		
		//2. Both are -
		System.out.println(sum(-8,-1)==-9);

		//3. one is +, another is -
		System.out.println(sum(8,-1)==7);
		System.out.println(sum(-8,1)==-7);
		
		//4. Zeros
		System.out.println(sum(-8,0)==-8);
		System.out.println(sum(0,-8)==-8);
		
		System.out.println(sum(12,0)==12);
		System.out.println(sum(0,11)==11);

		System.out.println(sum(0,0)==0);

	}
	
	
	
	//Signature: sum:   int, int -> int
	//Purpose:   Compute the sum of two int numbers and return
	//Examples:  sum(1,0) ->1
	//           sum(5,-15) ->10
	//           sum(-8, -5) -> -13
	public static int sum(int num1, int num2) {
		
		return num1+num2;
	}
	
	
	
	

}
