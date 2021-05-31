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
	
	public int getCredit�ardNumber() {
        return credit�ardNumber;
    }

    public void setCredit�ardNumber(int credit�ardNumber) {
        this.credit�ardNumber = credit�ardNumber;
    }
    
    public int getBankAccountNumber() {
        return credit�ardNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
    
}
