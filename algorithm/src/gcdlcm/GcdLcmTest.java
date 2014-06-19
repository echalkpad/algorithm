package gcdlcm;

import java.util.Scanner;

public class GcdLcmTest {

	/**
	 * Gcd & Lcm
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input one number.");
		int input1 = scanner.nextInt();
		System.out.println("Input the other number.");
		int input2 = scanner.nextInt();
		
		int gcd = 0;
		int lcm = 0;
		
		if(input1 > input2){
			gcd = gcd(input1, input2);
			lcm = lcm(input1, input2, gcd);
		}
		else{
			gcd = gcd(input2, input1);
			lcm = lcm(input2, input1, gcd);
		}
		System.out.println("GCD: "+gcd+", LCM: "+lcm);

	}

	protected static int gcd(int greater, int smaller) {
		while(greater % smaller != 0){
			int remainder = greater % smaller;
			greater = smaller;
			smaller = remainder;
		}
		return smaller;
	}

	protected static int lcm(int greater, int smaller, int gcd) {
		return greater*smaller/gcd;
	}

}
