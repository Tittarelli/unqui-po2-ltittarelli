package ar.edu.unq.po2.tp5;

public class ServiceInvoice extends Invoice{

	private double pricePerUnit;
	private double units;

	public ServiceInvoice(Agency anAgency, double pricePerUnit, double units) {
		super(anAgency);
		this.pricePerUnit = pricePerUnit;
		this.units = units;
	}

	@Override
	public double amount() {
		return pricePerUnit * units;
	}

}
