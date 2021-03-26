package com.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
	public static void generateReport(String jsonFile) {
		Configuration c=new Configuration(new File("D:\\Workspace\\CucumberTask\\src\\test\\resources\\Reporting"), "Adactin");
		c.addClassifications("Browser", "chrome");
		c.addClassifications("Browser Version", "35.01.01");
		c.addClassifications("os", "window");
		
		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder rb=new ReportBuilder(jsonFiles, c);
		rb.generateReports();
		
	}
	

}
