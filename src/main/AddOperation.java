package main;

import java.math.BigDecimal;

public class AddOperation implements Operation{

	@Override
	public void apply(OperandStack values) {
		BigDecimal value1 = values.peek();
		values.pop();
		BigDecimal value2 = values.peek();
		values.replaceTop(value1.add(value2));
	}

}
