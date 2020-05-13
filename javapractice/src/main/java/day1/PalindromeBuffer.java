package day1;

public class PalindromeBuffer {

	public static void main(String[] args) {

		String str = "malayalam";
		
		StringBuffer buffer = new StringBuffer(str);
		String revString = buffer.reverse().toString();
	
		if (str.equals(revString)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

}
