package javaClasses_MainTask;


public class Car {
	private int id;
	private String brand;
	private String carModel;
	private int yearIssue;
	private String color;
	private double price;
	private String registrationNumber;
	
	Car [] sampleCars = new Car[10];
	
	public Car(){
	}
	
	public Car(String brand, String carModel, int yearIssue, String color, double price) {
		this(0, brand, carModel, yearIssue, color, price, null);
	}

	public Car(int id, String brand, String carModel, int yearIssue, double price) {
		this(id, brand, carModel, yearIssue, null, price, null);
	}

	public Car(int id, String brand, String carModel, int yearIssue, String color, double price,
			String registrationNumber) {
		this.id = id;
		this.brand = brand;
		this.carModel = carModel;
		this.yearIssue = yearIssue;
		this.color = color;
		this.price = price;
		this.registrationNumber = registrationNumber;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", carModel=" + carModel + ", yearIssue=" + yearIssue + ", color="
				+ color + ", price=" + price + ", registrationNumber=" + registrationNumber + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		if ((brand != null) && (!brand.isEmpty())) {
	        for (char c : brand.toCharArray()) {
	            if (Character.isDigit(c)) {
	            	System.out.println("В названии марки автомобиля недопустимые символы (цифры)"); break; 
	            }
	        }
	    }
		else {this.brand = brand;}
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getYearIssue() {
		return yearIssue;
	}
	public void setYearIssue(int yearIssue) {
		if (1886 <= yearIssue && yearIssue<= 2021) {
			this.yearIssue = yearIssue;}
	    	else {
	    		System.out.println("Вы ввели неверный год выпуска автомобиля. Год должен быть в пределах [1886 до 2021]");
	    	}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if ((color != null) && (!color.isEmpty())) {
	        for (char c : color.toCharArray()) {
	            if (Character.isDigit(c)) {
	            	System.out.println("В названии цвета автомобиля недопустимые символы (цифры)"); break; 
	            }
	        }
	    }
		else {this.color = color;}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if ((0<= yearIssue) && (yearIssue<= 100_000_000)) {
			this.price = price;}
	    	else {
	    		System.out.println("Вы ввели неверную стоимость автомобиля. Стоимость должна быть в пределах [0 до 100_000_000]");
	    	}
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		if((registrationNumber.length()<9) || (registrationNumber.length()>9)) {
			System.out.println("Введите регистрационный номер машины в формате \"1111 AA-1\"");
		}
		else {this.registrationNumber = registrationNumber;}
	}
	
	public void arrayCars() { 
		sampleCars [0]  = new Car (15, "Ford", "Focus", 2006, 8150);
		sampleCars [1]  = new Car (23, "Renault", "Laguna", 1998, 3600);
		sampleCars [2]  = new Car (47, "Volkswagen", "Passat", 2015, 14250);
		sampleCars [3]  = new Car (28, "Peugeot", "3008", 2002, 4600);
		sampleCars [4]  = new Car (37, "Volkswagen", "Jetta", 2015, 15400);
		sampleCars [5]  = new Car (115, "Citroen", "Xantia", 2000, 3500);
		sampleCars [6]  = new Car (228,"Renault", "Clio", 2004, 4000);
		sampleCars [7]  = new Car (399, "Toyota", "Camry", 2008, 9500);
		sampleCars [8]  = new Car (500, "Volkswagen", "Bora", 2000, 4800);
		sampleCars [9]  = new Car (17, "Lada", "Niva", 2018, 12000);
	}

	public void sortByBrand(Car [] sampleCars, String brand) {
		System.out.println("Список моделей(марка - " + brand + ") :");
		for (Car car : sampleCars) {
			if(car.getBrand().equals(brand)){
				System.out.print(car.getCarModel() + ", ");
			}
		}
		System.out.println();
	}
	
	public void sortByModelAndYear(Car [] sampleCars, String model, int year) {
		System.out.println("Id автомобилей, у которых модель " + model + " и которые эксплуатируются более " + year + " лет:");
		for (Car car : sampleCars) {
			if((car.getCarModel().equals(model)) && ((2021- car.yearIssue) <= year)) {
				System.out.print(car.getId() + ", ");
			}
		}
		System.out.println();
	}
	
	public void sortByYearAndPrice(Car [] sampleCars, int year, double price) {
		System.out.println("Марка и модель автомобиля, у которого год выпуска " + year + " и стоимость больше " + price + "$:");
		for (Car car : sampleCars) {
			if((car.getYearIssue()==year) && (car.getPrice()>price)){
				System.out.print(car.getBrand() + " " + car.getCarModel() +  ", ");
			}
		}
		System.out.println();
	}
}
