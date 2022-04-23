package ar.edu.unq.po2.tp4;

public class Product {
	
	private boolean isFromFreezingPricesProgram;
	private double price;
	private String name;

	protected Product(String productName, double price, boolean isFromFreezingPricesProgram) {
		name = productName;
		this.price = price;
		this.isFromFreezingPricesProgram = isFromFreezingPricesProgram;
	}

	public static Product createUnderFreezingPricesProgram(String productName, double price) {
		return new Product(productName, price, true);
	}
	
	public static Product create(String productName, double price) {
		return new Product(productName, price, false);
	}
	
	public double price() {
		return price;
	}
	
	public boolean isFromFreezingPricesProgram() {
		return isFromFreezingPricesProgram;
	}
	
	public String name() {
		return name;
	}

	public void increasePrice(double amountToIncreasePrice) {
		price += amountToIncreasePrice;
	}

}
