package day2;


public class NumberString2 {

	public static void main(String[] args) {
		/*
		1) Write a java code to find the sum of the given numbers
		Input: "asdf1qwer9as8d7"
		output: 1+9+8+7 = 25
		 */
	
		
		String str = "asdf1qwer9as8d7";		
		int sum = 0;
		
		String rplString = str.replaceAll("\\D", "");
		
		for (int i = 0; i < rplString.length(); i++) {
			String substring = rplString.substring(i,i+1);
			int number = Integer.parseInt(substring);
			sum = sum + number;
		}
		System.out.println("Total value is :"+ sum);
	}
}