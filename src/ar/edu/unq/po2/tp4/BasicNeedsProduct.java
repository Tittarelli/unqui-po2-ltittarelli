package ar.edu.unq.po2.tp4;

public class BasicNeedsProduct extends Product {
	
	private double discount;

	private BasicNeedsProduct(String productName, double price, boolean isFromFreezingPricesProgram) {
		super(productName, price, isFromFreezingPricesProgram);
	}
	
	private BasicNeedsProduct(String productName, double price, boolean isFromFreezingPricesProgram, double discountToApply) {
		super(productName, price, isFromFreezingPricesProgram);
		discount = discountToApply;
	}
	
	public static Product createUnderFreezingPricesProgramDiscounting(String productName, double price, double discountToApply) {
		return new BasicNeedsProduct(productName, price, true, discountToApply);
	}
	
	public static Product createDiscounting(String productName, double price, double discountToApply) {
		return new BasicNeedsProduct(productName, price, false, discountToApply);
	}
	
	@Override
	public double price() {
		return super.price() - (super.price() / 100) * discount;
	}
}
