package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class CalculatorWithThreeValuesTest {
	
	Calculator calculator;
	BigDecimal value1;
	BigDecimal value2;
	BigDecimal value3;
	
	@Before
	public void createCalculator() {
		calculator = new Calculator();
    	value1 = new BigDecimal(12);
    	value2 = new BigDecimal(22);
    	value3 = new BigDecimal(52);
    	calculator.setAccumulator(value1);
    	calculator.enter();
    	calculator.setAccumulator(value2);
    	calculator.enter();
    	calculator.setAccumulator(value3);
	}
	
	@Test
	public void testAccumulatorAfterPushingThreeValues() {
		assertEquals(value3, calculator.getAccumulator());
	}
	
	@Test
	public void testAccumulatorAfterSingleDrop() {
		calculator.drop();
    	assertEquals(value2, calculator.getAccumulator());
	}

	@Test
    public void TestAccumulatorAfterDroppingTwice() {
		calculator.drop();
    	calculator.drop();
    	assertEquals(value1, calculator.getAccumulator());
    }

}
