package primenumber;

import java.util.ArrayList;

public class PrimeNumberTest {

	/**
	 * Prime Number: check the number of prime numbers between 101 and 200
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Prime numbers between 101 and 200.");
		for(int num = 101; num < 201; num++){
			if(isPrime(num)){
				list.add(num);
			}
		}
		for(int result: list){
			System.out.print(result+", ");
		}
		System.out.println("\nThe total number is "+list.size());
	}
	
	protected static boolean isPrime(int num) {
		boolean flag = true;
		for(int i = 2; i <= Math.sqrt(num); i++){
			if(num%i == 0)
				flag = false;
		}
		return flag;
	}
}
