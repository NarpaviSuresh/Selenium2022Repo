package javprogram.challenge;

public class JavaChallenge3Palindrome_Splcharacters {

	public static void main(String[] args) {
		
		isPalindrome("A man, a plan, a canal: Panama");
		isPalindrome("suresh");
	}
	
		
		public static boolean isPalindrome(String string1) {

//			Declaring String
//			 string1 = "A man, a plan, a canal: Panama";
			
//			Upper case to lower case
			String lowerCase = string1.toLowerCase();
			
//			Removing non alphanumeric characters
			
			lowerCase = lowerCase.replaceAll("[^a-zA-Z0-9]", "");
			
//			Printing the String after removal of spl characters
			
			System.out.println("StringAfterRemovingSPlCharacters :"+lowerCase);
			
//			Assigning to variable
			String str1 = lowerCase;
			
//			Declaring another variable
			String str2="";
			
//			iterating the Str1 variable traverse
			for (int i = str1.length()-1; i>=0; i--) {
				char c = str1.charAt(i);
				str2 = str2+c;
				
			}
			
			System.out.println("Reverse String :"+str2);
			
			if(str1.equals(str2)) {
				
				System.out.println("The Given string is Palindrome");
			return true;
			}
			
			else
			{
				System.out.println("The Given string not a  Palindrome");
				return false;
			}
		}	
}
