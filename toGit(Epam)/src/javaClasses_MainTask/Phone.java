package javaClasses_MainTask;

import java.util.ArrayList;
import java.util.Collections;

public class Phone {
private int id;
private String surname, name, patronymic;
private String address;
private int creditСardNumber;
private double debit, credit;
private long talkTimeCity;
private long talkTimeIntercity;

Phone [] sampleSubscriber = new Phone[6];
ArrayList <String> arraySurname = new ArrayList<String>();

public Phone(){
}

public Phone(int id, String surname, String name, String patronymic,
		String address, int creditСardNumber, double debit,
		double credit, long talkTimeCity, long talkTimeIntercity) {
	this.id = id;
	this.surname = surname;
	this.name = name;
	this.patronymic = patronymic;
	this.address = address;
	this.creditСardNumber = creditСardNumber;
	this.debit = debit;
	this.credit = credit;
	this.talkTimeCity = talkTimeCity;
	this.talkTimeIntercity = talkTimeIntercity;
}

public Phone(int id, String surname, long talkTimeCity) {
	this(id, surname, null, null, null, 0, 0, 0, talkTimeCity, 0);
}

public Phone(String surname, double credit, long talkTimeCity, long talkTimeIntercity) {
	this(0, surname, null, null, null, 0, 0, credit, talkTimeCity, talkTimeIntercity);
}

@Override
public String toString() {
	return "Phone [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", address="
			+ address + ", creditСardNumber=" + creditСardNumber + ", debit=" + debit + ", credit=" + credit
			+ ", talkTime=" + talkTimeCity + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	if ((0 <= id) && (id<= 1_000_000)) {
    	this.id = id;}
    	else {
    		System.out.println("Вы ввели неверный id. id должен быть в пределах [0 до 1_000_000]");
    	}
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	if ((surname != null) && (!surname.isEmpty())) {
        for (char c : surname.toCharArray()) {
            if (Character.isDigit(c)) {
            	System.out.println("В вашей фамилии недопустимые символы (цифры)"); break; 
            }
        }
    }
	else {this.surname = surname;}
}

public String getName() {
	return name;
}

public void setName(String name) {
	if ((name != null) && (!name.isEmpty())) {
        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
            	System.out.println("В вашем имени недопустимые символы (цифры)"); break; 
            }
        }
    }
	else { this.name = name;}
}

public String getPatronymic() {
	return patronymic;
}

public void setPatronymic(String patronymic) {
	if ((patronymic != null) && (!patronymic.isEmpty())) {
        for (char c : patronymic.toCharArray()) {
            if (Character.isDigit(c)) {
            	System.out.println("В вашем отчестве недопустимые символы (цифры)"); break; 
            }
        }
    }
	else {this.patronymic = patronymic;}
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	if ((patronymic != null) && (!patronymic.isEmpty())) {
        for (char c : patronymic.toCharArray()) {
            if (Character.isDigit(c)) {
            	System.out.println("В вашем отчестве недопустимые символы (цифры)"); break; 
            }
        }
    }
	else {this.address = address;}
}

public int getCreditСardNumber() {
	return creditСardNumber;
}

public void setCreditСardNumber(int creditСardNumber) {
	if ((0<=creditСardNumber) && (creditСardNumber<=1_000_000_000)){
	this.creditСardNumber = creditСardNumber;}
	else {
		System.out.println("Вы ввели неверный номер кредитной карты. "
				+ "Номер должен быть в пределах [0 до 1_000_000_000]");
	}
}

public double getDebit() {
	return debit;
}

public void setDebit(double debit) {
	if (debit>=0){
	this.debit = debit;}
	else {
		System.out.println("Вы ввели отрицательную сумму дебита.");
	}
}

public double getCredit() {
	return credit;
}

public void setCredit(double credit) {
	if (credit>=0){
	this.credit = credit;}
	else {
		System.out.println("Вы ввели отрицательную сумму кредита.");
	}
}

public long getTalkTimeCity() {
	return talkTimeCity;
}

public void setTalkTimeCity(long talkTimeCity) {
	if (talkTimeCity>=0){
	this.talkTimeCity = talkTimeCity;}
	else {
		System.out.println("Время разговоров(городских) не может быть отрицательным");
	}
}


public long getTalkTimeIntercity() {
	return talkTimeIntercity;
}

public void setTalkTimeIntercity(long talkTimeIntercity) {
	if (talkTimeIntercity>=0){
	this.talkTimeIntercity = talkTimeIntercity;}
	else {
		System.out.println("Время разговоров(междугородних) не может быть отрицательным");
	}
}

public void arrayPhones() { 
	sampleSubscriber [0]  = new Phone ("Рудь", 0.1, 20542, 15);
	sampleSubscriber [1]  = new Phone ("Головачик", 3.5, 15162, 154);
	sampleSubscriber [2]  = new Phone ("Радевич", 0.5, 10112, 23);
	sampleSubscriber [3]  = new Phone ("Станкевич", 2.2, 8352, 11);
	sampleSubscriber [4]  = new Phone ("Дубик", 0.2, 35425, 142);
	sampleSubscriber [5]  = new Phone ("Вишневская", 0.1, 6452, 0);
}

public void outputPhonesSortedByTimeCity(Phone [] sampleSubscriber, long timeMin){
	System.out.println("Cписок абонентов, со временем внутригородских разговоров, превышающих время " 
			+ timeMin + ",милисекунд:");
	for (Phone phone : sampleSubscriber) {
		arraySurname.add(phone.getSurname());
		if (phone.getTalkTimeCity()>timeMin) {
			System.out.print(phone.getSurname() + ", ");
		}
	}
	System.out.println();
}

public void outputPhonesSortedByTimeIntercity(Phone [] sampleSubscriber){
	System.out.println("Cписок абонентов, которые пользовались междугородней связью: ");
	for (Phone phone : sampleSubscriber) {
		if (phone.getTalkTimeIntercity()>0){
			System.out.print(phone.getSurname() + ", ");
		}
	}
	System.out.println();
}

public void outputPhonesSortedByAlphabetOrder(ArrayList <String> arraySurname){
	Collections.sort(arraySurname);
	System.out.println("Cписок абонентов в алфавитном порядке: ");
	System.out.println(arraySurname.toString());
	}

}
