package javaClasses_MainTask;

public class Human {

	private int id;
	
	private String surname, name, patronymic;

	private String address;
	
	public Human(){
		
	}
	
	public Human(int id, String surname, String name, String patronymic, String address) {
	       
		this.id = id;
		
		this.surname = surname;
		
		this.name = name;
		
		this.patronymic = patronymic; 
		
		this.address = address;
		
	   }
	
	public int getId() {
        return id;
    }

    public void setFullName(int id) {
        this.id = id;
    }
	
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPatronymic() {
        return name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
