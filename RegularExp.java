package core.programs;

import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("\\d", "{10}"));
		System.out.println(Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@\" +  //part before @\r\n"
				+ "                \"(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$\"; \r\n"
				+ "", "Test123prepare@gmail.com"));
		

    } 

	}

