package day1;

public class Palindrome {

	public static void main(String[] args) {

		String str = "malayalam";
		
		String revString = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			revString += str.charAt(i);
		}
		
		System.out.println(str.equals(revString)?"It is a palindrome":"It is not a palindrome");
		
	}

}
