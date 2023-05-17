package Junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import code.StringFunctions;

public class ParametersExample {
	
	@ParameterizedTest
	@ValueSource(strings= {"madam","mom","radar"})
	public void test1(String name) {
		Assertions.assertTrue(StringFunctions.isPalindrome(name));;
	}

}
