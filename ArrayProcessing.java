package arrayReview;

import java.util.Arrays;
import java.util.Scanner;

//Purpose: Review of Array Processing
public class ArrayProcessing {

	public static void main(String[] args) {
		//1. Declare and initialize an array
			//a.Declare and initialize array in 2 steps 		
			int[] arr1;
			arr1 = new int[10];
			
			//b. Declare and initialize array in 1 step
			int[] arr2 = new int[10];
			
			//Assign the values to array
			arr1[0]=55;
			arr2[5]=69;
			
			//c. Short-hand approach
			int[] arr3 = {5,3,6,7};
			
		//2. Processing Array
			//a. Array Element value is from user
//			Scanner input = new Scanner(System.in);
//			System.out.println("Please eneter "+arr1.length+"numbers value");
//			
//			for(int i=0;i<arr1.length;i++) {
//				arr1[i]=input.nextInt();
//			}
//			
			//b.Array Element value is from program-Random Numebr
			for(int i=0;i<arr2.length;i++) {
				arr2[i]=(int)(Math.random()*100);
			}
		
		//3. Print the elements in array
//			System.out.println(arr2);
//			for(int i=0;i<arr2.length;i++) {
//				System.out.print(arr2[i]+" ");
//			}
			
//			System.out.println("\n"+Arrays.toString(arr2));
		
		//4. Sum all elements values
			
			int sum =0;
			
			for(int i=0;i<arr2.length;i++) {
				sum = sum+arr2[i];
			}
		
		//5. Find largest number (smallest #) and correspond index
			int max = arr2[0];//The largest # so-far
			int min = arr2[0];//The smallest # so-far
			
			int maxIndex =0;//Index for largest #
			int minIndex =0;//Index for smallest #
			
			for(int i=1;i<arr2.length;i++) {
				if(arr2[i]>max) {
					max = arr2[i];
					maxIndex=i;
				}
				
				if(arr2[i]<min) {
					min=arr2[i];
					minIndex=i;
				}
			}
			
		//6. Array Random Shuffling
			for(int i=0;i<arr2.length;i++) {
			  int randomIndex=(int)Math.random()*arr2.length; //[0,1)  -> [0, arr2.length)->[0,arr2.length-1]
			
			  //Swap values
			  if(i!=randomIndex) {
				  int temp = arr2[i];
				  arr2[i]= arr2[randomIndex];
				  arr2[randomIndex]= temp;
			  }
			}
			
//			System.out.println("After Shuffling\n"+Arrays.toString(arr2));
		
		//7. Shift element 1 left
		int [] arr4Shift = {1,2,3,4,5};
		System.out.println("Orginal Array: \n"+Arrays.toString(arr4Shift));

		int fstElementVal = arr4Shift[0];
		for(int i=1;i<arr4Shift.length;i++) {
			arr4Shift[i-1]=arr4Shift[i];
		}
		arr4Shift[arr4Shift.length-1]=fstElementVal;

		System.out.println("Array after Shifting: \n"+Arrays.toString(arr4Shift));
	}

}
