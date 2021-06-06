package javaClasses_MainTask;

public class MainTask_Main {

	public static void main(String[] args) {
		
		Student stdnt = new Student();
		stdnt.arrayObjects();
		stdnt.listFacultyStudents(stdnt.sampleStudent, "Транспортных коммуникаций");
		System.out.println("-----");
		stdnt.listStudentsFacultyAndCourse(stdnt.sampleStudent);
		System.out.println("-----");
		stdnt.ListDateSort(stdnt.sampleStudent, 1990);
		System.out.println("-----");
		stdnt.ListGroupSort(stdnt.sampleStudent);
		System.out.println("---------------------------------------------------------------------------------------------");
    	
		Customer cstmr = new Customer();
		cstmr.arrayObjects();
		cstmr.alphabetOrder(cstmr.sampleCustomer);
		cstmr.creditCarInterval(cstmr.sampleCustomer,13000,15000);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		Patient ptnt = new Patient();
		ptnt.arrayObjects();
		ptnt.sortDiagnosis(ptnt.samplePatient, "стресс");
		System.out.println("-----");
		ptnt.medicalCardNumberInterval(ptnt.samplePatient,1500,1650);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		Abiturient abtrnt = new Abiturient();
		abtrnt.arrayObjects();
		abtrnt.badMarks(abtrnt.sampleAbiturient, 4);
		System.out.println("-----");
		abtrnt.goodMarks(abtrnt.sampleAbiturient, 6);
		System.out.println("-----");
		abtrnt.chooseBestAbiturients(abtrnt.sampleAbiturient, 3);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		/*Book book = new Book();
		book.arrayBooks();
		
		House house = new House();
		house.arrayHouses();*/
	}

}
