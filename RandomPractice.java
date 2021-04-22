package week8_object;

import java.util.Random;

//Purpose: Play with random class
public class RandomPractice {

	public static void main(String[] args) {
		double randomVal = Math.random()*10; //-->[0,10)

		Random rd1 = new Random();
		System.out.println("Random Val from Math.random() "+randomVal);
		System.out.println("Random Val from Radnom Class with seed 1 "+rd1.nextInt());
	}

}
