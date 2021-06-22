package javaClasses_MainTask;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;

public class Student extends Human{

	private GregorianCalendar dateOfBirth;
	private int telephone; 
	private String faculty;
	private int course, group;
	
	Student [] sampleStudent = new Student [8];
	HashSet<String> newHashSetFaculty = new HashSet<>();
	HashSet<Integer> newHashSetGroup = new HashSet<>();
	
	public Student(){	
		super();	
	}
	
	public Student(int id, String surname, String name, String patronymic, 
			String address, GregorianCalendar  dateOfBirth, 
			int telephone, String faculty, int course, int group){
		super (id, surname, name, patronymic, address);
		this.dateOfBirth = dateOfBirth;
		this.telephone = telephone;
		this.faculty = faculty;
		this.course = course;
		this.group = group;
	}
	
	public Student(int id, String surname, String name, String patronymic, String address) {
		this (id, surname, name, patronymic, address, null, 0, null, 0, 0);
	}
	
	public Student(String surname, String name, String patronymic) {
		this (0, surname, name, patronymic, null, null, 0, null, 0, 0);
	}
	
	@Override
	public String toString() { 
        return "Привет, я - студент: Id - " + getId() + ", фамилия - " + getSurname() 
        + ", имя - " + getName() + ", отчество - " + getPatronymic() + ", адресс- " 
        + getAddress() + ", " + "дата рождения - " + getDateOfBirth() + ", телефон - " 
        + getTelephone() + ", факультет - " + getFaculty() + ", курс - " + getCourse() 
        + ", группа - " + getGroup() + ";";
     } 
	
	public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
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
		sampleStudent[0] = new Student(1, "Михеев", "Дмитрий", "Валерьевич", "Проспект строителей, 18", new GregorianCalendar(1987, Calendar.FEBRUARY , 23), 297896614, "Транспортных коммуникаций", 5, 114315);
		sampleStudent[1] = new Student(2, "Бонадысев", "Дмитрий", "Александрович", "Проспект победителей, 15", new GregorianCalendar(1988, Calendar.NOVEMBER , 27), 33389156, "Транспортных коммуникаций", 3, 114315);
		sampleStudent[2] = new Student(3, "Климович", "Александр", "Сергееевич", "Якуба Колоса, 12", new GregorianCalendar(1986, Calendar.JANUARY , 18), 335569147, "Транспортных коммуникаций", 4, 114335);
		sampleStudent[3] = new Student(4, "Евменова", "Дарья", "Александровна", "Янки Купалы, 2", new GregorianCalendar(1990, Calendar.APRIL , 3), 297896543, "Транспортных коммуникаций", 2, 114335);
		sampleStudent[4] = new Student(5, "Билоус", "Виталий", "Дмитриевич", "Мавра, 87", new GregorianCalendar(1991, Calendar.JULY , 15), 292345678, "Транспортных коммуникаций", 1, 114345);
		sampleStudent[5] = new Student(6, "Аксамит", "Виталий", "Вадимович", "Лидская, 33", new GregorianCalendar(1985, Calendar.AUGUST , 05), 292466378, "Технологий управления и гуманитаризации", 3, 114345);
		sampleStudent[6] = new Student(7, "Вроцлав", "Василий", "Викторович", "Московская, 12", new GregorianCalendar(1987, Calendar.AUGUST , 21), 292345466, "Информационных технологий", 1, 114125);
		sampleStudent[7] = new Student(8, "Ивулин", "Александр", "Дмитриевич", "Октябрьская, 1", new GregorianCalendar(1995, Calendar.DECEMBER, 1), 292366545, "Энергоснабжения", 1, 114125);
	}
	
	public void outputStudentsSortedByFaculty (Student [] sampleStudent, String faculty) { //метод выводит всех студентов одного факультета
		System.out.println("Список студентов факультета " + faculty + ":");
		for ( Student stdnt : sampleStudent) {
			newHashSetFaculty.add(stdnt.getFaculty());
			newHashSetGroup.add(stdnt.getGroup());
			if (stdnt.getFaculty().equals(faculty)) {
				System.out.print(stdnt.getSurname() + ",");
			}
		}
		System.out.print("");
	}
	
	public void outputStudentsSortedByFacultyAndCourse (Student [] sampleStudent){  // метод выводит всех студентов, скомпанованных по факультету 
		
		for (String strng : newHashSetFaculty) {
			System.out.println("Список студентов факультета " + strng + ": ");
			
			for ( Student stdnt : sampleStudent) {
				if (stdnt.getFaculty().equalsIgnoreCase(strng)) {
					System.out.println(stdnt.getSurname() + ", курс - " + stdnt.getCourse());
				}
			}
		}
	}
	
	public void outputStudentsSortedByDateOfBirth(Student [] sampleStudent, int year){ // метод выводит студентов, родившихся после 1990 года
		for (Student stdnt : sampleStudent) { 
			if (stdnt.getDateOfBirth().get(GregorianCalendar.YEAR) > year) {
				System.out.println(stdnt.getSurname() + ", год рождения - " + stdnt.getDateOfBirth().get(GregorianCalendar.YEAR));
			}
		}
	}
	
	public void outputStudentsSortedByGroup (Student [] sampleStudent) {// метод выводит всех студентов, скомпанованных по группам
		for (int score : newHashSetGroup) {
			System.out.println("Список студентов группы " + score + ": ");
			
			for ( Student stdnt : sampleStudent) {
				if (stdnt.getGroup() == score) {
					System.out.println(stdnt.getSurname());
				}
			}
		}
		
	}
	
}
