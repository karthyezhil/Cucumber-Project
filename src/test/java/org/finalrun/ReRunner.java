package org.finalrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Rerun\\failed.txt", glue = "org.stepdefinition", dryRun = false, plugin = {
		"Rerun:C:\\Users\\karthi AK\\eclipse-workspace\\PolicyBazaarCucumber\\ReRun\\failed.txt" })
public class ReRunner {

	@AfterClass
	public static void report() {
		JVMReport.generateReports(System.getProperty("user.dir") + "\\AllReports\\JsonReport\\facebook.json");
	}

}
