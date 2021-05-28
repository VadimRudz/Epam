package javaFundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class NumberFrom1to12 {
	
	java.io.InputStream inputStream = System.in;
	
	Reader inputStreamReader = new InputStreamReader(inputStream);
	
	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	public static void main(String[] args) {
		
		NumberFrom1to12 num = new NumberFrom1to12();
		
		num.read ();
		
	}

	public void read () {

		String someText = "";
		
		while (true) {
			
			System.out.println("Enter a number from 1 to 12. To exit enter 'ex'");
			
			try {
				
				someText = bufferedReader.readLine();
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}
				
			if (someText.equals("1")||someText.equals("2")||someText.equals("3")
				||someText.equals("4")||someText.equals("5")||someText.equals("6")
				||someText.equals("7")||someText.equals("8")||someText.equals("9")
				||someText.equals("10")||someText.equals("11")||someText.equals("12")) {
				
				definitionOfTheMonth(Integer.parseInt(someText));
				
			}
			
			else if (someText.equals("ex")) {
				
				break;
				
			}
			
			else {System.out.println("You entered an invalid number or character");}
	
		}
		
	}
	
	public void definitionOfTheMonth(int month){
		
		switch (month) {
		case 1: System.out.println("January"); break;
		case 2: System.out.println("February"); break;
		case 3: System.out.println("March"); break;
		case 4: System.out.println("April"); break;
		case 5: System.out.println("May"); break;
		case 6: System.out.println("June"); break;
		case 7: System.out.println("July"); break;
		case 8: System.out.println("August"); break;
		case 9: System.out.println("September"); break;
		case 10: System.out.println("October"); break;
		case 11: System.out.println("November"); break;
		case 12: System.out.println("December"); break;
		default:break;
		
		}
		
	}
}
