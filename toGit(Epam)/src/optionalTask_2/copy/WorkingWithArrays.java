package optionalTask_2.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class WorkingWithArrays {

java.io.InputStream inputStream = System.in;
	
	Reader inputStreamReader = new InputStreamReader(inputStream);
	
	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	
	int numberFillingOfMatrix;
	
	public static void main(String[] args) {
		
		
		WorkingWithArrays opTsk = new WorkingWithArrays(); 
		
		opTsk.read();
		
		
		
	}

	@SuppressWarnings("resource")
	public void read() {


		while (true) {
			
			String someText = "";
				
			System.out.println("Enter the size of the matrix. To exit enter 'ex'");
				
					try {
						
						someText = bufferedReader.readLine();
						
					} catch (IOException e) {
					
						e.printStackTrace();
					}
				
					if (new Scanner(someText).hasNextInt()) {
						   
						System.out.println(numberFillingOfMatrix);
						
						fillingTheMatrix(Integer.parseInt(someText));
						
						break;
						
						}
				
					else if (someText.equals("ex")) {
						
						if (someText.isEmpty()) {
							
							System.out.println("You did not enter values. Try again");
							
							read ();
							
							break;
							
						}

						break;
						
					}
					
					else {System.out.println("You entered an invalid number or character");}
			}
		

	}

	private void fillingTheMatrix(int sizeMatrix) { // метод, который заполняет матрицу
		
		numberFillingOfMatrix = (int)(Math.random()*100);
		
		int [][] twoDimArray = new int[sizeMatrix][sizeMatrix];
		
		for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
            	twoDimArray[i][j] = (int)(Math.random()*(2*numberFillingOfMatrix) -numberFillingOfMatrix);
            	System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
		
		int[][] arr_1 = twoDimArray;
		
		sorting(arr_1);
	}

	public void sorting (int[][] arr_1) {
		
		Arrays.sort(arr_1, Comparator.comparingInt(arr -> arr[0])); // arr[0] - колонка, по которой будет проходить сортировка. В данном случае по 0 столбцу
		
		System.out.println(Arrays.deepToString(arr_1));
		
	}
}
