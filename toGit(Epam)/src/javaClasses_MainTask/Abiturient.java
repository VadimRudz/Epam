package javaClasses_MainTask;

public class Abiturient extends Human{

	private int telephone;
	
	private double averageScore;
	
	public Abiturient(){	
		super();	
	}
	
	public Abiturient(int id, String surname, String name, String patronymic, String address, int telephone,  double averageScore){
		
		super (id, surname, name, patronymic, address);
		
		this.telephone = telephone;
		
		this.averageScore = averageScore;
		
	}
	
	public Abiturient(String surname, String name, double averageScore){
		
		this(0, surname, name, null, null, 0, averageScore);
		
	}
	
	@Override
	public String toString() { 
		
        return "Привет, я абитуриент: Id - " + getId() + ", фамилия - " + getSurname() + ", имя - " + getName() + ", отчество - " + getPatronymic() + ", адресс- " + getAddress() + ", " 
        		+ " номер телефона - " + getTelephone() + ", мой средний балл - " + getAverageScore() + ";";
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
}
