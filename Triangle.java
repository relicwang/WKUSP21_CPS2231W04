package week9_Inheritance;

public class Triangle extends SimpleGeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	/**No-Args Constuctors**/
	public Triangle() {
		this(1.0,1.0,1.0,"Blue",false);
		
//		this.setColor("Blue");
//		this.setFilled(false);
	}
	
	/**Constuctor Takes 3 side**/
	public Triangle(double side1, double side2, double side3){
		this(side1,side2,side3,"Blue",false);
	}
	
	/**Constuctor Takes 3 side, color, filled status**/
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		
		this.setColor(color);
		this.setFilled(filled);
	}
	
	
	public double getSide1() {
		return side1;
	}
	
	public double getArea() {
		double s = (side1+side2+side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;	
	}
}
