package ar.edu.unq.po2.tp5;

public class TaxInvoice extends Invoice{
	
	private double rate;

	public TaxInvoice(Agency anAgency, double rate) {
		super(anAgency);
		this.rate = rate;
	}
	

	@Override
	public double amount() {
		return rate;
	}

}
