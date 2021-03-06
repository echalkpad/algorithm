package pascaltriangle;

import java.util.Date;
import java.util.Scanner;
import java.util.Timer;

public class PascalTriangleTest {

	/**
	 * Pascal Triangle
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input the row number.");
		Scanner scanner = new Scanner(System.in);
		int rowNum = scanner.nextInt();

		/*
		 * Method 1:
		 */
		long start1 = new Date().getTime();
		for(int i = 0; i < rowNum; i++){
			for(int k = 0; k < (rowNum-i); k++)
				System.out.print("   ");
			for(int j = 0; j <= i; j++){
				System.out.print(combination1(i, j)+"   ");;
			}
			System.out.println();
		}
		long end1 = new Date().getTime();
		
		System.out.println("==============================");
		/*
		 * Method 2
		 */
		long start2 = new Date().getTime();
		for(int i = 0; i < rowNum; i++){
			for(int k = 0; k < (rowNum-i); k++)
				System.out.print("   ");
			for(int j = 0; j <= i; j++){
				System.out.print(combination2(i, j)+"   ");;
			}
			System.out.println();
		}
		long end2 = new Date().getTime();
		
		System.out.println("******************************");
		
		if((end1-start1) < (end2-start2))
			System.out.println("combination1 is better by "+((end2-start2)-(end1-start1))+" milliseconds.");
		else if((end1-start1) > (end2-start2))
			System.out.println("combination2 is better by "+((end1-start1)-(end2-start2))+" milliseconds.");
		else
			System.out.println("Two combinations are similar in efficiency.");
		
	}
	
	protected static int combination1(int n, int r) { // when rowNum == 14, problems occur.
		if(r == 0) return 1;
		else return factorial(n)/factorial(r)/factorial(n-r);
	}
	
	protected static int factorial(int num) {
		if(num == 0 || num == 1) return 1;
		return num * factorial(num-1);
	}
	
	protected static int combination2(int n, int r) {
		if(r == 0) return 1;
		else return combination2(n, r-1)*(n-r+1)/r;
	}

}
