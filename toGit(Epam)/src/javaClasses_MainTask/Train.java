package javaClasses_MainTask;

import java.time.LocalTime;

public class Train {
	
	private String destination;
	private int trainNumber;
	private LocalTime dispatchTime;
	private int commonÑarriage;
	private int numberÑompartmentSeat;
	private int numberReservedSeat;
	private int numberLuxSeat;
	
	Train [] sampleTrains = new Train[10];
	
	public Train(){
	}
	
	public Train(String destination, int trainNumber, LocalTime dispatchTime, int commonÑarriage,
			int numberÑompartmentSeat, int numberReservedSeat, int numberLuxSeat) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.dispatchTime = dispatchTime;
		this.commonÑarriage = commonÑarriage;
		this.numberÑompartmentSeat = numberÑompartmentSeat;
		this.numberReservedSeat = numberReservedSeat;
		this.numberLuxSeat = numberLuxSeat;
	}

	public Train(String destination, int trainNumber, LocalTime dispatchTime) {
		this(destination, trainNumber, dispatchTime, 80, 60, 100, 40);
	}

	public Train(String destination, int trainNumber, LocalTime dispatchTime, int commonÑarriage) {
		this(destination, trainNumber, dispatchTime, commonÑarriage, 60, 100, 40);
	}

	public String getDestination() {
		
		return destination;
	}
	
	public void setDestination(String destination) {
		if (destination != null && !destination.isEmpty()) {
	        for (char c : destination.toCharArray()) {
	            if (Character.isDigit(c)) {
	            	System.out.println("Â íàçâàíèè ïóíêòà íàçíà÷åíèÿ íåäîïóñòèìûå ñèìâîëû (öèôğû)"); break; 
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
	    		System.out.println("Âû ââåëè íåâåğíûé íîìåğ ïîåçäà. Íîìåğ äîëæåí áûòü â ïğåäåëàõ [100 äî 1000]");
	    	}
	}
	
	public LocalTime getDispatchTime() {
		return dispatchTime;
	}
	
	public void setDispatchTime(int hour, int minute) {
		this.dispatchTime.of(hour, minute);
	}
	
	public int getCommonÑarriage() {
		return commonÑarriage;
	}
	
	public void setCommonÑarriage(int commonÑarriage) {
		if (0 <= commonÑarriage && commonÑarriage<= 80) {
			this.commonÑarriage = commonÑarriage;}
	    	else {
	    		System.out.println("Âû ââåëè íåâåğíîå êîëè÷åñòâî ìåñò â îáùåì âàãîíå. Êîëè÷åñòâî äîëæíî áûòü â ïğåäåëàõ [0 äî 80]");
	    	}	
	}
	
	public int getNumberÑompartmentSeat() {
		return numberÑompartmentSeat;
	}
	
	public void setNumberÑompartmentSeat(int numberÑompartmentSeat) {
		if (0 <= numberÑompartmentSeat && numberÑompartmentSeat<= 60) {
			this.numberÑompartmentSeat = numberÑompartmentSeat;}
	    	else {
	    		System.out.println("Âû ââåëè íåâåğíîå êîëè÷åñòâî ìåñò â âàãîíå-êóïå. Êîëè÷åñòâî äîëæíî áûòü â ïğåäåëàõ [0 äî 60]");
	    	}
	}
	
	public int getNumberReservedSeat() {
		return numberReservedSeat;
	}
	
	public void setNumberReservedSeat(int numberReservedSeat) {
		if (0 <= numberReservedSeat && numberReservedSeat<= 100) {
			this.numberReservedSeat = numberReservedSeat;}
	    	else {
	    		System.out.println("Âû ââåëè íåâåğíîå êîëè÷åñòâî ìåñò â âàãîíå-ïëàöêàğòå. Êîëè÷åñòâî äîëæíî áûòü â ïğåäåëàõ [0 äî 100]");
	    	}
	}
	
	public int getNumberLuxSeat() {
		return numberLuxSeat;
	}
	
	public void setNumberLuxSeat(int numberLuxSeat) {
		if (0 <= numberLuxSeat && numberLuxSeat<= 40) {
			this.numberReservedSeat = numberLuxSeat;}
	    	else {
	    		System.out.println("Âû ââåëè íåâåğíîå êîëè÷åñòâî ìåñò â âàãîíå êëàññà ëşêñ. Êîëè÷åñòâî äîëæíî áûòü â ïğåäåëàõ [0 äî 40]");
	    	}
	}
	
	@Override
	public String toString() {
		return "Train [Destination=" + destination + ", trainNumber=" + trainNumber + ", dispatchTime=" + dispatchTime
				+ ", commonÑarriage=" + commonÑarriage + ", numberÑompartmentSeat=" + numberÑompartmentSeat
				+ ", numberReservedSeat=" + numberReservedSeat + ", numberLuxSeat=" + numberLuxSeat + "]";
	}
	
	public void arrayTrains() { 
		sampleTrains [0]  = new Train ("Áåğåçà", 101, LocalTime.of(10,22), 35);
		sampleTrains [1]  = new Train ("Áğåñò", 100, LocalTime.of(15,45), 18);
		sampleTrains [2]  = new Train ("Ïèíñê", 102, LocalTime.of(9,20), 46);
		sampleTrains [3]  = new Train ("Èâàöåâè÷è", 105, LocalTime.of(22,22), 20);
		sampleTrains [4]  = new Train ("Êîáğèí", 108, LocalTime.of(23,45), 59);
		sampleTrains [5]  = new Train ("Ïğóæàíû", 103, LocalTime.of(1,05), 16);
		sampleTrains [6]  = new Train ("Æàáèíêà", 104, LocalTime.of(3,15), 13);
		sampleTrains [7]  = new Train ("Ğóæàíû", 106, LocalTime.of(5,45), 26);
		sampleTrains [8]  = new Train ("Ãàíöåâè÷è", 109, LocalTime.of(7,18), 11);
		sampleTrains [9]  = new Train ("Áàğàíîâè÷è", 107, LocalTime.of(17,03), 24);
	}
}
