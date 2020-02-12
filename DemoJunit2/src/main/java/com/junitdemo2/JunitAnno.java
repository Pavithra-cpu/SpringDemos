package com.junitdemo2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnno {
	
	private ArrayList<String> list;
	@BeforeClass
	public static void m1()
	{
		System.out.println("using beforeclass,executed before all test cases");
	}
	@Before
	public void m2()
	{
		list=new ArrayList<String>();
		System.out.println("using before,executed before each test cases");
	}
	@AfterClass
	public static void m3()
	{
		System.out.println("using afterclass executed before each test cases");
	}
	@After
	public void m4()
	{
		list.clear();
		System.out.println("using after executed after each test cases");
	}
	
	@Test
	public void test()
	
	{
		list.add("test");
		assertFalse(list.isEmpty());
		assertEquals(1,list.size());
	}
	
	@Ignore
	public void m5()
	{
		System.out.println("using ignore this execution is ignored");
	}
	
	@Test(timeout=6000)
	public void m6()
	{
		System.out.println("used to timeout in the testcase");
	}
	@Test(expected=NoSuchMethodException.class)
	public void m7()
	{
		System.out.println("it will check for specified exception");
	}
}
