package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyEmail {

	public static void main(String[] args) {
		
		/*
		 	1. Write a java program to verify whether the given String is valid email address.
			Input: "balaji.chandrasekaran@testleaf.com"
			output: true
			
			Input: "balaji.c@tunatap.co.uk"
			output: true

			Input: "naveen e@tl.com"
			output: false
			
			Note: Spl characters like . _ are only allowed

		 */

		String regex = "^[a-zA-Z0-9_.]+@[a-zA-Z0-9.-]+{2,}$";
		String email = "balaji.chandrasekaran@testleaf.com";
		String email2 = "balaji.c@tunatap.co.uk";
		String email3 = "naveen e@tl.com";
		
		List<String> emailList = new ArrayList<String>();
		emailList.add(email);
		emailList.add(email2);
		emailList.add(email3);
		
		Pattern ptrn = Pattern.compile(regex);
		
		for (String eleEmail: emailList) {
			Matcher match = ptrn.matcher(eleEmail);
			System.out.println(match.matches());
		}
		
	}

}
