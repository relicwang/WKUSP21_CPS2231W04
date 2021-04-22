package week5_Object;

/** Class for define a rectangle object **/
public class Rectangle {

	/** Height Field **/
	double height = 1.0;

	/** Width Field **/
	double width = 1.0;

	/** Count instance of Rectangle Class **/
	private static int countOfRectangle = 0;

	/** No-Arg Constructor **/
	Rectangle() {
		countOfRectangle++;
	}

	/** Constructor takes height and width **/
	Rectangle(double newWidth, double newHeight) {
		height = newHeight;
		width = newWidth;
		countOfRectangle++;

	}

	/** getArea Method **/
//Signature: getArea:    -> double
//Purpose:   Compute the area of current rectangle object
//Examples:  getArea(width:5, height: 4) -> 20
	double getArea() {
		int i =5;
		return height * width;
	}

	/** getPerimieter Method **/
//Signature: getPerimieter:    -> double
//Purpose:   Compute the perimieter of current rectangle object
//Examples:  getPerimieter(width:5, height: 4) -> 18
	double getPerimieter() {
		return (height + width) * 2;
	}

	/** getRectangleCount Method **/
//Signature: getRectangleCount    -> int
//Purpose:   Return the number of rectangle instances been created
	static int getRectangleCount() {
		return countOfRectangle;
	}

	public String toString() {
		return "The height is " +height +". The width is "+width;
	}
	
	
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		
		System.out.println(rectangle1);
		System.out.println("Rectangle 1 area:" + rectangle1.getArea());
//	System.out.println("Number of object is:"+Rectangle.getNumberOfObjects());

		Rectangle rectangle2 = new Rectangle(5, 8);
		System.out.println("Rectangle 2 area:" + rectangle2.getArea());
//	System.out.println("Number of object is:"+Rectangle.getNumberOfObjects());

		Rectangle rectangle4 = new Rectangle(6, 10);
		System.out.println("Rectangle 2 area:" + rectangle4.getArea());
//	System.out.println("Number of object is:"+Rectangle.getNumberOfObjects());

	}

}
