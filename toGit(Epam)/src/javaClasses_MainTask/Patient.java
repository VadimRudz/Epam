package javaClasses_MainTask;


public class Patient extends Human{

	private int telephone;
	
	private int medicalCardNumber;
	
	private String diagnosis;
	
	public Patient(){	
		super();	
	}
	
	public Patient(int id, String surname, String name, String patronymic, String address, int telephone,  int medicalCardNumber, String diagnosis){
		
		super (id, surname, name, patronymic, address);
		
		this.telephone = telephone;
		
		this.medicalCardNumber = medicalCardNumber;
		
		this.diagnosis = diagnosis;
		
	}
	
	public Patient(int id, String surname,int medicalCardNumber, String diagnosis)
	{
		
		this(id, surname, null,  null, null, 0, medicalCardNumber, diagnosis);
		
	}
	
	@Override
	public String toString() { 
		
        return "Привет, я студент: Id - " + getId() + ", фамилия - " + getSurname() + ", имя - " + getName() + ", отчество - " + getPatronymic() + ", адресс- " + getAddress() + ", " 
        		+ " телефон - " + telephone + ", номер медицинской карты - " + medicalCardNumber + ", диагноз - " + diagnosis + ";";
     } 
	
	public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
	
    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }
    
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
