package sortselection;

import java.util.Scanner;

public class SelectionSortTest {

	/**
	 * Selection Sort
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input an integer array of five numbers.");
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n***************");
		
		int[] newArr = selectionSort(arr);
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
	
	public static int[] selectionSort (int[] arr){
		int minIndex = 0;
		for(int i = 0; i < arr.length-1; i++){
			minIndex = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
				if(minIndex != i){
					int temp = arr[i];
					arr[i] = arr[minIndex];
					arr[minIndex] = temp;
				}
			}
		}
		return arr;
	}

}
