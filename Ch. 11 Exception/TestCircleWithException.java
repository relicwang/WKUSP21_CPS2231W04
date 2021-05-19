package week11_Exception;

import java.io.IOException;
import java.util.Arrays;

public class TestCircleWithException {

	public static void main(String[] args) {
		try {
			CircleWithException c1 = new CircleWithException(1);
			CircleWithException c2 = new CircleWithException(-5);
			CircleWithException c3 = new CircleWithException(6);
		}
		/*
		 * catch(IllegalArgumentException ex) { System.out.println(ex);
		 * System.out.println(ex.toString()); System.out.println(ex.getMessage());
		 * System.out.println(Arrays.toString(ex.getStackTrace()));
		 * ex.printStackTrace(); StackTraceElement[] traceElements = ex.getStackTrace();
		 * for(StackTraceElement traceElement:traceElements){
		 * System.out.println(traceElement.getClassName()); }
		 * 
		 * }
		 */
		catch (RadiusNegativeExeception ex) {
			System.out.println(ex);
			System.out.println(ex.getRadius());
//			System.out.println(ex.toString());
//			System.out.println(ex.getMessage());
//			System.out.println(Arrays.toString(ex.getStackTrace()));
//			ex.printStackTrace();
//			StackTraceElement[] traceElements = ex.getStackTrace();
//			for (StackTraceElement traceElement : traceElements) {
//				System.out.println(traceElement.getClassName());
//			}

			System.out.println("Number" + CircleWithException.getNumberOfCircle());

		}

	}
}
