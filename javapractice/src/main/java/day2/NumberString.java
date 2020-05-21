package day2;


public class NumberString {

	public static void main(String[] args) {

/*
		1) Write a java code to find the sum of the given numbers
		Input: "asdf1qwer9as8d7"
		output: 1+9+8+7 = 25
*/
	
		
		String str = "asdf1qwer9as8d7";
		int sumOf = 0;
		
		String rplString = str.replaceAll("\\D", "");	
		char[] charArray = rplString.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			int numericValue = Character.getNumericValue(charArray[i]);			
			sumOf+=numericValue;
		}
		System.out.println("total of the given number is :"+sumOf);
	}

}
