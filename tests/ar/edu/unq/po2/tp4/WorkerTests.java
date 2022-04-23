package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WorkerTests {
	
	Worker worker;

	@BeforeEach
	void setUp() throws Exception {
	worker = new Worker();
	}

	@Test
	void testTaxWithOnlyOneIncome() {
		worker.addIncome(new Income(Month.JANUARY, "Salary", 10500.50));
		assertEquals(210.01, worker.tax());
	}
	
	@Test
	void testTaxWithACommonIncomeAndAOvertimeIncome() {
		worker.addIncome(new Income(Month.JANUARY, "Salary", 10500.50));
		assertEquals(210.01, worker.tax());
		worker.addIncome(new OvertimeIncome(Month.JANUARY, "Overtime", 499.50, 2));
		assertEquals(210.01, worker.tax());
	}
	
	@Test
	void testTaxableAmountWithACommonIncomeAndAOvertimeIncome() {
		worker.addIncome(new Income(Month.JANUARY, "Salary", 10500.50));
		assertEquals(10500.50, worker.totalTaxableAmount());
		worker.addIncome(new OvertimeIncome(Month.JANUARY, "Overtime", 499.50, 2));
		assertEquals(10500.50, worker.totalTaxableAmount());
	}
	
	@Test
	void testTotalAmountWithTwoDifferentIncomeTypes() {
		worker.addIncome(new Income(Month.JANUARY, "Salary", 10500.50));
		worker.addIncome(new OvertimeIncome(Month.JANUARY, "Overtime", 499.50, 2));
		assertEquals(11000, worker.totalAmount());
	}

}
