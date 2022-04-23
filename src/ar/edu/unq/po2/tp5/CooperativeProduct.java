package ar.edu.unq.po2.tp5;

public class CooperativeProduct extends Product {

	public CooperativeProduct(String name, double price) {
		super(name, price);
	}
	
	public double priceFor(MarketCheckout aMarketCheckout) {
		return aMarketCheckout.priceApplyingDiscountOn(super.price());
	}
}
