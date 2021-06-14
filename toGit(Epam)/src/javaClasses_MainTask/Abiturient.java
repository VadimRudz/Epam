package javaClasses_MainTask;

import java.util.ArrayList;
import java.util.Collections;

public class Abiturient extends Human{

	private int telephone;
	private double averageScore;
	Abiturient [] sampleAbiturient = new Abiturient [5];
	ArrayList<Double> arrayMarks = new ArrayList<>();
	
	public Abiturient(){	
		super();	
	}
	
	public Abiturient(int id, String surname, String name, String patronymic, 
			String address, int telephone,  double averageScore) {
		super (id, surname, name, patronymic, address);
		 this.telephone = telephone;
		this.averageScore = averageScore;
		}
	
	public Abiturient(String surname, String name, double averageScore) {
		this(0, surname, name, null, null, 0, averageScore);
		}
	
	@Override
	public String toString() { 
        return "Привет, я абитуриент: Id - " + getId() + ", фамилия - " + getSurname() + ", имя - " + getName() 
        + ", отчество - " + getPatronymic() + ", адресс- " + getAddress() + ", " 
        + " номер телефона - " + getTelephone() + ", мой средний балл - " + getAverageScore() + ";";
     }
	
	public void arrayObjects() { 
		sampleAbiturient [0]  = new Abiturient ("Box", "Антон", 3.8);
		sampleAbiturient [1]  = new Abiturient ("lollipop21k", "Игорь", 8.9);
		sampleAbiturient [2]  = new Abiturient ("Jyo", "Расим", 5.3);
		sampleAbiturient [3]  = new Abiturient ("iDisbalance", "Артем", 6.5);
		sampleAbiturient [4]  = new Abiturient ("mds", "Александр", 3.5);
	}
	
	public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
    
    public void badMarks(Abiturient [] sampleAbiturient, double mark) {
    	System.out.println("Cписок абитуриентов с неудовлетворительным средним баллом(<" + mark + "):");
    	for (Abiturient abiturient : sampleAbiturient) {
    		arrayMarks.add(abiturient.getAverageScore());
    		if(abiturient.getAverageScore()<mark) {
    			System.out.print(abiturient.getSurname()+", ");
    		}
    	}
    	System.out.println();
    }
    
    public void goodMarks(Abiturient [] sampleAbiturient, double mark) {
    	System.out.println("Cписок абитуриентов с удовлетворительным средним баллом(>" + mark + "):");
    	for (Abiturient abiturient : sampleAbiturient) {
    		if(abiturient.getAverageScore()>mark) {
    			System.out.print(abiturient.getSurname()+", ");
    		}
    	}
    	System.out.println();
    }
    
   public void chooseBestAbiturients(Abiturient [] sampleAbiturient, int numberSelected) {
	   System.out.println("Список студентов с лучшим средним балом(количество-" + numberSelected + ")");
	   ArrayList<Abiturient>arrayStudentsMin = new ArrayList();
	   Collections.sort(arrayMarks);
	   for (int i = arrayMarks.size()-1; i>=arrayMarks.size()-numberSelected; i--) {
		   for (Abiturient abiturient : sampleAbiturient) {
			   if(abiturient.getAverageScore()==arrayMarks.get(i)){
				   arrayStudentsMin.add(abiturient);
			   }
		   }
	   }
	   for (int i = arrayStudentsMin.size()-1; i>=arrayStudentsMin.size()-numberSelected; i--) {
		   System.out.print(arrayStudentsMin.get(i).getSurname()+"(средний балл - " + arrayStudentsMin.get(i).getAverageScore() + "), ");
	   }
	   System.out.println();
   }
}
