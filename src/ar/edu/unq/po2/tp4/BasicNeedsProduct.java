package ar.edu.unq.po2.tp4;

public class BasicNeedsProduct extends Product {
	
	private BasicNeedsProduct(String productName, double price, boolean isFromFreezingPricesProgram) {
		super(productName, price, isFromFreezingPricesProgram);
	}
	
	public static Product createUnderFreezingPricesProgram(String productName, double price) {
		return new BasicNeedsProduct(productName, price, true);
	}
	
	public static Product create(String productName, double price) {
		return new BasicNeedsProduct(productName, price, false);
	}
	
	@Override
	public double price() {
		return super.price() * 0.9;
	}
}
