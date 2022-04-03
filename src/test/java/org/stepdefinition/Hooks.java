package org.stepdefinition;

import org.helper.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void initiate() {
		System.out.println("Before scenario------ ");
		toGetDateAndTime();

	}

	@After
	public void terminate(Scenario s) {
		System.out.println("After scenario------ ");
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;

			byte[] screen = ts.getScreenshotAs(OutputType.BYTES);

			s.embed(screen, "image/png");
		}
		toGetDateAndTime();
		toCloseTab();
	}

}
