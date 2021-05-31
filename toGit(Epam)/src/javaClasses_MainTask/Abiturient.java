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
		
        return "������, � ����������: Id - " + getId() + ", ������� - " + getSurname() + ", ��� - " + getName() + ", �������� - " + getPatronymic() + ", ������- " + getAddress() + ", " 
        		+ " ����� �������� - " + getTelephone() + ", ��� ������� ���� - " + getAverageScore() + ";";
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
