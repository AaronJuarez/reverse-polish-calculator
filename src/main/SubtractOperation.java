package main;

import java.math.BigDecimal;

public class SubtractOperation implements Operation{

	@Override
	public void apply(OperandStack values) {
		BigDecimal value1 = values.peek();
		values.pop();
		BigDecimal value2 = values.peek();
		values.replaceTop(value2.subtract(value1));
	}

}
