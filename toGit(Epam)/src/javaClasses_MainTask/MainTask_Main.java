package javaClasses_MainTask;

import java.time.LocalTime;

public class MainTask_Main {

	public static void main(String[] args) {
		
		Student stdnt = new Student();
		stdnt.arrayObjects();
		stdnt.outputStudentsSortedByFaculty(stdnt.sampleStudent, "Транспортных коммуникаций");
		System.out.println("-----");
		stdnt.outputStudentsSortedByFacultyAndCourse(stdnt.sampleStudent);
		System.out.println("-----");
		stdnt.outputStudentsSortedByDateOfBirth(stdnt.sampleStudent, 1990);
		System.out.println("-----");
		stdnt.outputStudentsSortedByGroup(stdnt.sampleStudent);
		System.out.println("---------------------------------------------------------------------------------------------");
    	
		Customer cstmr = new Customer();
		cstmr.arrayObjects();
		cstmr.outputCustomersSortedByAlphabetOrder(cstmr.sampleCustomer);
		cstmr.outputCustomersSortedByCreditCarInterval(cstmr.sampleCustomer,13000,15000);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		Patient ptnt = new Patient();
		ptnt.arrayObjects();
		ptnt.outputPatientsSortedByDiagnosis(ptnt.samplePatient, "стресс");
		System.out.println("-----");
		ptnt.outputPatientsSortedByMedicalCardNumberInterval(ptnt.samplePatient,1500,1650);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		Abiturient abtrnt = new Abiturient();
		abtrnt.createArrayObjects();
		abtrnt.outputAbiturientsWithBadGrades(abtrnt.sampleAbiturient, 4);
		System.out.println("-----");
		abtrnt.outputAbiturientsWithGoodGrades(abtrnt.sampleAbiturient, 6);
		System.out.println("-----");
		abtrnt.outputAbiturientsWhithBestAverage(abtrnt.sampleAbiturient, 3);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		Book book = new Book();
		book.createArrayBooks();
		book.outputBooksSortedByAuthor(book.sampleBooks,"Джордж Оруэлл");
		System.out.println("-----");
		book.outputBooksSortedByPublisher(book.sampleBooks,"Past simple");
		System.out.println("-----");
		book.outputBooksSortedByYear(book.sampleBooks, 1945);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		House house = new House();
		house.arrayHouses();
		house.outputHousesSortedByNumberApartments(house.sampleHouses, 3);
		System.out.println("-----");
		house.outputHousesSortedByNumberApartmentsAndNumberFloor(house.sampleHouses, 2, 1, 3);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		Phone phone = new Phone();
		phone.arrayPhones();
		phone.outputPhonesSortedByTimeCity(phone.sampleSubscriber, 10000);
		System.out.println("-----");
		phone.outputPhonesSortedByTimeIntercity(phone.sampleSubscriber);
		System.out.println("-----");
		phone.outputPhonesSortedByAlphabetOrder(phone.arraySurname);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		Car car = new Car();
		car.arrayCars();
		car.outputCarsSortedByBrand(car.sampleCars, "Volkswagen");
		System.out.println("-----");
		car.outputCarssortedByModelAndYear(car.sampleCars, "Niva", 10);
		System.out.println("-----");
		car.outputCarsSortedByYearAndPrice(car.sampleCars, 2006, 5000);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		Product product = new Product();
		product.arrayProducts();
		product.outputProductsSortedByName(product.sampleProducts, "Виноградный сок");
		System.out.println("-----");
		product.outputProductsSortedByNameAndPrice(product.sampleProducts, 15, "Печенье с арахисом", "Апельсин", "Макароны звездочка");
		System.out.println("-----");
		product.outputProductsSortedByShelflifeDays(product.sampleProducts, 20);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		Train train = new Train();
		train.arrayTrains();
		train.outputTrainsByDestination(train.sampleTrains, "Береза");
		System.out.println("-----");
		train.outputTrainsByDispatchTime(train.sampleTrains, LocalTime.of(10, 0)); 
		System.out.println("-----");
		train.outputTrainsBySeatsInCommonCarriage(train.sampleTrains, 40);
		System.out.println("---------------------------------------------------------------------------------------------");
	}

}
