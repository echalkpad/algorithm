package palindromenumber;

import java.util.Date;
import java.util.Scanner;

public class PalindromeNumberTest {

	/**
	 * Palindrome Number
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input a random integer number.");
		Scanner scanner = new Scanner(System.in);

		String input1 = scanner.next();
		int input2 = scanner.nextInt();
		
		/*
		 * Method 1
		 */
		long start1 = new Date().getTime();
		char[] arr = input1.toCharArray();
		boolean flag = true;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != arr[arr.length-i-1])
				flag = false;
		}
		if(flag)
			System.out.println(input1+" is a palindrome number");
		else
			System.out.println(input1+" is NOT a palindrome number");
		long end1 = new Date().getTime();
		
		System.out.println("===================================");
		/*
		 * Method 2
		 */
		long start2 = new Date().getTime();
		int input2Temp = input2;
		int temp = 0;
		do{
			temp *= 10;
			temp += input2Temp % 10;
			input2Temp /= 10;
		}while(input2Temp != 0);
		if(input2 == temp)
			System.out.println(input2+" is a palindrome number");
		else
			System.out.println(input2+" is NOT a palindrome number");
		long end2 = new Date().getTime();
		
		System.out.println("***********************************");
		
		long diff1 = end1-start1;
		long diff2 = end2-start2;
		if(diff1 < diff2){
			System.out.println("method 1 is better than method 2 by "+(diff2-diff1)+" milliseconds");
		}else if(diff1 > diff2){
			System.out.println("method 2 is better than method 1 by "+(diff1-diff2)+" milliseconds");
		}else{
			System.out.println("Two methods have similar performance.");
		}
		
	}

}
