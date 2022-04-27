package ar.edu.unq.po2.tp5;

public class CooperativeProduct extends Product {

	private int discountToApply;
	
	public CooperativeProduct(String name, double price, int stock) throws Exception {
		super(name, price, stock);
		this.discountToApply = 10;
	}
	
	public CooperativeProduct(String name, double price, int stock, int discountToApply) throws Exception {
		super(name, price, stock);
		this.discountToApply = discountToApply;
	}
	
	@Override
	public double amount() {
		return super.amount() - (super.amount() * discountToApply / 100);
	}
}
