package javaClasses_MainTask;

public class Abiturient extends Human{

	private int telephone;
	
	private double averageScore;
	
	public int y;
	
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
	
	public void arrayObjects() { 
		
		Abiturient [] sampleAbiturient = new Abiturient [5];
		
		sampleAbiturient [0]  = new Abiturient ("Box", "Антон", 0.85);
		
		sampleAbiturient [1]  = new Abiturient ("lollipop21k", "Игорь", 1.15);
		
		sampleAbiturient [2]  = new Abiturient ("Jyo", "Расим", 0.94);
		
		sampleAbiturient [3]  = new Abiturient ("iDisbalance", "Артем", 1.05);
		
		sampleAbiturient [4]  = new Abiturient ("mds", "Александр", 0.92);
		
		for ( Abiturient abtrnt : sampleAbiturient) {
			
			if (abtrnt.getAverageScore() > 0.90) {
				
				System.out.println("Я - " + abtrnt.getSurname() + ", мой рейтинг в CS GO - "  + abtrnt.getAverageScore() + ";");
				
			}
		  }
		
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
