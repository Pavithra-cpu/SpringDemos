package com.sampletest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {

	@Test
	public void test()
	{
	String str="I am done with junit setup";
	assertEquals(str, "I am done with junit setup");
	}
}
