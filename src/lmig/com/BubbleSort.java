package lmig.com;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int bubbleArry[] = new int [] { 15, 3, 9, 7, 19, 8, 1, 5 };
		int[] arr2 = BubbleSortMethod(bubbleArry);
		System.out.print(Arrays.toString(bubbleArry));
		//log("Ascending Order result:" + Arrays.toString(BubbleSortMethod(bubbleArry)) + "\n");
		//bubbleArry=BubbleSort.BubbleSortMethod(arr2);
	}

	// Bubble Sort Algorithm in Ascending Order
	public static int[] BubbleSortMethod(int[] bubbleArry) {
		int temp;
		for (int i = 0; i < bubbleArry.length - 1; i++) {
 
			for (int j = 1; j < bubbleArry.length - i; j++) {
				if (bubbleArry[j - 1] > bubbleArry[j]) {
					temp = bubbleArry[j - 1];
					bubbleArry[j - 1] = bubbleArry[j];
					bubbleArry[j] = temp;
				}
			}
			//log("Iteration " + (i + 1) + ": " + Arrays.toString(bubbleArry));
		}
		return bubbleArry;
	}
	//private static void log(String result) {
		//System.out.println(result);
}
