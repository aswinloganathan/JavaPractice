package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyUsername {

	public static void main(String[] args) {

		/*
		 	2. Write a java program to validate the given username is valid or not
			Input: "Balaji1"
			output: false

			Input: "Testleaf$123"
			output: false

			Note: 
			1. It should contain minimum 8 characters.
			2. It allows alpha numeric characters and spl characters like . _ @ $

		 */
		
		String regex ="^[a-zA-Z0-9._$@]{8,}$";
		String username = "Balaji1";
		String username2 ="Testleaf$123";
		
		List<String> userList = new ArrayList<String>();
		userList.add(username);
		userList.add(username2);
		
		
		Pattern prtn = Pattern.compile(regex);
		
		for (String eleUser : userList) {
			Matcher match = prtn.matcher(eleUser);
			System.out.println(match.matches());
		}
		
		
		
	}

}
