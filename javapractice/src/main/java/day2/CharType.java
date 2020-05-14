package day2;

public class CharType {

	public static void main(String[] args) {
		/*
		 3. Write a java program to find the number of Uppercase, lowercase, numbers and spaces in the following String.
			Input: "1. It is Work from Home  not Work for Home"
		 */
		
		String sentance= "1. It is Work from Home  not Work for Home";
		
		int upperCase = 0;
		int lowerCase = 0;
		int number = 0;
		int space = 0;
	
		char[] charArray = sentance.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isUpperCase(charArray[i])) {
				upperCase++;
			} else if (Character.isLowerCase(charArray[i])) {
				lowerCase++;
			} else if (Character.isDigit(charArray[i])) {
				number++;
			}else if (Character.isSpaceChar(charArray[i])) {
				space++;
			}	
		}
		
		System.out.println(upperCase);
		System.out.println(lowerCase);
		System.out.println(number);
		System.out.println(space);
	}

}
