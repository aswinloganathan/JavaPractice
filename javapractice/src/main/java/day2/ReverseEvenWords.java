package day2;


public class ReverseEvenWords {

	public static void main(String[] args) {

		/*
		2. Write a java program to do the following.
		Input: "When the world realise its own mistake, corona will dissolve automatically"
		output: "When eht world esilaer its nwo mistake, anoroc will evlossid automatically"
		*/
		
		String sentence = "When the world realise its own mistake, corona will dissolve automatically";
		
		//Split string to char
		String[] split = sentence.split("\\s");
		
		//iterate the char through loop
		for (int i = 0; i < split.length; i++) {
				if (i%2==0) {
					System.out.print(" "+split[i]+" ");
				} else if (i%2!=0) {
					for (int j = split[i].length()-1; j >=0 ; j--) {
						System.out.print(split[i].charAt(j)+ "");
					}
				} 
		}			
		
	}

}
