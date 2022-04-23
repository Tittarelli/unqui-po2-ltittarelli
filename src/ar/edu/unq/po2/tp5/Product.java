package ar.edu.unq.po2.tp5;

public class Product {

	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double price() {
		return price;
	}

	public double priceFor(MarketCheckout marketCheckout) {
		return price;
	}
}
