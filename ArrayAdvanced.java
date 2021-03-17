package arrayAdvanced;

import java.util.Arrays;

//Purpose: Review the advanced topic related to array
//           a. enhanced loop
//           b. Array Copy
public class ArrayAdvanced {

	public static void main(String[] args) {
		//1. Enhanced Loop
		double [] arr1 = {1,3,5,8};
				
		//a. Regular approach to print element
		for(int i=0;i<arr1.length;i++) {
			//Read the Value
			System.out.println(arr1[i]);
			
			//Write the value to arr1 with 0
			arr1[i]=0;
		}
		System.out.println(Arrays.toString(arr1));
		
		//b. Enhanced loop approach
		for(double temp:arr1) {// ==  arr[0] -> element->Use the value; arr[1] -> element; arr[2] -> element; arra[n-1]->element
			//Read the Value
			System.out.println(temp);
			
			//Try to write the value, but won't actually work!
			temp =1.0;//Change the local variable temp, but didn;t write the value back to the array
			//value -> temp ->(BUT NOT HAPPEN) arr[0]
		}
		
		//Think: If change the temp value in enhanced loop, will the array value changed?
		//System.out.println(Arrays.toString(arr1));
		//Output? -> 0, 0, 0 ...   or 1, 1, 1
		
		//2. Array copy
		//Copy of Primitive Data type
		int a = 1;
		int b = a;
		b = 5; //a=1;
	
		//Copy of ref. type
		//a. Incorrect Approach
		int [] arr2 = {1,3,8};
		System.out.println(arr2);
		int [] arr3 = arr2;
		System.out.println(arr3);
		arr3[1]=33;
		
//		System.out.println(Arrays.toString(arr2));//{1,3,8}? or {1,33,8}?
//		System.out.println(Arrays.toString(arr3));//{1,33,8}?

		//b. Correct Approach: Using Loop
		int []arr4 = new int[arr2.length]; 
		for(int i =0;i<arr2.length;i++) {
			arr4[i]=arr2[i];
		}
		
//		System.out.println(arr2);
		System.out.println(arr4);
		
		//c. Correct Approach: arraycopy
		System.arraycopy(arr2, 0, arr4, 0, arr2.length);

		
		//3. Search
		//a. Linear Search:
		// Test Cases:
			//a.Find Match
		    System.out.println(linearSearch(new int []{1,4,3}, 3)==2); 
		    System.out.println(linearSearch(new int []{1,2,3,8}, 8)==3); 
		    //b. No Match
		    System.out.println(linearSearch(new int []{1,4,3}, 5)==-1); 
		
		//b. Binary Search:
		// Test Cases:   
		    //a.Find Match
		    System.out.println(
		    		binarySearch(new int []{1,4,5,6}, 5)==2); 
		    //b. No Match
		    System.out.println(
		    		binarySearch(new int []{1,4,5,6}, 2)==-1); 
		    System.out.println(
		    		binarySearch(new int []{1,4,5,6}, -5)==-1); 
		    System.out.println(
		    		binarySearch(new int []{1,4,5,6}, 7)==-1); 
			
		    
		    
		   
		    System.out.println("\n Current Nano Time is: "+ System.nanoTime());

		    
		    long timeDiffLSAverage =0;
		    long timeDiffBSAverage =0;

		    
		    //Array with length 1000, where filled with random int within [0,1000]
		    for(int i=0;i<100;i++) {
		    	int[] targetArray=new int [1000];
		    	
		    	for(int index=0;index<targetArray.length;index++) {
		    		targetArray[index]=(int)(Math.random()*1001);//->[0,1000]
		    	}
		    	
		    	//Test with Linear Search		    	
		    	int key = randomElement(targetArray);
		    	
		    	//Compute time takes by Linear Search
		    	long timeBeforeLS = System.nanoTime();
		    	linearSearch(targetArray,key);// -> Another Method that will return a   	
		    	long timeAfterLS = System.nanoTime();
		    	
		    	long timeDiffLS=timeAfterLS-timeBeforeLS;
		    	timeDiffLSAverage+=timeDiffLS/100;
		    	
		    	
		    	//Test with Binary Search
		    	//Think: How to make sure the random array is sorted?
		    	long timeBeforeBS = System.nanoTime();
		    	binarySearch(targetArray,key);// -> Another Method that will return a   	
		    	long timeAfterBS = System.nanoTime();
		    	
		    	long timeDiffBS=timeAfterBS-timeBeforeBS;
		    	timeDiffBSAverage+=timeDiffBS/100;
		    	
		    }
		    
		    
		    System.out.println("Linear Search Average Time after 100 runs is: "
		    +timeDiffLSAverage);
		    
		    System.out.println("Binary Search Average Time after 100 runs is: "
				    +timeDiffBSAverage);
		    
		    //Test cases for randomElement
		    //a. A random element in the array
		    //b. -1
//		    for(int i=0;i<5;i++) {
//			    int searchRst=linearSearch(new int[] {1,2,3,5},
//			    		randomElement(new int[] {1,2,3,5}));
//			    if(searchRst>=0||searchRst==-1) {
//			    	System.out.println(true);
//			    }
//			    else {System.out.println(false);}
//		    }
//		    
		    System.out.println();
		    //Test Case: isSortedAsced
		    //1. Sorted in Ascending order
		    System.out.println(
		    		isSortedAsced(new int[]{1,4,5,6})==true);
		    
		    //2. Sorted in Descending order
		    System.out.println(
		    		isSortedAsced(new int[]{11,3,2,1})==false);
		    
		    //3. Not sorted at all
		    System.out.println(
		    		isSortedAsced(new int[]{1,7,5,6})==false);
		
		    
		    //Test Case: isSortedAsced
		    //1. Sorted in Ascending order
		    System.out.println(
		    		isSortedAsced(new int[]{1,4,5,6})==true);
		    
		    //2. Sorted in Descending order
		    System.out.println(
		    		isSortedAsced(new int[]{11,3,2,1})==false);
		    
		    //3. Not sorted at all
		    System.out.println(
		    		isSortedAsced(new int[]{1,7,5,6})==false);
		    
		    //Test Case: isSortedAscedRecursive
		    //1. Sorted in Ascending order
		    System.out.println(
		    		isSortedAscedRecursive(new int[]{1,4,5,6},0)==true);
		    
		    //2. Sorted in Descending order
		    System.out.println(
		    		isSortedAscedRecursive(new int[]{11,3,2,1},0)==false);
		    
		    //3. Not sorted at all
		    System.out.println(
		    		isSortedAscedRecursive(new int[]{1,7,5,6},0)==false);
		    
		    
		    
		    //Test Case for minVal
		    //Think and Fill Your Own Test case.
		    
		    
		    //Test Case for minIndex
		    //Think and Fill Your Own Test case.
		    
		    
		    //Test case for selection sort
		    int [] selectionSortArr1 = {2,1,5,3};
		    int [] selectionSortArr2 = {2,1,5,3,99,100,25,31};

		    selectionSort(selectionSortArr1);
		    selectionSort(selectionSortArr2);
		    
		    
//		    System.out.println("The sorted arrays are: ");
//		    System.out.println(Arrays.toString(selectionSortArr1));
//		    System.out.println(Arrays.toString(selectionSortArr2));
		    System.out.println(
		    		Arrays.equals(selectionSortArr1,new int[] {1, 2, 3, 5}));
		    System.out.println(
		    		Arrays.equals(selectionSortArr2,new int[] {1, 2, 3, 5, 25, 31, 99, 100}));
	
	
	
	}

	
	
	
	
	
	
