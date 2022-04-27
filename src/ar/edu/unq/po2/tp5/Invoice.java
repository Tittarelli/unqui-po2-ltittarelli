package ar.edu.unq.po2.tp5;

public abstract class Invoice implements Chargeable{
	
	protected Agency agency;
	
	public Invoice(Agency anAgency) {
		this.agency = anAgency;
	}

	@Override
	public void register() {		
		agency.registerPayment(this);
	}

	@Override
	public abstract double amount();

}
