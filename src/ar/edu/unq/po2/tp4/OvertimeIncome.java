package ar.edu.unq.po2.tp4;

import java.time.Month;

public class OvertimeIncome extends Income {

	private int overtimeHours;

	public OvertimeIncome(Month month, String concept, double amount, int overtimeHours) {
		super(month, concept, amount);
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double taxableAmount() {
		return 0;
	}
}
