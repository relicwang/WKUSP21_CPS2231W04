package week5_Object;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(1,5);
		System.out.println("The number of Rectangle instance is "+Rectangle.getRectangleCount());
		
		Rectangle rectangle2 = new Rectangle();
		System.out.println("The number of Rectangle instance is "+Rectangle.getRectangleCount());

		Rectangle rectangle3 = new Rectangle(3,1.5);
		System.out.println("The number of Rectangle instance is "+Rectangle.getRectangleCount());
		
//		Rectangle.getRectangleCount()=15;
		System.out.println("The number of Rectangle instance is "+Rectangle.getRectangleCount());

		Rectangle rectangle4 = new Rectangle(3,6);
		System.out.println("The number of Rectangle instance is "+Rectangle.getRectangleCount());
		
		
	}

}
