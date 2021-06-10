package javaClasses_MainTask;

import java.time.LocalTime;

public class Train {
	
	private String destination;
	private int trainNumber;
	private LocalTime dispatchTime;
	private int common�arriage;
	private int number�ompartmentSeat;
	private int numberReservedSeat;
	private int numberLuxSeat;
	
	Train [] sampleTrains = new Train[10];
	
	public Train(){
	}
	
	public Train(String destination, int trainNumber, LocalTime dispatchTime, int common�arriage,
			int number�ompartmentSeat, int numberReservedSeat, int numberLuxSeat) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.dispatchTime = dispatchTime;
		this.common�arriage = common�arriage;
		this.number�ompartmentSeat = number�ompartmentSeat;
		this.numberReservedSeat = numberReservedSeat;
		this.numberLuxSeat = numberLuxSeat;
	}

	public Train(String destination, int trainNumber, LocalTime dispatchTime) {
		this(destination, trainNumber, dispatchTime, 80, 60, 100, 40);
	}

	public Train(String destination, int trainNumber, LocalTime dispatchTime, int common�arriage) {
		this(destination, trainNumber, dispatchTime, common�arriage, 60, 100, 40);
	}

	public String getDestination() {
		
		return destination;
	}
	
	public void setDestination(String destination) {
		if (destination != null && !destination.isEmpty()) {
	        for (char c : destination.toCharArray()) {
	            if (Character.isDigit(c)) {
	            	System.out.println("� �������� ������ ���������� ������������ ������� (�����)"); break; 
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
	    		System.out.println("�� ����� �������� ����� ������. ����� ������ ���� � �������� [100 �� 1000]");
	    	}
	}
	
	public LocalTime getDispatchTime() {
		return dispatchTime;
	}
	
	public void setDispatchTime(int hour, int minute) {
		this.dispatchTime.of(hour, minute);
	}
	
	public int getCommon�arriage() {
		return common�arriage;
	}
	
	public void setCommon�arriage(int common�arriage) {
		if (0 <= common�arriage && common�arriage<= 80) {
			this.common�arriage = common�arriage;}
	    	else {
	    		System.out.println("�� ����� �������� ���������� ���� � ����� ������. ���������� ������ ���� � �������� [0 �� 80]");
	    	}	
	}
	
	public int getNumber�ompartmentSeat() {
		return number�ompartmentSeat;
	}
	
	public void setNumber�ompartmentSeat(int number�ompartmentSeat) {
		if (0 <= number�ompartmentSeat && number�ompartmentSeat<= 60) {
			this.number�ompartmentSeat = number�ompartmentSeat;}
	    	else {
	    		System.out.println("�� ����� �������� ���������� ���� � ������-����. ���������� ������ ���� � �������� [0 �� 60]");
	    	}
	}
	
	public int getNumberReservedSeat() {
		return numberReservedSeat;
	}
	
	public void setNumberReservedSeat(int numberReservedSeat) {
		if (0 <= numberReservedSeat && numberReservedSeat<= 100) {
			this.numberReservedSeat = numberReservedSeat;}
	    	else {
	    		System.out.println("�� ����� �������� ���������� ���� � ������-���������. ���������� ������ ���� � �������� [0 �� 100]");
	    	}
	}
	
	public int getNumberLuxSeat() {
		return numberLuxSeat;
	}
	
	public void setNumberLuxSeat(int numberLuxSeat) {
		if (0 <= numberLuxSeat && numberLuxSeat<= 40) {
			this.numberReservedSeat = numberLuxSeat;}
	    	else {
	    		System.out.println("�� ����� �������� ���������� ���� � ������ ������ ����. ���������� ������ ���� � �������� [0 �� 40]");
	    	}
	}
	
	@Override
	public String toString() {
		return "Train [Destination=" + destination + ", trainNumber=" + trainNumber + ", dispatchTime=" + dispatchTime
				+ ", common�arriage=" + common�arriage + ", number�ompartmentSeat=" + number�ompartmentSeat
				+ ", numberReservedSeat=" + numberReservedSeat + ", numberLuxSeat=" + numberLuxSeat + "]";
	}
	
	public void arrayTrains() { 
		sampleTrains [0]  = new Train ("������", 101, LocalTime.of(10,22), 35);
		sampleTrains [1]  = new Train ("�����", 100, LocalTime.of(15,45), 18);
		sampleTrains [2]  = new Train ("�����", 102, LocalTime.of(9,20), 46);
		sampleTrains [3]  = new Train ("���������", 105, LocalTime.of(22,22), 20);
		sampleTrains [4]  = new Train ("������", 108, LocalTime.of(23,45), 59);
		sampleTrains [5]  = new Train ("�������", 103, LocalTime.of(1,05), 16);
		sampleTrains [6]  = new Train ("�������", 104, LocalTime.of(3,15), 13);
		sampleTrains [7]  = new Train ("������", 106, LocalTime.of(5,45), 26);
		sampleTrains [8]  = new Train ("���������", 109, LocalTime.of(7,18), 11);
		sampleTrains [9]  = new Train ("����������", 107, LocalTime.of(17,03), 24);
	}
}
