package com.actitime.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import junit.framework.Assert;

@Listeners(com.actitime.generic.ListenersTest.class)

public class DemoTest extends BaseTest
{
	@Test
	public void testA()
	{
		Assert.fail();
	}
}
