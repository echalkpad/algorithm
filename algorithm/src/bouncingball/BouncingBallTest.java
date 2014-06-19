package bouncingball;

import java.util.Scanner;

public class BouncingBallTest {

	/**
	 * Bouncing ball
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the height for the very first.");
		int height = scanner.nextInt();
		System.out.println("Input the bouncing time.");
		int time = scanner.nextInt();
		int distance = height;
		for(int i = 1; i < time; i++){
			int temp = height;
			height /= 2;
			distance += (temp);
		}
		System.out.println("At the "+time+"th time, the height is "+height+",");
		System.out.println("and the total distance is "+distance);
	}
}
