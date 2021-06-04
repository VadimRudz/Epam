package javaClasses_MainTask;

public class MainTask_Main {

	public static void main(String[] args) {
		
		Student stdnt = new Student();
		stdnt.arrayObjects();
		stdnt.listFacultyStudents(stdnt.sampleStudent);
		stdnt.listStudentsFacultyAndCourse(stdnt.sampleStudent);
		stdnt.ListDateSort(stdnt.sampleStudent);
		stdnt.ListGroupSort(stdnt.sampleStudent);
    	
		/*Customer cstmr = new Customer();
		cstmr.arrayObjects();
		
		Patient ptnt = new Patient();
		ptnt.arrayObjects();
		
		Abiturient abtrnt = new Abiturient();
		abtrnt.arrayObjects();
	
		Book book = new Book();
		book.arrayBooks();
		
		House house = new House();
		house.arrayHouses();*/
	}

}
