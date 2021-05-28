package javaFundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReverseOrder {
	
	static String  text;
	
	static StringBuilder  textReverse = new StringBuilder();
	
	static java.io.InputStream inputStream = System.in;
	
	static Reader inputStreamReader = new InputStreamReader(inputStream);
	
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	public static void main(String[] args) {
		
		System.out.println("Enter text");
		
		try {
			
			text = bufferedReader.readLine();
		
		} catch (IOException e) {
			
			System.out.println("no lines");
			
			e.printStackTrace();
		}

		System.out.println(textReverse.append(text).reverse());
		
	}

}
