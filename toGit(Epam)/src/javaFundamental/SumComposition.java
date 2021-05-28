package javaFundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class SumComposition {

	java.io.InputStream inputStream = System.in;
	
	Reader inputStreamReader = new InputStreamReader(inputStream);
	
	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	
	ArrayList <Integer> al_1 = new ArrayList<Integer>();
	
	int sum = 0;
	
	int Comp = 1;
	
	public static void main(String[] args) {
		
		SumComposition sm = new SumComposition();
		
			sm.read ();
		
	}

	public void read () {

		String someText = "";
		
		while (true) {
			
			System.out.println("Enter integers. To exit enter 'ex'");
			
			try {
				someText = bufferedReader.readLine();
			} catch (IOException e) {
				
				e.printStackTrace();
			} 
			
			if (someText.equals("ex")) {
				
				outPut();
				
				break;
				
			}
			
			else {al_1.add(Integer.parseInt(someText));}
			
			
		}
		
	}
	
	public void outPut(){
		
		for(int i : al_1)
	    
		{
			System.out.print (i + ", ");
			
	        sum += i;
	        
	        Comp *= i;
	    }
		
		if ( sum == 0 ) {
			System.out.println("sum of entered numbers = " + 0 + "; product of entered numbers = " + 0);
		}
		
		else 
			
		System.out.println("sum of entered numbers = " + sum + "; product of entered numbers = " + Comp);
		
	}
	
}
