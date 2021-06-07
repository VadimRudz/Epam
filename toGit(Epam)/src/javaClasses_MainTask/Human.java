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

    public void setId(int id) {
    	if (0 <= id && id<= 1000) {
    	this.id = id;}
    	else {
    		System.out.println("Вы ввели неверный id. id должен быть в пределах [0 до 1000]");
    	}
    }
	
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
    
    	if (surname != null && !surname.isEmpty()) {
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
    	
    	if (name != null && !name.isEmpty()) {
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
    	if (patronymic != null && !patronymic.isEmpty()) {
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
    	if (patronymic != null && !patronymic.isEmpty()) {
            for (char c : patronymic.toCharArray()) {
                if (Character.isDigit(c)) {
                	System.out.println("В вашем отчестве недопустимые символы (цифры)"); break; 
                }
            }
        }
    	else {this.address = address;}
    }

    public void arrayObjects(){ 	
    };
    
}
