package week11_Exception;



public class TestExceptionMethod {

	public static void main(String[] args) {
		try {

			m1();
			System.out.println("Statement 1");
		} catch (ArithmeticException ex) {

		}
		System.out.println("Statement 2");

	}

	public static void m1() {

		try {

			m2();
			System.out.println("Statement 3");
		} catch (IndexOutOfBoundsException ex) {

		}
		System.out.println("Statement 4");

	}

	public static void m2() {

		try {

			m3();
			System.out.println("Statement 5");
		} catch (IllegalArgumentException ex) {

		}
		System.out.println("Statement 6");
	}

	public static void m3() {

		throw new ArithmeticException();
	}
}
