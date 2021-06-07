package javaClasses_MainTask;

public class Book {

	private int id;
	private String titleBook;
	private String author;
	private String publisher;
	private int yearPublishing;
	private int numberPages;
	private double price;
	private String bindingType;
	Book [] sampleBooks = new Book [5];

	public Book () {	
	}
	
	public Book (int id, String titleBook, String author, String publisher, int yearPublishing, int numberPages, double price, String bindingType){
		this.id = id;
		this.titleBook = titleBook;
		this.author = author;
		this.publisher = publisher;
		this.yearPublishing = yearPublishing;
		this.numberPages = numberPages;
		this.price = price;
		this.bindingType = bindingType;	
	}
	
	public Book (String titleBook, String author, double price) {
		this(0, titleBook, author, null, 0, 0, price, null);
		}
	
	public Book (String titleBook, String author, String publisher, int yearPublishing) {
		this(0, titleBook, author, publisher, yearPublishing, 0, 0, null);
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

	public String getTitleBook() {
		return titleBook;
	}

	public void setTitleBook(String titleBook) {
		if (titleBook != null && !titleBook.isEmpty()) {
            for (char c : titleBook.toCharArray()) {
                if (Character.isDigit(c)) {
                	System.out.println("� ����� ������� ������������ ������� (�����)"); break; 
                }
            }
        }
    	else {this.titleBook = titleBook;}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		if (author != null && !author.isEmpty()) {
            for (char c : titleBook.toCharArray()) {
                if (Character.isDigit(c)) {
                	System.out.println("� ������� ������ ������������ ������� (�����)"); break; 
                	}
                }
            }
            else {this.author = author;}
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		if (publisher != null && !publisher.isEmpty()) {
            for (char c : titleBook.toCharArray()) {
                if (Character.isDigit(c)) {
                	System.out.println("� �������� ������������ ������������ ������� (�����)"); break; 
                	}
                }
            }
            else {this.publisher = publisher;}
	}

	public int getYearPublishing() {
		return yearPublishing;
	}

	public void setYearPublishing(int yearPublishing) {
		if (1564 <= yearPublishing && yearPublishing<= 2021) {
	    	this.yearPublishing = yearPublishing;}
	    	else {
	    		System.out.println("�� ����� �������� ��� ���������� �����. ��� ������ ���� � �������� [1564 �� 2021]");
	    	}
	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int numberPages) {
		if (4 <= numberPages && numberPages<= 500) {
	    	this.numberPages = numberPages;}
	    	else {
	    		System.out.println("�� ����� �������� ���������� �������. ���������� ������ ���� � �������� [4 �� 500]");
	    	}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (0 <= numberPages && numberPages<= 30_800_000) {
	    	this.price = price;}
	    	else {
	    		System.out.println("�� ����� �������� ��������� �����. ��������� ������ ���� � �������� [0 �� 30_800_000 $]");
	    	}
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		if (bindingType != null && !bindingType.isEmpty()) {
            for (char c : bindingType.toCharArray()) {
                if (Character.isDigit(c)) {
                	System.out.println("� �������� ��������� ������������ ������� (�����)"); break; 
                	}
                }
            }
            else {this.bindingType = bindingType;}
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", titleBook=" + titleBook + ", author=" + author + ", publisher=" + publisher
				+ ", yearPublishing=" + yearPublishing + ", numberPages=" + numberPages + ", price=" + price
				+ ", bindingType=" + bindingType + "]";
	}
	
	public void arrayBooks() {
		sampleBooks [0] = new Book("������� ����. �� ���������� � ������������", "���������� ��������� ����", "������ �����", 2004);
		sampleBooks [1] = new Book("���� ��������", "�.�.�������","����, ������ � ������", 1873);
		sampleBooks [2] = new Book("��", "������� �������", "������ �����", 1974);
		sampleBooks [3] = new Book("1984", "������ ������", "Past simple", 1949);
		sampleBooks [4] = new Book("������� ����", "������ ������", "Past simple", 1945);
	}	
	//String titleBook, String author, String publisher, int yearPublishing
	public void sortByAuthor(Book [] sampleBooks, String author){
		System.out.println("������ ���� ������(" + author + "):");
		for (Book book : sampleBooks) {
			if(book.getAuthor().equalsIgnoreCase(author)){
				System.out.print(book.getTitleBook() + ", ");
			}
		}
		System.out.println();
	}
	
	public void sortByPublisher(Book [] sampleBooks, String publisher){
		System.out.println("������ ���� ������������(" + publisher + "):");
		for(Book book : sampleBooks){
			if(book.getPublisher().equalsIgnoreCase(publisher)){
				System.out.print(book.getTitleBook() + ", ");
			}
		}
		System.out.println();
	}
	
	public void sortByYear(Book [] sampleBooks, int year){
		System.out.println("������ ����, �������� ����� " + year + " ����:");
		for(Book book : sampleBooks){ 
			if(book.getYearPublishing()>=year){
				System.out.print("\"" + book.getTitleBook() + "\", ");
			}
		}
		System.out.println();
	}
	
}
