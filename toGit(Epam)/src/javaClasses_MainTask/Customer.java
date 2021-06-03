package javaClasses_MainTask;

public class Customer extends Human{

	private int creditСardNumber;
	private int bankAccountNumber;
	
	
	public Customer(){	
		super();	
	}
	
	public Customer(int id, String surname, String name, String patronymic, String address, int creditСardNumber,  int bankAccountNumber){
		
		super (id, surname, name, patronymic, address);
		this.creditСardNumber = creditСardNumber;
		this.bankAccountNumber = bankAccountNumber;
		}
	
	public Customer(int id, String surname,int bankAccountNumber)
	{
		this(id, surname, null, null, null, 0, bankAccountNumber);
		}
	
	@Override
	public String toString() { 
		
        return "Привет, я клиент банка: Id - " + getId() + ", фамилия - " + getSurname() + ", имя - " + getName() + ", отчество - " + getPatronymic() + ", адресс- " + getAddress() + ", " 
        		+ " номер кредитной карты - " + getCreditСardNumber() + ", номер банковского счета - " + getBankAccountNumber() + ";";
     } 
	
	public void arrayObjects() {
		
		Customer [] sampleCustomer = new Customer [5];
		sampleCustomer [0]  = new Customer (1, "Дунин-Марцинкевич", "Викентий", "Иванович", "Соломовой, 15", 12456,  387987456);
		sampleCustomer [1]  = new Customer (2, "Луцевич", "Иван", "Доминикович", "Купалы, 83", 11315,  38746856);
		sampleCustomer [2]  = new Customer (3, "Пушкин", "Александр", "Сергеевич", "Поповича, 18", 13459,  387531456);
		sampleCustomer [3]  = new Customer (4, "Мицкевич", "Константин", "Михайлович", "Пролетарская, 3", 22436,  387987447);
		sampleCustomer [4]  = new Customer (5, "Федоров", "Иван", "Михайлович", "Тавлая, 99", 13556,  38777456);
		
		for ( Customer cstm : sampleCustomer) {
			if (cstm.getCreditСardNumber()==12456 && cstm.getBankAccountNumber() == 387987456) {
				System.out.println("Я - " + cstm.getName() + ", мой номер кредитной карты - "  + cstm.getCreditСardNumber() + ", номер банковского счета -" + cstm.getBankAccountNumber()+ ";");
			}
		  }	
	}

	
	public int getCreditСardNumber() {
        return creditСardNumber;
    }

    public void setCreditСardNumber(int creditСardNumber) {
        this.creditСardNumber = creditСardNumber;
    }
    
    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
    
}
