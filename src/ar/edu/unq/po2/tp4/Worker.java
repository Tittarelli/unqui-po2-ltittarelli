package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Worker {

	private List<Income> incomes;

	public Worker() {
		incomes = new ArrayList<>();
	}
	
	public void addIncome(Income anIncome) {
		incomes.add(anIncome);
	}

	public double tax() {
		return totalTaxableAmount() * 2 / 100;
	}

	public double totalTaxableAmount() {
		return incomes.stream().mapToDouble(Income::taxableAmount).sum();
	}
	
	public double totalAmount() {
		return incomes.stream().mapToDouble(Income::amount).sum();
	}

}
