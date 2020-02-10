package com.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {

	@Test
	public void test()
	{
		String str="I am done with junit setup";
		assertEquals("I am done with junit setup",str);
	}
}
