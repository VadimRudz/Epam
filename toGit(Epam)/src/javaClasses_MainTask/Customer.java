package javaClasses_MainTask;

import java.util.ArrayList;
import java.util.Collections;

public class Customer extends Human{

	private int credit�ardNumber;
	private int bankAccountNumber;
	
	Customer [] sampleCustomer = new Customer [5];
	
	ArrayList<String> array_1 = new ArrayList();
	
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
		sampleCustomer [0]  = new Customer (1, "�����-�����������", "��������", "��������", "���������, 15", 12456,  387987456);
		sampleCustomer [1]  = new Customer (2, "�������", "����", "�����������", "������, 83", 11315,  38746856);
		sampleCustomer [2]  = new Customer (3, "������", "���������", "���������", "��������, 18", 13459,  387531456);
		sampleCustomer [3]  = new Customer (4, "��������", "����������", "����������", "������������, 3", 17589,  387987447);
		sampleCustomer [4]  = new Customer (5, "�������", "����", "����������", "������, 99", 13556,  38777456);		
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
    
    public void alphabetOrder (Customer [] sampleCustomer){
    	for (Customer customer: sampleCustomer) {
    		array_1.add(customer.getSurname());
    		Collections.sort(array_1);
    	}
    	System.out.println("������ ����������� � ���������� �������:");
    		System.out.print(array_1.toString() + ", ");
    } 
    
    public void creditCarInterval(Customer [] sampleCustomer, int intervalMin, int intervalMax){
    	System.out.println();
    	System.out.println("������ �����������, ��������������� �� ��������� �����:");
    	for(Customer customer: sampleCustomer) {
    		if (customer.getCredit�ardNumber()>intervalMin && customer.getCredit�ardNumber()<intervalMax){
    			System.out.print(customer.getSurname() + ",");
    		}
    	}
    	System.out.println();
    }
}
