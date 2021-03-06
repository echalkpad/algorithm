package fibonacci;

import java.util.Scanner;

public class FibonacciNumberTest1 {

	/**
	 * Fibonacci Number: Rabbit birth problem
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input an integer.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		System.out.println("Rabbit Number: "+ fibonacci(month)*2);
	}
	
	protected static int fibonacci(int month) {
		int f = 1;
		if(month > 0 && month < 3)
			return f;
		f = fibonacci(month-1)+fibonacci(month-2);
		return f;
	}
}
