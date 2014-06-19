package primefactor;

import java.util.Scanner;

public class PrimeFactorTest {

	/**
	 * Prime Factor
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input an integer number.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int p = 2;
		System.out.print(input+"=");
		while(input > p){
			if(input % p == 0){
				System.out.print(p+"*");
				input /= p;
			}
			if(input % p != 0)
				p++;
		}
		System.out.println(input);
	}

}
