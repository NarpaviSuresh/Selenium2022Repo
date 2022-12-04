package day1.assessments;

import java.util.Scanner;

public class AssessmentIsPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int input=sc.nextInt();
		boolean status= false;
//		Iterate through all numbers from 2 to n-1 (input) 
				
			for (int i = 2; i <= input/2; ++i) {
				
				if(input%i==0)
				{
				
					status=true;
					break;
				}
			}
				
			if (!status) {
					System.out.println("Number is prime");
				}
			
			else{
					System.out.println("Number is not prime");
			}
			
					
			
	}

}
