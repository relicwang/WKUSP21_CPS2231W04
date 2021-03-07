package arrayReview;

public class SearchSort {

	public static void main(String[] args) {

		//Test Cases:
		//1. equal method
		//   a. two arrays are equal
		//		a-1: two empty array
				System.out.println(equal(new int[]{},new int[]{})==true);
		//		a-2: two non-empty array
				System.out.println(equal(new int[]{1},new int[]{1})==true);
				System.out.println(equal(new int[]{2,1},new int[]{2,1})==true);
				System.out.println(equal(new int[]{25,1,5,9},new int[]{25,1,5,9})==true);

		//   b. two arrays are not equal
		//		b-1: two array has different length
				System.out.println(equal(new int[]{},new int[]{1,2,3})==false);
				System.out.println(equal(new int[]{1},new int[]{1,2,3})==false);
	
		//		b-1: two array has same length but value different
				System.out.println(equal(new int[]{3},new int[]{1})==false);
				System.out.println(equal(new int[]{3,5,7},new int[]{1,5,9})==false);




		
		//EvenFollowedOdd Method
		System.out.println("\n\n Test Case for Even followed by Odd");
		//1. Odd numbers followed by even numbers
		//		{1,3,6,8} -> {6,8,1,3}
		System.out.println(equal(
				EvenFollowedOdd(new int[]{1,3,6,8}),new int[]{6,8,1,3})==true);
		
		//2. Even numbers followed by Odd numbers
		System.out.println(equal(
				EvenFollowedOdd(new int[]{8,6,1,3}),new int[]{8,6,1,3})==true);
		
		//2. Even and Odd mixed.
		System.out.println(equal(
				EvenFollowedOdd(new int[]{8,1,4,3}),new int[]{8,4,1,3})==true);
		System.out.println(equal(
				EvenFollowedOdd(new int[]{1,8,7,4}),new int[]{8,4,1,7})==true);
		System.out.println(equal(
				EvenFollowedOdd(new int[]{13,22,14,17,11,10}),new int[]{22,14,10,13,17,11})==true);
	}
	
	
	public static int isSorted(int[] arr, int index) {
		if(index==(arr.length-1)) {
			return 1;
		}
		
		if(arr[index]>arr[index+1]) {
			return 0;
		}
		
		return isSorted(arr, index+1);
		
	}

	
	//Signature: equal: int[], int[] -> boolean
	//Purpose:   Compare the equality of two integer arrays
	//Examples:  equal({1,2,3},{1,2,3})-> true
	//           equal({},{})->true
	//           equal({1},{2})->false
	public static boolean equal(int[] arr1, int[] arr2) {
		//Array with different length
		if(arr1.length!=arr2.length) {
			return false;
		}
		
		//Array is empty
		if(arr1.length==00) {
			return true;
		}
		
		//Check each pair of elements
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}
	
	
	//Signature: EvenFollowedOdd: int[] -> int[]
	//Purpose:   Sort the integer array where even numbers
	//				followed by odd numbers
	//Example:  EvenFollowedOdd({1,2,3,4}) ->{2,4,1,3}
	//          EvenFollowedOdd({6,8,1,3}) ->{6,8,1,3}
	//          EvenFollowedOdd({6,1,4,3}) ->{6,4,1,3}
	
	//Header of the method:
	public static int[] EvenFollowedOdd(int[] orgArr) {
		int[] sortedArr = new int[orgArr.length];
		int index=0;
		
		for(int i=0;i<orgArr.length;i++) {
			if(orgArr[i]%2==0) {
				sortedArr[index]=orgArr[i];
				index++;
			}
		}
		
		for(int i=0;i<orgArr.length;i++) {
			if(orgArr[i]%2!=0) {
				sortedArr[index]=orgArr[i];
				index++;
			}
		}
		
		return sortedArr;
	}
	
}
