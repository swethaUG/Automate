package com.OHRM.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.lib.General;

public class TC_101 {
	@Test
	public void logInTest() throws IOException
	{
		General g =new General();
		g.setUp();
		g.logIn();
		g.verifyLogin();
		g.tearDown();
	}

}
