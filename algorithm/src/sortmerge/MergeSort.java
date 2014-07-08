package sortmerge;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	/**
	 * Merge Sort
	 * @param args
	 */
	static int[] arr = new int[10];
	public static void main(String[] args) {
		System.out.println("Input an integer array of ten numbers.");
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n**************");
		
		mergeSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	protected static void mergeSort(int[] arr) {
		if(arr.length > 1){
			int[] left = Arrays.copyOfRange(arr, 0, arr.length/2);
			int[] right = Arrays.copyOfRange(arr, arr.length/2, arr.length);
			/*for (int i = 0; i < left.length; i++) {
				System.out.print(left[i] + " ");
			}
			for (int i = 0; i < right.length; i++) {
				System.out.print(right[i] + " ");
			}*/
			mergeSort(left);
			mergeSort(right);
			
			merge(arr, left, right);
		}
	}
	
	protected static void merge(int[] arr, int[] left, int[] right) {
		int i = 0, leftIndex = 0, rightIndex = 0;
		while(i < arr.length){
			if(leftIndex < left.length && rightIndex < right.length){
				if(left[leftIndex] < right[rightIndex]){
					arr[i] = left[leftIndex]; // assign the element in left to arr
					i++; leftIndex++; // and plus operation for i and left index
				}else{
					arr[i] = right[rightIndex];
					i++; rightIndex++;
				}
			}else if(leftIndex >= left.length){
				while(rightIndex < right.length){
					arr[i] = right[rightIndex];
					i++; rightIndex++;
				}
			}else if(rightIndex >= right.length){
				while(leftIndex < left.length){
					arr[i] = left[leftIndex];
					i++; leftIndex++;
				}
			}
		}
	}
	
}
