package com.example.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestCalc2 {

	@Test
	@DisplayName("TestCalc2 My First test!")
	void testAdd() {
		Calculator calc = new Calculator();
		//assertEquals(calc.add(1, 1), 2);
		//assertEquals(new Integer(200).equals(new Integer(200)),true);
		//assertEquals(new Integer(200)==(new Integer(200)),true);
		assertEquals(new Integer(200)==(new Integer(200)),false);
	}
	
	@ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({"1, 2, 3", "4, 4, 8"})
	@DisplayName("TestCalc3 My Second test!")
	void addTest(int one, int two, int three) {
		Calculator c = new Calculator();
		assertEquals(three, c.add(one, two), ()->one + "+" + two + "=" + three);
	}
}

 
