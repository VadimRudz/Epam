package javaClasses_MainTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Customer extends Human{

	private int creditÑardNumber;
	private int bankAccountNumber;
	
	Customer [] sampleCustomer = new Customer [5];
	
	ArrayList<String> array_1 = new ArrayList<String>();
	
	public Customer(){	
		super();	
	}
	
	public Customer(int id, String surname, String name, String patronymic, 
			String address, int creditÑardNumber,  int bankAccountNumber) {
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
		return "Customer [creditÑardNumber=" + creditÑardNumber + ", bankAccountNumber=" + bankAccountNumber
				+ ", sampleCustomer=" + Arrays.toString(sampleCustomer) + ", array_1=" + array_1
				+ ", getCreditÑardNumber()=" + getCreditÑardNumber() + ", getBankAccountNumber()="
				+ getBankAccountNumber() + ", getId()=" + getId() + ", getSurname()=" + getSurname() + ", getName()="
				+ getName() + ", getPatronymic()=" + getPatronymic() + ", getAddress()=" + getAddress()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
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
    	if((0<=creditÑardNumber) && (creditÑardNumber<=1_000_000_000)){
    		this.creditÑardNumber = creditÑardNumber;}
    		else {
    			System.out.println("Âû ââåëè íåâåğíûé íîìåğ êğåäèòíîé êàğòû. "
    					+ "Íîìåğ äîëæåí áûòü â ïğåäåëàõ [0 äî 1_000_000_000]");
    		}
    }
    
    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
    
    public void outputCustomersSortedByAlphabetOrder (Customer [] sampleCustomer) {
    	for (Customer customer: sampleCustomer) {
    		array_1.add(customer.getSurname());
    		Collections.sort(array_1);
    	}
    	System.out.println("Ñïèñîê ïîêóïàòåëåé â àëôàâèòíîì ïîğÿäêå:");
    		System.out.print(array_1.toString() + ", ");
    } 
    
    public void outputCustomersSortedByCreditCarInterval(Customer [] sampleCustomer, int intervalMin, int intervalMax) {
    	System.out.println();
    	System.out.println("Ñïèñîê ïîêóïàòåëåé, îòñîğòèğîâàííûõ ïî êğåäèòíîé êàğòå:");
    	for (Customer customer: sampleCustomer) {
    		if ((customer.getCreditÑardNumber()>intervalMin) && (customer.getCreditÑardNumber()<intervalMax)){
    			System.out.print(customer.getSurname() + ",");
    		}
    	}
    	System.out.println();
    }
}
