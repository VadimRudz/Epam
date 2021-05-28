package optionalTask_1.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ShortestAndLongest {

	java.io.InputStream inputStream = System.in;
	
	Reader inputStreamReader = new InputStreamReader(inputStream);
	
	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	
	ArrayList <String> al_1 = new ArrayList<String>();
	
	ArrayList <String> al_1AverageLengthLess = new ArrayList<String>();
	
	ArrayList <String> al_1AverageLengthMore = new ArrayList<String>();
	
	ArrayList <Integer> al_2 = new ArrayList<Integer>();
	
	int longestLength, shortestLength;
	
	int min, max, DifferentValues;
	
	int averageLength;
	
	public static void main(String[] args) {
		
		ShortestAndLongest opTsk = new ShortestAndLongest(); 
		
		opTsk.read();
		
	}

	@SuppressWarnings("resource")
	public void read () { // метод, который считывает информацию с клавиатуры, проводит проверки и отправляет числа в другие методы
		
		while (true) {
			
		String someText = "";
			
		System.out.println("Enter a number. To exit enter 'ex'");
			
				try {
					
					someText = bufferedReader.readLine();
					
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			
				if (new Scanner(someText).hasNextInt()) {
					   
					al_1.add(someText);
					
					al_2.add(Integer.parseInt(someText));
					
					}
			
				else if (someText.equals("ex")) {
					
					if (al_1.isEmpty()) {
						
						System.out.println("You did not enter values. Try again");
						
						read ();
						
						break;
						
					}
					
					methodShortLong();
					
					methodSorting();
					
					methodAverage();
					
					methodDifferentNumbers();
					
					break;
					
				}
				
				else {System.out.println("You entered an invalid number or character");}
		}
	}


	public void methodShortLong() { //метод, который находит самое длинное и короткое число
		
		longestLength = al_1.get(0).length();
		
		shortestLength = al_1.get(0).length();
		
		min = max = Integer.parseInt(al_1.get(0)); 
		
		for (String i : al_1) {
			
			if (shortestLength < i.length()) {
				
				longestLength = i.length();
				
				max = Integer.parseInt(i);
			}
			
				if ( shortestLength > i.length() ) {
					
					shortestLength = i.length();
					
					min = Integer.parseInt(i); 
		
				}
				
		}
		
		averageLength = (shortestLength + longestLength) / 2;
		
		System.out.println("the shortest number is - " + min + ". Length of number is - " + shortestLength);
		
		System.out.println("the longest number is - " + max + ". Length of number is - " + longestLength);
		
			
	}
	
	public void methodSorting(){ // метод, который сортирует числа по возрастанию и убыванию
		
		Collections.sort(al_2);
		
		System.out.println("sort numbers in ascending order : ");
		
		for (int i : al_2) {
			
			System.out.print(i + ",");
			
		}
		
		Collections.reverse(al_2);
		
		System.out.println();
		
		System.out.println("sorting numbers in descending order : ");
		
		for (int i : al_2) {
			
			System.out.print(i + " ,");}
	                            }
	
	public void methodAverage() { // метод, который выводит числа в  длинной меньше/больше средней от длинны всех введенных чисел 
		
		for (String i : al_1) {
			
			if (i.length() < averageLength){
			
				al_1AverageLengthLess.add(i);}
			
			if (i.length() >= averageLength){
				
				al_1AverageLengthMore.add(i);}
							  	 }
		
		System.out.println();
		
		System.out.print("numbers whose length is less than the average length : ");
		
		for (String i : al_1AverageLengthLess) {
			
			System.out.print(" " + i + "(length is - " + i.length() + ");");}
		
		System.out.println();
		
		System.out.print("numbers whose length is more than the average length : ");
		
		for (String i : al_1AverageLengthMore) {
			
			System.out.print(" " + i + "(length is - " + i.length() + ");");}
		
								}
	
    public void methodDifferentNumbers() { // метод, который находит число, с самым маленьким набором цифр
		
		
    	ArrayList <Integer> arrayOfDigitIndices = new  ArrayList<Integer>() ;
		
		for (String i : al_1) { 
			
			char[] massChar = i.toCharArray();
			
			arrayOfDigitIndices.add(methodDifferenceCheck(massChar));
		
		}
		
		int numberOfDigits = 0;
		
		int index = 0;
		
		for (int i = 0; i < arrayOfDigitIndices.size(); i++) {
			
			if ( i == 0) {
				numberOfDigits = arrayOfDigitIndices.get(0);
						 }
			if ( numberOfDigits > arrayOfDigitIndices.get(i)) {
				
				numberOfDigits = arrayOfDigitIndices.get(i);
				
				index = i;
			}
															}
		System.out.println();
		System.out.println("number with the least repeating number of digits is " + al_1.get(index));
	}

	public int methodDifferenceCheck(char[] massChar) { //метод, который находит сколько цифр в каждом числе
		
		HashSet<Character> newHashSet = new HashSet<>();
		
		for ( char ch : massChar) {
			
			newHashSet.add(ch);	
		}
		
		return newHashSet.size();
		
	}
	
	
}
