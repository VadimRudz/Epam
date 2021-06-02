package javaClasses_MainTask;

public class House {
	
	private int id;
	
	private int apartmentNumber;
	
	private double area;
	
	private int floor;
	
	private int numberRooms;
	
	private String street;
	
	private String buildingType;
	
	private int lifetime;

	public House (){
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		
		if (0 <= id && id<= 1000) {
	    	
	        this.id = id;}
	    	
	    	else {
	    		System.out.println("�� ����� �������� id. id ������ ���� � �������� [0 �� 1000]");
	    	}
	}

	public int getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(int apartmentNumber) {
		if (1 <= id && id<= 1000) {
	    	
			this.apartmentNumber = apartmentNumber;}
	    	
	    	else {
	    		System.out.println("�� ����� �������� ����� ��������. ����� ������ ���� � �������� [1 �� 49]");
	    	}
		
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		
		if (0.1 <= id && id<= 320) {
	    	
			this.area = area;}
	    	
	    	else {
	    		System.out.println("�� ����� �������� ������� ��������. ������� ������ ���� � �������� [0.1 �� 320]");
	    	}
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		
		if (1 <= id && id<= 7) {
	    	
			this.floor = floor;}
	    	
	    	else {
	    		System.out.println("�� ����� �������� ���� ����. ����� ������ ���� � �������� [1 �� 7]");
	    	}
		
	}

	public int getNumberRooms() {
		return numberRooms;
	}

	public void setNumberRooms(int numberRooms) {
		
		if (1 <= id && id<= 5) {
	    	
			this.numberRooms = numberRooms;}
	    	
	    	else {
	    		System.out.println("�� ����� �������� ���������� ������. ���������� ������ ���� � �������� [1 �� 5]");
	    	}

	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		
		if (street != null && !street.isEmpty()) {
            for (char c : street.toCharArray()) {
                if (Character.isDigit(c)) {
                	System.out.println("� �������� ����� ����� ������������ ������� (�����)"); break; 
                }
            }
        }
    	else {this.street = street;}
	}

	public String getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(String buildingType) {
		
		if (buildingType != null && !buildingType.isEmpty()) {
            for (char c : buildingType.toCharArray()) {
                if (Character.isDigit(c)) {
                	System.out.println("� �������� ���� ������ � ���������� ������������ ������� (�����)"); break; 
                }
            }
        }
    	else {this.buildingType = buildingType;}
	}

	public int getLifetime() {
		return lifetime;
	}

	public void setLifetime(int lifetime) {
		
		if (1 <= id && id<= 100) {
	    	
			this.lifetime = lifetime;}
	    	
	    	else {
	    		System.out.println("�� ����� �������� ���������� ��� ������������. ���������� ������ ���� � ��������[1 �� 5]");
	    	}

	}

	@Override
	public String toString() {
		return "House [id=" + id + ", apartmentNumber=" + apartmentNumber + ", area=" + area + ", floor=" + floor
				+ ", numberRooms=" + numberRooms + ", street=" + street + ", buildingType=" + buildingType
				+ ", lifetime=" + lifetime + "]";
	}
	
}
