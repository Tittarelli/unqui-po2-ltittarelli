package ar.edu.unq.po2.tp5;

public class MarketCheckout {

	private double amountToPay;
	
	public MarketCheckout() {
		amountToPay = 0;
	}
	
	public void register(Chargeable aChargeableProduct) throws Exception{
		aChargeableProduct.register();
		amountToPay += aChargeableProduct.amount();
	}

	public double totalAmount() {
		return amountToPay;
	}
}
