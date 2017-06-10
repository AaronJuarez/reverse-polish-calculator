package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import main.OperandStack;

public class OperandStackTest {
	OperandStack stack;
	
	@Before
	public void createStack() {
		stack = new OperandStack();
	}

	@Test
	public void testNewOperandStackPeekReturnsZero() {
		assertEquals(BigDecimal.ZERO, stack.peek());
	}
	
	@Test
	public void testPushingValueOntoStack() {
		BigDecimal value = new BigDecimal(12);
		stack.push(value);
		assertEquals(value, stack.peek());
	}
	
	@Test
	public void testReplacingTopOfStack() {
		stack.push(new BigDecimal(22));
		BigDecimal value = new BigDecimal(66);
		stack.replaceTop(value);
		assertEquals(value, stack.peek());
	}
	
	@Test
	public void testReplacingTopWithEmptyStack() {
		BigDecimal value = new BigDecimal(66);
		stack.replaceTop(value);
		assertEquals(value, stack.peek());
	}
	
	@Test
	public void testPoppingValueFromStack() {
		BigDecimal value = new BigDecimal(45);
		stack.push(value);
		stack.push(new BigDecimal(55));
		stack.pop();
		assertEquals(value, stack.peek());
	}
	
	@Test
	public void testPoppingEmptyStack() {
		stack.pop();
		assertEquals(BigDecimal.ZERO, stack.peek());
	}

}
