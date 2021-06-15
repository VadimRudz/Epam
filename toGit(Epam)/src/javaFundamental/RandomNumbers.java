package javaFundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class RandomNumbers {

	static int  quantityNumber;
	
	java.io.InputStream inputStream = System.in;
	
	Reader inputStreamReader = new InputStreamReader(inputStream);
	
	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	
	
	public static void main(String[] args) {
		
		RandomNumbers rn = new RandomNumbers();
		
		rn.read();

	}

	
	public void read() {
		
		System.out.println("Enter quantity");
		
		try {
			
			quantityNumber = Integer.parseInt(bufferedReader.readLine());
		
		} catch (IOException e) {
			
			System.out.println("no lines");
			
			e.printStackTrace();
		}

		 repeat();	
	}
	
	public void repeat(){
			
		for (int i = 0; i < quantityNumber; i++ ) {
			
			System.out.println((int)(Math.random()*100));
			
		}
			
		
		
		}
}
