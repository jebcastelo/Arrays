package lmig.com;

import java.util.Arrays;

public class myInsertionSort {

	public static void main(String[] args) {
			int[] arr = new int[] { 108, 1072, 675, -35, 932, 75 };
	        int[] arr2 = insertionSort(arr);
	       // for(int i:arr2){
	        	arr = myInsertionSort.insertionSort(arr);
	        	System.out.print(Arrays.toString(arr));
	          
	       // }
	    }
	 public static int[] insertionSort (int[] input) {
         
	        int temp;
	        for (int i = 1; i < input.length; i++) {
	            for(int j = i; j > 0; j--){
	                if(input[j] < input[j-1]){
	                    temp = input[j];
	                    input[j] = input[j-1];
	                    input[j-1] = temp;
	                }
	            }
	        }
	        return input;
	    }
}
;