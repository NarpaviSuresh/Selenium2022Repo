package javprogram.challenge;

import java.util.Arrays;


public class JavaChallenge4PrintUniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {2,2,3,5,6,9,7,4,5,2,3};
		Arrays.sort(array);
		System.out.println("SORTED ARRAY");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" "+array[i]);
			}
		System.out.println();
		System.out.println("Unique Array");
	for (int i = 1; i < array.length-1; i++) {
		
		if(array[i]!= array[i+1]) {
			System.out.print(" "+array[i]);
		}
		
	}

	}

}
