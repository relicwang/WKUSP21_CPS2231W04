package week11_Exception;

public class TestCircle {

	public static void main(String[] args) {
		try {
		CircleWithException c1 = 
				new CircleWithException(1);
		CircleWithException c2 = 
				new CircleWithException(-5);
		CircleWithException c3 = 
				new CircleWithException(6);
		}
		catch(IllegalArgumentException ex) {
			
//			System.out.println(ex.getMessage());
//			System.out.println(ex.toString());
			//ex.printStackTrace();
			StackTraceElement [] stackElements = 
					ex.getStackTrace();
			
			for(StackTraceElement element: stackElements) {
				System.out.println(element.getClassName());
				System.out.println(element.getLineNumber());
			}
			
		}
		
//		System.out.println(CircleWithException.getNumberOfCircle());
		
	}

}
