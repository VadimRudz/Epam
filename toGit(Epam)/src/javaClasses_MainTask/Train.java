package javaClasses_MainTask;

import java.time.LocalTime;

public class Train {
	
	private String destination;
	private int trainNumber;
	private LocalTime dispatchTime;
	private int numberСarriageSeat;
	private int numberСompartmentSeat;
	private int numberReservedSeat;
	private int numberLuxSeat;
	
	Train [] sampleTrains = new Train[10];
	
	public Train(){
	}
	
	public Train(String destination, int trainNumber, LocalTime dispatchTime, int commonСarriage,
			int numberСompartmentSeat, int numberReservedSeat, int numberLuxSeat) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.dispatchTime = dispatchTime;
		this.numberСarriageSeat = commonСarriage;
		this.numberСompartmentSeat = numberСompartmentSeat;
		this.numberReservedSeat = numberReservedSeat;
		this.numberLuxSeat = numberLuxSeat;
	}

	public Train(String destination, int trainNumber, LocalTime dispatchTime) {
		this(destination, trainNumber, dispatchTime, 80, 60, 100, 40);
	}

	public Train(String destination, int trainNumber, LocalTime dispatchTime, int commonСarriage) {
		this(destination, trainNumber, dispatchTime, commonСarriage, 60, 100, 40);
	}

	@Override
	public String toString() {
		return "Train [Destination=" + destination + ", trainNumber=" + trainNumber + ", dispatchTime=" + dispatchTime
				+ ", numberСarriageSeat=" + numberСarriageSeat + ", numberСompartmentSeat=" + numberСompartmentSeat
				+ ", numberReservedSeat=" + numberReservedSeat + ", numberLuxSeat=" + numberLuxSeat + "]";
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		if (destination != null && !destination.isEmpty()) {
	        for (char c : destination.toCharArray()) {
	            if (Character.isDigit(c)) {
	            	System.out.println("В названии пункта назначения недопустимые символы (цифры)"); break; 
	            }
	        }
	    }
		else {this.destination = destination;}
	}
	
	public int getTrainNumber() {
		return trainNumber;
	}
	
	public void setTrainNumber(int trainNumber) {
		if (100 <= trainNumber && trainNumber<= 1000) {
			this.trainNumber = trainNumber;}
	    	else {
	    		System.out.println("Вы ввели неверный номер поезда. "
	    				+ "Номер должен быть в пределах [100 до 1000]");
	    	}
	}
	
	public LocalTime getDispatchTime() {
		return dispatchTime;
	}
	
	public void setDispatchTime(int hour, int minute) {
		LocalTime.of(hour, minute);
	}
	
	public int getNumberСarriageSeat() {
		return numberСarriageSeat;
	}
	
	public void setNumberСarriageSeat(int commonСarriage) {
		if (0 <= commonСarriage && commonСarriage<= 80) {
			this.numberСarriageSeat = commonСarriage;}
	    	else {
	    		System.out.println("Вы ввели неверное количество мест в общем вагоне. "
	    				+ "Количество должно быть в пределах [0 до 80]");
	    	}	
	}
	
	public int getNumberСompartmentSeat() {
		return numberСompartmentSeat;
	}
	
	public void setNumberСompartmentSeat(int numberСompartmentSeat) {
		if (0 <= numberСompartmentSeat && numberСompartmentSeat<= 60) {
			this.numberСompartmentSeat = numberСompartmentSeat;}
	    	else {
	    		System.out.println("Вы ввели неверное количество мест в вагоне-купе. "
	    				+ "Количество должно быть в пределах [0 до 60]");
	    	}
	}
	
	public int getNumberReservedSeat() {
		return numberReservedSeat;
	}
	
	public void setNumberReservedSeat(int numberReservedSeat) {
		if (0 <= numberReservedSeat && numberReservedSeat<= 100) {
			this.numberReservedSeat = numberReservedSeat;}
	    	else {
	    		System.out.println("Вы ввели неверное количество мест в вагоне-плацкарте. "
	    				+ "Количество должно быть в пределах [0 до 100]");
	    	}
	}
	
	public int getNumberLuxSeat() {
		return numberLuxSeat;
	}
	
	public void setNumberLuxSeat(int numberLuxSeat) {
		if (0 <= numberLuxSeat && numberLuxSeat<= 40) {
			this.numberReservedSeat = numberLuxSeat;}
	    	else {
	    		System.out.println("Вы ввели неверное количество мест в вагоне класса люкс. "
	    				+ "Количество должно быть в пределах [0 до 40]");
	    	}
	}
	
	public void arrayTrains() { 
		sampleTrains [0]  = new Train ("Береза", 101, LocalTime.of(10,22), 35);
		sampleTrains [1]  = new Train ("Брест", 100, LocalTime.of(15,45), 18);
		sampleTrains [2]  = new Train ("Пинск", 102, LocalTime.of(9,20), 46);
		sampleTrains [3]  = new Train ("Ивацевичи", 105, LocalTime.of(22,22), 20);
		sampleTrains [4]  = new Train ("Кобрин", 108, LocalTime.of(23,45), 59);
		sampleTrains [5]  = new Train ("Пружаны", 103, LocalTime.of(1,05), 16);
		sampleTrains [6]  = new Train ("Жабинка", 104, LocalTime.of(3,15), 13);
		sampleTrains [7]  = new Train ("Ружаны", 106, LocalTime.of(5,45), 26);
		sampleTrains [8]  = new Train ("Ганцевичи", 109, LocalTime.of(7,18), 11);
		sampleTrains [9]  = new Train ("Барановичи", 107, LocalTime.of(17,03), 24);
	}
	
	public void outputTrainsByDestination(Train [] sampleTrains, String destination) {
		System.out.println("Номера поездов, которые едут до " + destination + ":");
		for (Train train : sampleTrains) {
			if (train.getDestination().equals(destination)){
				System.out.print(train.getTrainNumber() + "(пункт назначения - " + train.getDestination() + ")" + ", ");
			}
		}
		System.out.println();
	}
	
	public void outputTrainsByDispatchTime(Train [] sampleTrains, LocalTime dispatchTime) {
		System.out.println("Номера поездов, которые отправляются после " + dispatchTime.toString() +  ":");
		for (Train train : sampleTrains) {
			if((train.dispatchTime.getHour()==dispatchTime.getHour() && train.dispatchTime.getMinute() > dispatchTime.getMinute())
					|| train.dispatchTime.getHour()>dispatchTime.getHour()){
				System.out.print(train.getTrainNumber() + "(время отправления-" + train.dispatchTime.toString() + "), ");
			}
		}
		System.out.println();
	}

	public void outputTrainsBySeatsInCommonCarriage(Train [] sampleTrains, int seats) {
		System.out.println("Номера поездов, у которых число свободных мест в общем вагоне >= " + seats +  ":");
		for (Train train : sampleTrains) {
			if(train.getNumberСarriageSeat()>=seats){
				System.out.print(train.getTrainNumber() + "(число мест в общем вагоне - " + train.getNumberСarriageSeat() + "), ");
			}
		}
		System.out.println();
	}
}
