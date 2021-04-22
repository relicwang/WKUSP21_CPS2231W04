package week9_Inheritance;

public class ClassChainTest  {
	public static void main(String[] args) {
		A testO = new A();
	}
	
	
}

class A extends B{
	public A() {
		this(123);
		System.out.println("I am in A-1");
	}
	public A(int var) {
		System.out.println("I am in A-2");
	}
}

class B{
	public B() {
		System.out.println("I am in B");
	}
}