	//Signature: methodTestCases:     -> void
	//Purpose:   This method is simply used for hold different method test cases
	private static void methodTestCases() {
		
	}








	//Signature: randomElement: int[] -> int
	//Purpose:   Return a random element from the array or -1
	//Example:   randomElement({1,2,3,5})-> 3
	//           randomElement({1,2,3,5})-> 5
	//           randomElement({1,2,3,5})-> -1
	public static  int randomElement(int[] arr){
	
		int randomReturn = (int)(Math.random()*2); //0 or 1
		
		//1.If randomReturn ==0, return -1
		if(randomReturn==0) {
			return -1;
		}
		//2.Otherwise return the random element in the array
		else {
			int randomIndex = (int)(arr.length*Math.random());
			return 	arr[randomIndex];
		}
		
		
	}
	
	//3. Search
	//a. Linear Search: 
	
	//Signature: linearSearch: int[], int -> int
	//Purpose:   Search the key from begin to end in the given array, return the index if found 
	//           otherwise return -1
	//Examples:
	//           linearSearch({1,4,3}, 3) ->2
	//           linearSearch({1,4,3}, 5) ->-1
	public static int linearSearch(int[] arr, int key) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		
		///-> reach here, what does it mean?
		return -1;
	}
	
	
	//Signature: binarySearch: int[], int -> int
	//Purpose:   Apply binary search to Search the key in the given sorted ascending array,
	//          return the index if found  otherwise return -1
	//Examples:   binarySearch({1,4,5,6},5) ->2
	//            binarySearch({1,4,5,6},2) ->-1
	//            binarySearch({1,4,5,6},-5) -> -1
	public static int binarySearch(int[] arr, int key) {
		
		int low, high, mid;
		
		low  =0;
		high =arr.length-1;
		mid  =(low+high)/2;
		
		while(high>=low) {
			//Find Matach
			if(arr[mid]==key) {
				return mid;
			}
			
			//Mid Val> Key : Search left part
			if(arr[mid]>key) {
				high=mid-1;
			}
			//Mid Val< Key : Search right part
			else {
				low=mid+1;
			}
			
			mid = (high+low)/2;
		}
	
		
		return -1;
	}
	
	
	//Signature:  isSorted: int[] -> boolean
	//Purpose:    Check whether the given array is sorted.
	//Examples:   isSorted({1,4,5,6})   ->true
	//            isSorted({11,3,2,1})  ->true
	//            isSorted({1,7,5,6}) ->false
	public static boolean isSorted(int[] arr) {
		return isSortedAsced(arr)||isSortedDesc(arr);
	}

	
	//Signature:  isSorted: int[] -> boolean
	//Purpose:    Check whether the given array is sorted.
	//Examples:   isSorted({1,4,5,6})   ->true
	//            isSorted({11,3,2,1})  ->true
	//            isSorted({1,7,5,6}) ->false
	public static boolean isSortedRecursive(int[] arr) {
		return isSortedAscedRecursive(arr,0)||isSortedDescRecursive(arr,0);
	}
	
	//Signature:  isSortedDesc: int[] -> boolean
	//Purpose:    Check whether the given array is in descending order.
	//Examples:   isSortedAsced({1,4,5,6})   ->false
	//            isSortedAsced({11,3,2,1})  ->true
	//            isSortedAsced({1,7,5,6})   ->false
	private static boolean isSortedDesc(int[] arr) {
		//Start from first element
		// Compare current element with those on the right
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					return false;
				}		
			}
		}
		return true;
	}

	
	
	//Signature:  isSortedAscedRecursive: int[], int -> boolean
	//Purpose:    Check whether the given array is in ascending order.
	//            Each time compare two neighbor elements
	//Examples:   isSortedAscedRecursive({1,4,5,6},0)   ->true
	//Examples:   isSortedAscedRecursive({1,4,5,6},1)   ->true
	//Examples:   isSortedAscedRecursive({1,4,5,6},2)   ->true
	//            isSortedAscedRecursive({11,3,2,1},0)  ->false
	//            isSortedAscedRecursive({1,7,5,6},0)   ->false
	private static boolean isSortedAscedRecursive(int[] arr, int currentIndex) {
		//{1,4,5,6},  0
		
		//Base Case
		if(currentIndex==arr.length-1) {
			return true;
		}
		
		//Check whether the current value is < than the right neighbor
		if(arr[currentIndex]<=arr[currentIndex+1]) {
			return isSortedAscedRecursive(arr,currentIndex+1);
			
		}
		else {
			return false;
		}
		
		
		//For-Loop Approach
//		for(int i=0;i<arr.length-2;i++) {
//			if(arr[i]>arr[i+1]) {
//				return false;
//			}
//		}
//		return true;
		
	
	}
	
	//Signature:  isSortedDescRecursive: int[], int -> boolean
	//Purpose:    Check whether the given array is in descending order.
	//            Each time compare two neighbor elements
	//Examples:   isSortedDescRecursive({1,4,5,6},0)   ->false
	//            isSortedDescRecursive({11,3,2,1},0)  ->true
	//            isSortedDescRecursive({1,7,5,6},0)   ->false
	private static boolean isSortedDescRecursive(int[] arr, int currentIndex) {
		
		//Base Case
		if(currentIndex==arr.length-1) {
			return true;
		}
		
		//Check whether the current value is < than the right neighbor
		if(arr[currentIndex]>=arr[currentIndex+1]) {
			return isSortedDescRecursive(arr,currentIndex+1);
			
		}
		else {
			return false;
		}
		
		
		//For-Loop Approach
//		for(int i=0;i<arr.length-2;i++) {
//			if(arr[i]>arr[i+1]) {
//				return false;
//			}
//		}
//		return true;
		
	
	}
	
	
	
	//Signature:  isSortedAsced: int[] -> boolean
	//Purpose:    Check whether the given array is in ascending order.
	//Examples:   isSortedAsced({1,4,5,6})   ->true
	//            isSortedAsced({11,3,2,1})  ->false
	//            isSortedAsced({1,7,5,6})   ->false
	private static boolean isSortedAsced(int[] arr) {
		//Start from first element
		// Compare current element with those on the right
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					return false;
				}		
			}
		}
		return true;
	}
	
	
	//Signature: selectionSort: int[] -> void
	//Purpose:   Sort the given array using selection sort (ascendingly)
	//Examples:  selectionSort({2,1,5,3}) -> (sorted:{1,2,3,5})
	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			int min = minVal(arr,i);
			int minIndex = minIndex(arr,i);
			
			//Only when minIndex != min conduct
			if(i!=minIndex) {
				arr[minIndex]=arr[i];
				arr[i]=min;
			}
		}
		
	}
	
	//Signature: minVal: int[], int -> int
	//Purpose:   Search min value from given index
	//Examples:  
	public static int minVal(int[] arr, int startIndex) {
		int min = arr[startIndex];//The smallest # so-far
	
		for(int i=startIndex;i<arr.length;i++) {
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		return min;
	}
	
	//Signature: minIndex: int[], int -> int
	//Purpose:   Search min value from given index, return the corresponding index
	//Examples:  minIndex({1,3,4,-1},
	public static int minIndex(int[] arr, int startIndex) {
		int min = arr[startIndex];//The smallest # so-far
		
		int minIndex =startIndex;//Index for smallest #
		
		for(int i=startIndex;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				minIndex=i;
			}
		}
		
		return  minIndex;
	}
	
	
	
	
}
