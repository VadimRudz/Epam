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
		
        return "������, � �������: Id - " + getId() + ", ������� - " + getSurname() + ", ��� - " + getName() + ", �������� - " + getPatronymic() + ", ������- " + getAddress() + ", " 
        		+ " ������� - " + getTelephone() + ", ����� ����������� ����� - " + getMedicalCardNumber() + ", ������� - " + getDiagnosis() + ";";
     } 
	
	public void arrayObjects() { 
		
		Patient [] samplePatient = new Patient [5];
		
		samplePatient [0]  = new Patient (15, "������", 1547, "������");
		
		samplePatient [1]  = new Patient (16, "������", 1574, "������");
		
		samplePatient [2]  = new Patient (17, "�������", 1637, "������");
		
		samplePatient [3]  = new Patient (18, "�������", 1333, "������");
		
		samplePatient [4]  = new Patient (19, "��������", 1987, "������");
		
		for ( Patient ptnt : samplePatient) {
			
			if (ptnt.getMedicalCardNumber()==1547 && ptnt.getDiagnosis().equals("������")) {
				
				System.out.println("� - " + ptnt.getSurname() + ", ��� ����� ����������� ����� - "  + ptnt.getMedicalCardNumber() + ", ������� -" + ptnt.getDiagnosis()+ ";");
				
			}
		  }
		
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
