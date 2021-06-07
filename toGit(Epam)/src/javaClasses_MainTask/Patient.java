package javaClasses_MainTask;


public class Patient extends Human{

	private int telephone;
	private int medicalCardNumber;
	private String diagnosis;
	Patient [] samplePatient = new Patient [5];
	
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
        return "Привет, я пациент: Id - " + getId() + ", фамилия - " + getSurname() + ", имя - " + getName() + ", отчество - " + getPatronymic() + ", адресс- " + getAddress() + ", " 
        		+ " телефон - " + getTelephone() + ", номер медицинской карты - " + getMedicalCardNumber() + ", диагноз - " + getDiagnosis() + ";";
     } 
	
	public void arrayObjects() { 
		samplePatient [0]  = new Patient (15, "Паркер", 1547, "депрессия");
		samplePatient [1]  = new Patient (16, "Бэннер", 1574, "стресс");
		samplePatient [2]  = new Patient (17, "Стрэндж", 1637, "растройство личности");
		samplePatient [3]  = new Patient (18, "Саммерс", 1333, "стресс");
		samplePatient [4]  = new Patient (19, "Октавиус", 1987, "проффесианальное выгорание");
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
    
    public void sortDiagnosis(Patient [] samplePatient, String diagnosis){
    	System.out.println("Cписок пациентов с диагнозом " + diagnosis + ":");
    	for(Patient patient: samplePatient) {
    		if(patient.getDiagnosis().equals(diagnosis)){
    			System.out.print(patient.getSurname()+", ");
    		}
    	}
    	System.out.println();
    }
    
    public void medicalCardNumberInterval(Patient [] samplePatient, int numberMin, int numberMax){
    	System.out.println("Список пациентов, отсортированных по номеру медицинской карты:");
    	for(Patient patient : samplePatient) {
    		if(patient.getMedicalCardNumber()>numberMin && patient.getMedicalCardNumber()<numberMax){
    			System.out.print(patient.getSurname()+", ");
    		}
    	}
    	System.out.println();
    }
}
