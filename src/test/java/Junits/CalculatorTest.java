package Junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import code.Calculator;

public class CalculatorTest {
	// @Disabled
	@DisplayName("two positive nums")
	@Test
	public void tes1() {
		int result = Calculator.add(4, 5);
		Assertions.assertEquals(9, result);
	}

	@DisplayName("One positive num and one negative num test")
	@Test
	@Tag("Sanity")
	public void tes2() {
		int result = Calculator.add(-4, 5);
		Assertions.assertEquals(1, result);
	}

	@RepeatedTest(2)
	@DisplayName("two positive num where result not matching")
	public void test3() {
		int result = Calculator.add(4, 5);
		Assertions.assertNotEquals(10, result);
	}
	@CustomAnnotation
	public void test4() {
		int result = Calculator.add(4, 5);
		Assertions.assertNotEquals(10, result);
	}
}
