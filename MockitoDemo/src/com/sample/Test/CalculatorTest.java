package com.sample.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.sample.model.Calculator;
import com.sample.model.CalculatorService;

public class CalculatorTest {


	Calculator c = null;
	//@Mock
	CalculatorService service=Mockito.mock(CalculatorService.class);
	
	/*@Rule
	public MockitoRule rule=MockitoJUnit.rule();*/

	@Before
	public void setup() {
		// TODO Auto-generated method stub
		c = new Calculator(service);
	}

	@Test
	public void testPerform() {

		when(service.add(3, 3)).thenReturn(6);
		assertEquals(18, c.perform(3, 3));
		verify(service).add(3, 3);
	}

	

}
