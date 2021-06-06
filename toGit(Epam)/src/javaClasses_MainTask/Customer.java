package javaClasses_MainTask;

import java.util.ArrayList;
import java.util.Collections;

public class Customer extends Human{

	private int creditСardNumber;
	private int bankAccountNumber;
	
	Customer [] sampleCustomer = new Customer [5];
	
	ArrayList<String> array_1 = new ArrayList();
	
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
		sampleCustomer [0]  = new Customer (1, "Дунин-Марцинкевич", "Викентий", "Иванович", "Соломовой, 15", 12456,  387987456);
		sampleCustomer [1]  = new Customer (2, "Луцевич", "Иван", "Доминикович", "Купалы, 83", 11315,  38746856);
		sampleCustomer [2]  = new Customer (3, "Пушкин", "Александр", "Сергеевич", "Поповича, 18", 13459,  387531456);
		sampleCustomer [3]  = new Customer (4, "Мицкевич", "Константин", "Михайлович", "Пролетарская, 3", 17589,  387987447);
		sampleCustomer [4]  = new Customer (5, "Федоров", "Иван", "Михайлович", "Тавлая, 99", 13556,  38777456);		
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
    
    public void alphabetOrder (Customer [] sampleCustomer){
    	for (Customer customer: sampleCustomer) {
    		array_1.add(customer.getSurname());
    		Collections.sort(array_1);
    	}
    	System.out.println("Список покупателей в алфавитном порядке:");
    		System.out.print(array_1.toString() + ", ");
    } 
    
    public void creditCarInterval(Customer [] sampleCustomer, int intervalMin, int intervalMax){
    	System.out.println();
    	System.out.println("Список покупателей, отсортированных по кредитной карте:");
    	for(Customer customer: sampleCustomer) {
    		if (customer.getCreditСardNumber()>intervalMin && customer.getCreditСardNumber()<intervalMax){
    			System.out.print(customer.getSurname() + ",");
    		}
    	}
    	System.out.println();
    }
}
