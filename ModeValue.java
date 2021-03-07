package preTest;

import java.util.Arrays;

public class ModeValue {

	public static void main(String[] args) {
		//Test:
		System.out.println(mode(new int[]{})==-1);
		System.out.println(mode(new int[]{6})==6);
		System.out.println(mode(new int[]{1,2,5,3,2})==2);
		System.out.println(mode(new int[]{1,2,5,3,2,5})==2);

		System.out.println(Arrays.toString(new int[]{1,2,5,3,2,5}));

		
		
	}
	
	//Signature: mode:   int[] -> int
	//Purpose: Find the mode value from user given array. Return -1 if array size is 0; Return the earlist occured mode value if more than 1 mode value occured
	//Examples:
	//         mode({})   -> -1
	//         mode({6})  ->  6
	//         mode({1,2,3,3})->3
	//         mode({1,2,2,5,5})->5
	public static int mode(int[] nums) {
		

		if(nums.length==0) {
			return -1;
		}
		
		if(nums.length==1) {
			return nums[0];
		}
		
		int modeVal = nums[0];
		int modeOccurance = 0;
		
		for(int i=0;i<nums.length-1;i++) {
			int occurance =0;
			for(int j =i+1;j<nums.length;j++) {
				if(nums[j]==nums[i]) {
					occurance++;
				}
			}
			
			if(occurance>modeOccurance) {
				modeOccurance=occurance;
				modeVal=nums[i];
			}
			
		}
		
		return modeVal;
	}
	

}
