package javaClasses_MainTask;

import java.util.ArrayList;
import java.util.Collections;

public class Customer extends Human{

	private int creditÑardNumber;
	private int bankAccountNumber;
	
	Customer [] sampleCustomer = new Customer [5];
	
	ArrayList<String> array_1 = new ArrayList();
	
	public Customer(){	
		super();	
	}
	
	public Customer(int id, String surname, String name, String patronymic, String address, int creditÑardNumber,  int bankAccountNumber){
		super (id, surname, name, patronymic, address);
		this.creditÑardNumber = creditÑardNumber;
		this.bankAccountNumber = bankAccountNumber;
		}
	
	public Customer(int id, String surname,int bankAccountNumber)
	{
		this(id, surname, null, null, null, 0, bankAccountNumber);
		}
	
	@Override
	public String toString() { 
        return "Ïğèâåò, ÿ êëèåíò áàíêà: Id - " + getId() + ", ôàìèëèÿ - " + getSurname() + ", èìÿ - " + getName() + ", îò÷åñòâî - " + getPatronymic() + ", àäğåññ- " + getAddress() + ", " 
        		+ " íîìåğ êğåäèòíîé êàğòû - " + getCreditÑardNumber() + ", íîìåğ áàíêîâñêîãî ñ÷åòà - " + getBankAccountNumber() + ";";
     } 
	
	public void arrayObjects() {
		sampleCustomer [0]  = new Customer (1, "Äóíèí-Ìàğöèíêåâè÷", "Âèêåíòèé", "Èâàíîâè÷", "Ñîëîìîâîé, 15", 12456,  387987456);
		sampleCustomer [1]  = new Customer (2, "Ëóöåâè÷", "Èâàí", "Äîìèíèêîâè÷", "Êóïàëû, 83", 11315,  38746856);
		sampleCustomer [2]  = new Customer (3, "Ïóøêèí", "Àëåêñàíäğ", "Ñåğãååâè÷", "Ïîïîâè÷à, 18", 13459,  387531456);
		sampleCustomer [3]  = new Customer (4, "Ìèöêåâè÷", "Êîíñòàíòèí", "Ìèõàéëîâè÷", "Ïğîëåòàğñêàÿ, 3", 17589,  387987447);
		sampleCustomer [4]  = new Customer (5, "Ôåäîğîâ", "Èâàí", "Ìèõàéëîâè÷", "Òàâëàÿ, 99", 13556,  38777456);		
	}
	
	public int getCreditÑardNumber() {
        return creditÑardNumber;
    }

    public void setCreditÑardNumber(int creditÑardNumber) {
        this.creditÑardNumber = creditÑardNumber;
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
    	System.out.println("Ñïèñîê ïîêóïàòåëåé â àëôàâèòíîì ïîğÿäêå:");
    		System.out.print(array_1.toString() + ", ");
    } 
    
    public void creditCarInterval(Customer [] sampleCustomer, int intervalMin, int intervalMax){
    	System.out.println();
    	System.out.println("Ñïèñîê ïîêóïàòåëåé, îòñîğòèğîâàííûõ ïî êğåäèòíîé êàğòå:");
    	for(Customer customer: sampleCustomer) {
    		if (customer.getCreditÑardNumber()>intervalMin && customer.getCreditÑardNumber()<intervalMax){
    			System.out.print(customer.getSurname() + ",");
    		}
    	}
    	System.out.println();
    }
}
