package ar.edu.unq.po2.tp5;

public class Product implements Chargeable{

	private String name;
	private double price;
	private int stock;

	public Product(String name, double price, int stock) throws Exception {
		if (stock < 0) throw new Exception("The stock cannot be negative");
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	@Override
	public void register() throws Exception {
		if (stock == 0) throw new Exception("There is no stock of " + name);
		stock--;
	}

	@Override
	public double amount() {
		return price;
	}
}
