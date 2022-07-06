package org.stepdefine;

import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	@Before
	public void tc() {
		launchChrome();
		loadUrl("https://www.wayfair.com/");
		winMax();
	
		
		
	}
	@After
	public void tc1(Scenario s) throws IOException {
		if(s.isFailed()) {
			TakesScreenshot tks=(TakesScreenshot)driver;
			byte[] ss=tks.getScreenshotAs(OutputType.BYTES);
			s.embed(ss, "img/png");
		}
		else {
		String name=s.getName();
		System.out.println(name);
		screenShot(name);
	
	}
	}
}
