package checkinputstring;

import java.util.Scanner;

public class CheckInputStringTest {

	/**
	 * Check input string: how many integers, characters, spaces or other type characters.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input a string.");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int countNum = 0;
		int countChar = 0;
		int countSpace = 0;
		int countOthers = 0;
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(c >= '0' && c <= '9')
				countNum++;
			else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
				countChar++;
			else if(c == ' ')
				countSpace++;
			else
				countOthers++;
		}
		System.out.println("Numbers: "+countNum);
		System.out.println("Characters: "+countChar);
		System.out.println("Spaces: "+countSpace);
		System.out.println("Others: "+countOthers);
	}

}
