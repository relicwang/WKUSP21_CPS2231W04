package week5TwoDimensionArray;
//Purpose: Compute the average value of major Diagonal numbers
//           in N*N matrix
public class AverageMajorDiagonal {

	public static void main(String[] args) {
		
		//Test Cases for equalDouble:
		System.out.println("Test Cases for equalDouble");
		       System.out.println(
		    		   equalDouble(2.0, 2.0));
		       System.out.println(equalDouble(2.0,1.9999999));
		       
		       System.out.println(equalDouble(1.8,1.6) ==false);
		
		
		
		       
		       
		//Test Cases for averageMajorDiagonal:
		System.out.println("Test Cases for averageMajorDiagonal");
		System.out.println( 
				equalDouble(
						averageMajorDiagonal(
								new double [][]
											{{1,2,3}, {1,2,3}, {1,2,3}}),
						2.0));
		
		System.out.println( 
				equalDouble(
						averageMajorDiagonal(
								new double [][]
											{{1,2}, {1,2}}),
						1.5));
		
		
	}

	//Signature: averageMajorDiagonal: double[][] -> double
	//Purpose: Compute the average value of major Diagonal numbers
	//             in given N*N matrix
	//Examples:
	//   averageMajorDiagonal({{1,2,3}, 
	//                         {1,2,3}, 
	///                        {1,2,3}}) -> 2.0
	public static double averageMajorDiagonal(double[][] matrix ) {
		double sum=0;
		
		for(int i=0;i<matrix.length;i++) {
			sum+=matrix[i][i];
		}
		
		return sum/matrix.length;
	}
	
	//Signature: equalDouble: double, double ->boolean
	//Purpose: Check the equality of double values. 
	//         Difference between two given number <0.00001 -> 
	//         We assume is euqal.
	//Examples: 
	//       equalDouble(2.0, 2.0) ->true
	//       equalDobule(2.0,1.9999999) ->true
	//       equalDobule(1.8,1.6) ->false 
	public static boolean equalDouble(double num1, double num2) {
		if(Math.abs(num1-num2)<0.00001) {
			return true;
		}
		
		return false;
	}
	
	
}

