package javaClasses_MainTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Abiturient extends Human{

	private int telephoneAbiturient;
	private double averageScoreAbiturient;
	Abiturient [] sampleAbiturient = new Abiturient [5];
	ArrayList<Double> arrayMarksAbiturient = new ArrayList<>();
	
	public Abiturient(){	
		super();
	}
	
	public Abiturient(int id, String surname, String name, String patronymic, 
			String address, int telephoneAbiturient,  double averageScoreAbiturient) {
		super (id, surname, name, patronymic, address);
		 this.telephoneAbiturient = telephoneAbiturient;
		this.averageScoreAbiturient = averageScoreAbiturient;
		}
	
	public Abiturient(String surname, String name, double averageScore) {
		this(0, surname, name, null, null, 0, averageScore);
		}
	
	
	@Override
	public String toString() {
		return "Abiturient [telephoneAbiturient=" + telephoneAbiturient + ", averageScoreAbiturient="
				+ averageScoreAbiturient + ", sampleAbiturient=" + Arrays.toString(sampleAbiturient)
				+ ", arrayMarksAbiturient=" + arrayMarksAbiturient + ", getTelephoneAbiturient()="
				+ getTelephoneAbiturient() + ", getAverageScoreAbiturient()=" + getAverageScoreAbiturient()
				+ ", getId()=" + getId() + ", getSurname()=" + getSurname() + ", getName()=" + getName()
				+ ", getPatronymic()=" + getPatronymic() + ", getAddress()=" + getAddress() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public void createArrayObjects() { 
		sampleAbiturient [0]  = new Abiturient ("Box", "Антон", 3.8);
		sampleAbiturient [1]  = new Abiturient ("lollipop21k", "Игорь", 8.9);
		sampleAbiturient [2]  = new Abiturient ("Jyo", "Расим", 5.3);
		sampleAbiturient [3]  = new Abiturient ("iDisbalance", "Артем", 6.5);
		sampleAbiturient [4]  = new Abiturient ("mds", "Александр", 3.5);
	}
	
	public int getTelephoneAbiturient() {
        return telephoneAbiturient;
    }

    public void setTelephoneAbiturient(int telephoneAbiturient) {
        this.telephoneAbiturient = telephoneAbiturient;
    }
    
    public double getAverageScoreAbiturient() {
        return averageScoreAbiturient;
    }

    public void setAverageScore(double averageScoreAbiturient) {
        this.averageScoreAbiturient = averageScoreAbiturient;
    }
    
    public void outputAbiturientsWithBadGrades(Abiturient [] sampleAbiturient, double mark) { 
    	System.out.println("Cписок абитуриентов с неудовлетворительным средним баллом(<" + mark + "):");
    	for (Abiturient abiturient : sampleAbiturient) {
    		arrayMarksAbiturient.add(abiturient.getAverageScoreAbiturient());
    		if(abiturient.getAverageScoreAbiturient()<mark) {
    			System.out.print(abiturient.getSurname()+", ");
    		}
    	}
    	System.out.println();
    }
    
    public void outputAbiturientsWithGoodGrades(Abiturient [] sampleAbiturient, double mark) { 
    	System.out.println("Cписок абитуриентов с удовлетворительным средним баллом(>" + mark + "):");
    	for (Abiturient abiturient : sampleAbiturient) {
    		if(abiturient.getAverageScoreAbiturient()>mark) {
    			System.out.print(abiturient.getSurname()+", ");
    		}
    	}
    	System.out.println();
    }
    
   public void outputAbiturientsWhithBestAverage(Abiturient [] sampleAbiturient, int numberSelected) {
	   System.out.println("Список студентов с лучшим средним балом(количество-" + numberSelected + ")");
	   ArrayList<Abiturient>arrayStudentsMin = new ArrayList<Abiturient>();
	   Collections.sort(arrayMarksAbiturient);
	   for (int i = arrayMarksAbiturient.size()-1; i>=arrayMarksAbiturient.size()-numberSelected; i--) {
		   for (Abiturient abiturient : sampleAbiturient) {
			   if(abiturient.getAverageScoreAbiturient()==arrayMarksAbiturient.get(i)){
				   arrayStudentsMin.add(abiturient);
			   }
		   }
	   }
	   for (int i = arrayStudentsMin.size()-1; i>=arrayStudentsMin.size()-numberSelected; i--) {
		   System.out.print(arrayStudentsMin.get(i).getSurname()+"(средний балл - " + arrayStudentsMin.get(i).getAverageScoreAbiturient() + "), ");
	   }
	   System.out.println();
   }
}
