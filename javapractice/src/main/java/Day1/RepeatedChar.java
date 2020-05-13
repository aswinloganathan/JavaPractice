package Day1;

public class RepeatedChar {
    
	public static void main( String[] args ) {
		
		String str="You have no choice other than following me!";
	    
		char[] charArray = str.toCharArray();
		
		int count=0;
		
		for (int i = 0; i < charArray.length; i++) {	
			if (charArray[i]=='o') {
				count++;
			}
		}
		System.out.println("Occurence of the 'O' is : " +count);
    }
}
