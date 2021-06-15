package javaClasses_MainTask;

import java.util.ArrayList;

public class Product {
	private long id;
	private String name;
	private int upc;
	private String brand;
	private double price;
	private int shelflifeDays;
	private double quantity;
	
	Product [] sampleProducts = new Product[15];

	public Product() {
	}

	public Product(long id, String name, int upc, String brand, 
			double price, int shelflifeDays, double quantity) {
		this.id = id;
		this.name = name;
		this.upc = upc;
		this.brand = brand;
		this.price = price;
		this.shelflifeDays = shelflifeDays;
		this.quantity = quantity;
	}

	public Product(long id, String name, double price, int shelflifeDays) {
		this(id, name, 0, null, price, shelflifeDays, 0);
	}

	public Product(long id, String name, String brand, double price, double quantity) {
		this(id, name, 0, brand, price, 0, quantity);
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", upc=" + upc + ", brand=" + brand + ", price=" + price
				+ ", shelflifeDays=" + shelflifeDays + ", quantity=" + quantity + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if(id<0){
			System.out.println("id не может быть меньше 0");
		}
		else {this.id = id;}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUPC() {
		return upc;
	}

	public void setUPC(int upc) {
		if(upc<0){
			System.out.println("upc не может быть меньше 0");
		}
		this.upc = upc;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<0){
			System.out.println("цена не может быть меньше 0");
		}
		else{this.price = price;}
	}

	public int getShelflifeDays() {
		return shelflifeDays;
	}

	public void setShelflifeDays(int shelflifeDays) {
		if(shelflifeDays<0){
			System.out.println("срок годности не может быть меньше 0");
		}
		else{this.shelflifeDays = shelflifeDays;}
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		if(quantity<0){
			System.out.println("количество не может быть меньше 0");
		}
		else{this.quantity = quantity;}
	}
	
	public void arrayProducts() { 
		sampleProducts [0]  = new Product (124568, "Творог", 3.15, 14);
		sampleProducts [1]  = new Product (239745, "Сметана", 3.60, 15);
		sampleProducts [2]  = new Product (987463, "Апельсин", 2.78, 21);
		sampleProducts [3]  = new Product (456871, "Банан", 4.18, 15);
		sampleProducts [4]  = new Product (974662, "Огурец", 5.17, 16);
		sampleProducts [5]  = new Product (971455, "Помидор", 6.89, 16);
		sampleProducts [6]  = new Product (748698, "Яблочный сок", 4.32, 60);
		sampleProducts [7]  = new Product (112365, "Виноградный сок", 4.57, 60);
		sampleProducts [8]  = new Product (336547, "Печенье с арахисом", 8.45, 60);
		sampleProducts [9]  = new Product (447568, "Печенье с манго", 7.99, 65);
		sampleProducts [10]  = new Product (699874, "Мороженное 50 копеек", 1.12, 60);
		sampleProducts [11]  = new Product (634789, "Мороженное Магнат", 2.87, 60);
		sampleProducts [12]  = new Product (974654, "Мороженное Алёнка", 1.57, 60);
		sampleProducts [13]  = new Product (667455, "Макароны звездочка", 4.15, 120);
		sampleProducts [14]  = new Product (674159, "Рис пропаренный", 3.89, 120);
	}
	
	public void outputProductsSortedByName(Product [] sampleProducts, String name) {
		System.out.println("Cписок товаров(id) для наименования товара " + name + ":");
		for (Product product : sampleProducts){
			if(product.name.equals(name)){
				System.out.print(product.getId() + ", ");
			}
		}
		System.out.println();
	}
	
	public void outputProductsSortedByNameAndPrice(Product [] sampleProducts, double price, String... name ) {
		ArrayList <String> array = new ArrayList<String>();
		for (String strings : name){
			array.add(strings);
		}
		System.out.println("Cписок товаров(id) для товаров " + array.toString()  + " и ценой менее " + price + ":" );
		for(Product product : sampleProducts) {
			if((checkNameEquals(product.name, name)) && (product.price<price)){
				System.out.print(product.getId() + ", ");
				}
			}
		System.out.println();
	}
	
	public boolean checkNameEquals(String productName, String...name) {
		for (String strng : name) {
			if (strng.equals(productName)){
				return true;
			}
		}
		return false;
	}
	
	public void outputProductsSortedByShelflifeDays(Product [] sampleProducts, int shelflifeDays) {
		System.out.println("Cписок товаров, срок хранения которых больше " + shelflifeDays + ", дней:");
		for (Product product : sampleProducts) {
			if(product.shelflifeDays>shelflifeDays){
				System.out.println(product.name + ", ");
			}
		}
	}
}
