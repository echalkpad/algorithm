package fibonacci;

import java.util.Scanner;

public class FibonacciNumberTest2 {

	/**
	 * Fibonacci Number: calculate the sum of 2/1��3/2��5/3��8/5��13/8��21/13... (n numbers)
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input an integer number.");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		double sum = 0;
		double temp = 0.0;
		for(int i = 1; i <= n; i++){
			temp = fibonacci(i+2)/fibonacci(i+1);
			sum += temp;
		}
		System.out.println(sum);
	}
	
	protected static double fibonacci(int num) {
		double fibonacci = 0;
		if(num == 1 || num == 2)
			return 1;
		return fibonacci(num-1)+fibonacci(num-2);
	}

}
