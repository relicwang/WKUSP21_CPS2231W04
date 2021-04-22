package week5TwoDimensionArray;
//Purpose: Find the pair of points that 
//         has shortest distance in given 2D array,
//         where each row is a point
public class ShortestDistance {

	public static void main(String[] args) {
		//Test Case for distance:
		System.out.println("Test Case for distance:");
		
		System.out.println(AverageMajorDiagonal.equalDouble(
									distance(new double[]{0,0,0},
												new double[]{1,1,1}),Math.sqrt(3)));
		
		System.out.println(AverageMajorDiagonal.equalDouble(
				distance(new double[]{1,2,3},
							new double[]{5,6,8}),Math.sqrt(16+16+25)));
		
		System.out.println();
		
		
		double[][] points = {{0,0,0},            
				             {1,3,5},
				             {0.1,0.1,0.1},
				             {101,105,188}
		};
		
		
		//Two point that have shortest distance
		int p1 =0;
		int p2 =1;
		
		//Short Distance so-far
		double shortestDistance=(distance(points[0],points[1]));
		
		//Check all pair of points 
		for(int point1Index=0;point1Index<points.length-1;point1Index++) {
			for(int point2Index=point1Index+1;point2Index<points.length;point2Index++) {
				double currentDistance =distance(points[point1Index],points[point2Index]);
				if(shortestDistance>currentDistance) {
					shortestDistance=currentDistance;
					p1 = point1Index;
					p2 = point2Index;
				}
			}
		}
		
		System.out.println("The points that have shortest distance are: "+
				p1 + " "+ p2 + " and the distance is "+ shortestDistance);
	}
	
	

	//Signature:  distance: double[], double[] -> double
	//Purpose:     Compute distance in given two points
	//Examples:
	//            distance({0,0,0},{1,1,1})-> Math.sqrt(3)
	//            distance({1,2,3},{5,6,8})-> Math.sqrt(16+16+25)
	public static double distance(double[] point1, double[] point2) {
		return Math.sqrt((point1[0]-point2[0])*(point1[0]-point2[0])+
							(point1[1]-point2[1])*(point1[1]-point2[1])+
							(point1[2]-point2[2])*(point1[2]-point2[2]));
	}
	
	
}
