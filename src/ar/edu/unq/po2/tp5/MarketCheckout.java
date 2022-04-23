package ar.edu.unq.po2.tp5;

import java.util.HashMap;
import java.util.Map;

public class MarketCheckout {

	Map<Product, Integer> stock;
	private double amountToPay;
	
	public MarketCheckout() {
		stock = new HashMap<>();
	}
	public void increaseStock(Product aProduct, int anAmount) {
		if (stock.containsKey(aProduct)) stock.put(aProduct, stockOf(aProduct) + anAmount);
		else stock.put(aProduct, anAmount);
	}
	
	public Integer stockOf(Product aProduct) {
		return stock.get(aProduct);
	}
	public void register(Product aProduct) throws Exception {
		if (!stock.containsKey(aProduct)) throw new Exception("There is no stock for the requested product");
		decreaseStock(aProduct, 1);
		amountToPay += aProduct.priceFor(this);
	}
	private void decreaseStock(Product aProduct, int anAmount) {
		stock.put(aProduct, stockOf(aProduct) - anAmount);
	}
	public double totalAmount() {
		return amountToPay;
	}
	public double priceApplyingDiscountOn(double price) {
		return price - price * 10 / 100;
	}

}
