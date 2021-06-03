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
		
        return "Привет, я - студент: Id - " + getId() + ", фамилия - " + getSurname() + ", имя - " + getName() + ", отчество - " + getPatronymic() + ", адресс- " + getAddress() + ", " 
        		+ "дата рождения - " + getDateOfBirth() + ", телефон - " + getTelephone() + ", факультет - " + getFaculty() + ", курс - " + getCourse() + ", группа - " + getGroup() + ";";
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

    public void setGroup(int group) {
        this.group = group;
    }

	public void arrayObjects() {
		
		Student [] sampleStudent = new Student [5];
		sampleStudent[0] = new Student(1, "Михеев", "Дмитрий", "Валерьевич", "Проспект строителей, 18", "03-07-1988", 297896614, "Транспортных коммуникаций", 5, 114315);
		sampleStudent[1] = new Student(2, "Бонадысев", "Дмитрий", "Александрович", "Проспект победителей, 15", "19-11-1987", 33389156, "Транспортных коммуникаций", 3, 114325);
		sampleStudent[2] = new Student(3, "Климович", "Дмитрий", "Сергееевич", "Якуба Колоса, 12", "05-01-1987", 335569147, "Транспортных коммуникаций", 4, 114335);
		sampleStudent[3] = new Student(4, "Евменова", "Дарья", "Александровна", "Янки Купалы, 2", "08-03-1987", 297896543, "Транспортных коммуникаций", 2, 114345);
		sampleStudent[4] = new Student(5, "Билоус", "Виталий", "Дмитриевич", "Мавра, 87", "11-09-1986", 292345678, "Транспортных коммуникаций", 1, 114355);
		
		for ( Student stdnt : sampleStudent) {
			
			if (stdnt.getName().equals("Дмитрий") && stdnt.getCourse() == 3) {
				System.out.println("Я - " + stdnt.getName() + ", мой курс - "  + stdnt.getCourse());
			}
		}	
	}
	
}
