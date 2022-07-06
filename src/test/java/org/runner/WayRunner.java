package org.runner;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.BaseClass;
import org.utilities.JvmReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefine",dryRun=false,monochrome=true,snippets=SnippetType.CAMELCASE,
plugin= {"html:target\\reports",
		"json:target\\reports\\out.json",
"junit:target\\reports\\fb.xml"	,"rerun:src\\test\\resources\\rerunner\\failed.txt"	
})


public class WayRunner extends BaseClass {
	@After
	public static void tc1() {
		
		
	}
	
	@AfterClass
	public static void  jvmreportGeneration() {
		JvmReports.generateJvmReport(System.getProperty("user.dir")+"\\target\\reports\\out.json");	
		}
	
	
	
}
