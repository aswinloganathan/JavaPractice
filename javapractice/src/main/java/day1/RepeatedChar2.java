package day1;

public class RepeatedChar2 {

	public static void main(String[] args) {
		
		String str = "You have no choice other than following me!";
		String replaceStr = str.replaceAll("[^o]", "");
		System.out.println("Occurance of the string 'O' is : "+replaceStr.length());
		
	}	

}
