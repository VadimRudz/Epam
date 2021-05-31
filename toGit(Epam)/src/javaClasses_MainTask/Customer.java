package javaClasses_MainTask;

public class Customer extends Human{

	private int creditÑardNumber;
	
	private int bankAccountNumber;
	
	
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
	
	public int getCreditÑardNumber() {
        return creditÑardNumber;
    }

    public void setCreditÑardNumber(int creditÑardNumber) {
        this.creditÑardNumber = creditÑardNumber;
    }
    
    public int getBankAccountNumber() {
        return creditÑardNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
    
}
