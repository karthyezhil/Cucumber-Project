package org.finalrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFile", glue = "org.stepdefinition", dryRun = false, strict = true, snippets = SnippetType.CAMELCASE, 
plugin = {"pretty"})
		
public class RunAll {

	 @AfterClass
	 public static void report() {
	 JVMReport.generateReports(System.getProperty("user.dir") + "\\AllReports\\Json Report\\Poilcybazaar.json");
	 }

}

/***
 * , plugin = { "pretty", "html:C:\\Users\\karthi
 * AK\\eclipse-workspace\\PolicyBazaarCucumber\\All Reports\\Html Report",
 * "json:C:\\Users\\karthi AK\\eclipse-workspace\\PolicyBazaarCucumber\\All
 * Reports\\Json Report\\Poilcybazaar.json", "junit:C:\\Users\\karthi
 * AK\\eclipse-workspace\\PolicyBazaarCucumber\\All Reports\\JUnit
 * Report\\Policybazaar.xml", "Rerun:C:\\Users\\karthi
 * AK\\eclipse-workspace\\PolicyBazaarCucumber\\ReRun\\failed.txt" }
 **/