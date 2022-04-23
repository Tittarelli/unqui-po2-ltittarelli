package ar.edu.unq.po2.tp4;

import java.time.Month;

public class Income {

	private Month month;
	private String concept;
	private double amount;

	public Income(Month month, String concept, double amount) {
		this.month = month;
		this.concept = concept;
		this.amount = amount;
	}
	
	public double taxableAmount() {
		// In a "Common" Income, the taxable amount should be the whole received amount. 
		return amount;
	}

	public double amount() {
		return amount;
	}
}
