package week11_Exception;

import java.io.IOException;

import week9_Inheritance.GeometricObject;

public class CircleWithException extends GeometricObject {

	private double radius;
	private static int  i;
	private static int numOfCircle =0;
	
	/**No-arg Constructor**/
	public CircleWithException() throws RadiusNegativeExeception {
		this(1.0,"white",false);
	}
	
	/**Constructor takes radius in Constructor**/
	public CircleWithException(double radius) throws RadiusNegativeExeception {
		this(radius,"white",false);
		
	}
	
	/**Constructor takes radius, color, filled in Constructor**/
	public CircleWithException(double radius, String color,  boolean filled) throws RadiusNegativeExeception{
		super(color,filled);
		
		this.setRadius(radius);
		numOfCircle++;

	}
	
	/**getRadius(): -> double
	 * Return the raduis of current circle
	 */
	public double getRadius() {
		return this.radius;
	}
	
	/**setRadius(): double-> void
	 * Return the raduis of current circle
	 * @throws IOException 
	 */
	public void setRadius(double radius) throws RadiusNegativeExeception  {
//		if(radius<0) {
//			throw new IllegalArgumentException("The radius should not be negative");
//		}
		
		if(radius<0) {
			throw new RadiusNegativeExeception(radius);
		}
		
		this.radius=radius;
	}
	
	/**getArea():  -> double
	 * Return the area of current circle
	 */
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	
	/**getPerimeter():  -> double
	 * Return the perimeter of current circle
	 */
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}
	
	/**getDiameter():  -> double
	 * Return the diameter of current circle
	 */

	public double getDiameter(){
		
		return 2*this.radius;
	}
	
	/**printCircle():  -> void
	 * Print info. about current circle
	 */
	public void printCircle() {
		System.out.println("The radius of cicrle is "+this.radius+
				" "+this.toString());
	}

	public static int getNumberOfCircle() {
		return numOfCircle;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nRadius is "+this.radius;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof CircleWithException) {
			return this.radius == ((CircleWithException)o).radius;
		}
		else {
			return false;
		}
	}
	

}