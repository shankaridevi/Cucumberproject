
package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\rerunner\\failed.txt",glue="org.stepdefine",dryRun=false,tags="@sanity",
plugin= {"pretty","html:target\\reports",
		"json:target\\reports\\out.json",
"junit:target\\reports\\fb.xml"		
,"rerun:src\\test\\resources\\rerunner\\failed.txt"})

public class RerunnerClass {
	@AfterClass
	public static void reportGeneration() {
	JvmReports.generateJvmReport(System.getProperty("user.dir")+"\\target\\reports\\out.json");	
	}
	
}
