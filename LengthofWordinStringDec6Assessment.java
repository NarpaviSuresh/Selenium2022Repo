package javprogram.challenge;

import java.util.Scanner;

public class LengthofWordinStringDec6Assessment {

	public static int wordLength(String str) {
		int lengOfLastWord = 0;
		String[] sentence = str.split(" ");
		if(sentence.length>0) {
			lengOfLastWord = sentence[sentence.length-1].length();
		}
		else
		{
			lengOfLastWord = 0;
		}
		return lengOfLastWord;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.nextLine();
		System.out.println("Original String :"+str);
		System.out.println("Length of the last word of the string: "+wordLength(str));

	}
}
