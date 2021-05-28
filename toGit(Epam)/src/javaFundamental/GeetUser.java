package javaFundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class GeetUser {

	static String userName;
	
	static java.io.InputStream inputStream = System.in;
	
	static Reader inputStreamReader = new InputStreamReader(inputStream);
	
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	
	public static void main(String[] args) {
		
		do {
		System.out.println("Enter your name");
		
		try {
			
			userName = bufferedReader.readLine();
		
		} catch (IOException e) {
			
			System.out.println("no lines");
			
			e.printStackTrace();
		} 

		System.out.println("Hello, " +  userName);}
		
		while (true);
		
	}

}
