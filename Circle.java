package week9_Inheritance;

//UML: Circle
//------------------------
//+Circle()
//+Circle(radius: double)
//+Circle(radius: double, color: String,  filled: boolean)
//+getRadius(): double
//+setRadius(radius: double): void
//+getArea(): double
//+getPerimeter(): double
//+getDiameter(): double
//+printCircle(): void

//UML: GeometricObject
//-----------------------------
//+GeometricObject()
//+GeometricObject(color: String,  filled: boolean)
//+getColor(): String
//+setColor(color: String): void
//+isFilled(): boolean
//+setFilled(filled: boolean): void
//+getDateCreated(): java.util.Date
//+toString(): String


public class Circle extends GeometricObject {

	private double radius;
	
	/**No-arg Constructor**/
	public Circle() {
		this(1.0,"white",false);
	}
	
	/**Constructor takes radius in Constructor**/
	public Circle(double radius) {
		this(radius,"white",false);
	}
	
	/**Constructor takes radius, color, filled in Constructor**/
	public Circle(double radius, String color,  boolean filled) {
		super(color,filled);
		//		super();
		
		
		this.radius = radius;


		
//		setColor(color);
//		setFilled(filled);
	}
	
	/**getRadius(): -> double
	 * Return the raduis of current circle
	 */
	public double getRadius() {
		return this.radius;
	}
	
	/**setRadius(): double-> void
	 * Return the raduis of current circle
	 */
	public void setRadius(double radius) {
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
	
	/**printCircle():  -> void
	 * Print info. about current circle
	 */
	public void printCircle() {
		System.out.println("The radius of cicrle is "+this.radius+
				" "+this.toString());
	}

	public String toString() {
		return super.toString()+"\nRadius is "+this.radius;
	}
	

}
