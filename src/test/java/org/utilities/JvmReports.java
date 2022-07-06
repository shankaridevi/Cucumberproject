package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {
	public static void generateJvmReport(String jsonpath) {
		File f=new File(System.getProperty("user.dir")+"\\target\\reports\\jvmreport");
		Configuration con=new Configuration(f,"furniture product");
		con.addClassifications("java","1.8");
		con.addClassifications("selenium", "3.141");
		con.addClassifications("browser", "chrome");
		List<String>ll=new ArrayList<String>();
		ll.add(jsonpath);
		ReportBuilder r=new ReportBuilder(ll,con);
		r.generateReports();
	}

}
