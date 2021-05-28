package javaClasses_MainTask;

public class Student extends Human{

	private String dateOfBirth;

	private int telephone; 
	
	private String faculty;
	
	int course, group;
	
	public Student(){	
		super();	
	}
	
	public Student(int id, String surname, String name, String patronymic, String address, String dateOfBirth, int telephone, String faculty, int course, int group){
		
		super (id, surname, name, patronymic, address);
		
		this.dateOfBirth = dateOfBirth;
		
		this.telephone = telephone;
		
		this.faculty = faculty;
		
		this.course = course;
		
		this.group = group;
		
	}
	
	public Student(int id, String surname, String name, String patronymic, String address){
		
		this (id, surname, name, patronymic, address, null, 0, null, 0, 0);
		
	}
	
	public Student(String surname, String name, String patronymic){
		
		this (0, surname, name, patronymic, null, null, 0, null, 0, 0);
		
	}
	
	@Override
	public String toString() { 
		StringBuilder strB = new StringBuilder();
		
        return "Hi, i am Student: Id - " + this.getId() + ", фамилия - " + this.getSurname() + ", имя - " + this.getName() + ", отчество - " + this.getPatronymic() + ", адресс- " + this.getAddress() + ", " 
        		+ "дата рождения - " + this.dateOfBirth + ", телефон - " + this.telephone + ", факультет - " + this.faculty + ", курс - " + this.course + ", группа - " + this.group + ";";
     } 
	
	public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
	
    public int getGroup() {
        return group;
    }

    public void setGourse(int group) {
        this.group = group;
    }
}
