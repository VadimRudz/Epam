package javaClasses_MainTask;

public class Customer extends Human{

	private int credit�ardNumber;
	private int bankAccountNumber;
	
	
	public Customer(){	
		super();	
	}
	
	public Customer(int id, String surname, String name, String patronymic, String address, int credit�ardNumber,  int bankAccountNumber){
		
		super (id, surname, name, patronymic, address);
		this.credit�ardNumber = credit�ardNumber;
		this.bankAccountNumber = bankAccountNumber;
		}
	
	public Customer(int id, String surname,int bankAccountNumber)
	{
		this(id, surname, null, null, null, 0, bankAccountNumber);
		}
	
	@Override
	public String toString() { 
		
        return "������, � ������ �����: Id - " + getId() + ", ������� - " + getSurname() + ", ��� - " + getName() + ", �������� - " + getPatronymic() + ", ������- " + getAddress() + ", " 
        		+ " ����� ��������� ����� - " + getCredit�ardNumber() + ", ����� ����������� ����� - " + getBankAccountNumber() + ";";
     } 
	
	public void arrayObjects() {
		
		Customer [] sampleCustomer = new Customer [5];
		sampleCustomer [0]  = new Customer (1, "�����-�����������", "��������", "��������", "���������, 15", 12456,  387987456);
		sampleCustomer [1]  = new Customer (2, "�������", "����", "�����������", "������, 83", 11315,  38746856);
		sampleCustomer [2]  = new Customer (3, "������", "���������", "���������", "��������, 18", 13459,  387531456);
		sampleCustomer [3]  = new Customer (4, "��������", "����������", "����������", "������������, 3", 22436,  387987447);
		sampleCustomer [4]  = new Customer (5, "�������", "����", "����������", "������, 99", 13556,  38777456);
		
		for ( Customer cstm : sampleCustomer) {
			if (cstm.getCredit�ardNumber()==12456 && cstm.getBankAccountNumber() == 387987456) {
				System.out.println("� - " + cstm.getName() + ", ��� ����� ��������� ����� - "  + cstm.getCredit�ardNumber() + ", ����� ����������� ����� -" + cstm.getBankAccountNumber()+ ";");
			}
		  }	
	}

	
	public int getCredit�ardNumber() {
        return credit�ardNumber;
    }

    public void setCredit�ardNumber(int credit�ardNumber) {
        this.credit�ardNumber = credit�ardNumber;
    }
    
    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
    
}
