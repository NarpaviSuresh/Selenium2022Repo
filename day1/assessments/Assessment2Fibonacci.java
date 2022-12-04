package day1.assessments;

public class Assessment2Fibonacci {
	
	public static void main(String[] args) {
		//Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
		
		int firstNum=0;
		int secNum=1;
		int sum=0;
		
		//Print first number and second number
		
		System.out.print(firstNum);
		System.out.print(" "+secNum);
		 
		//Iterate from 1 to the 11
		
		for (int i = 2; i <=11; i++) {	
			
			//Add first and second number assign to sum
			sum=firstNum+secNum;
			
//			Assign second number to the first number
			firstNum=secNum;
			
//			Assign sum to the second number
			secNum=sum;
//			Print sum
			System.out.print(" "+sum);
			
		}
	}

}
