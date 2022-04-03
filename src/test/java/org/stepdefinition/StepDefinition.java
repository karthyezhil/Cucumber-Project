package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojo.PolicyBazaarHomeInsurancePage;

public class StepDefinition extends BaseClass {

	PolicyBazaarHomeInsurancePage p;
	Select s;

	@Given("To enter PolicyBazaar Home Insurance through Chrome browser")
	public void toEnterPolicyBazaarHomeInsuranceThroughChromeBrowser() {
		launchBrowser();
		loadUrl("https://www.policybazaar.com/home-insurance/");
		maxBrowser();
	}

	@When("To validate label")
	public void toValidateLabel() {
		p = new PolicyBazaarHomeInsurancePage();
		toGetText("Label :", (p.getLabel()));
	}

	@When("To fill Name edit box {string}")
	public void toFillNameEditBox(String name) {
		p = new PolicyBazaarHomeInsurancePage();
		toImplicitlyWait(15);
		jsSetAttribute(p.getNameEditBox(), name);

	}

	@Then("validating Name edit box")
	public void validatingNameEditBox() {

		p = new PolicyBazaarHomeInsurancePage();
		toImplicitlyWait(15);
		jsGetAttribute("First Name : ", p.getNameEditBox());
		try {
			if (p.getCheckFormatName().isDisplayed()) {
				System.out.println("Entered Name accepted ");
			} else if (p.getNameErrorCommand().isDisplayed()) {
				toGetText("Error Message :", p.getNameErrorCommand());
			} else if (p.getNameRequired().isDisplayed()) {
				toGetText("Error Message :", p.getNameRequired());
			}
		} catch (NullPointerException e) {
			System.out.println("Enter valid name");
		}
	}

	@When("To fill MobileNo edit box {string}")
	public void toFillMobileNoEditBox(String mobileNo) {
		p = new PolicyBazaarHomeInsurancePage();
		toImplicitlyWait(15);
		jsSetAttribute(p.getMobileEditBox(), mobileNo);

	}

	@Then("validating MobileNo edit box")
	public void validatingMobileNoEditBox() {

		p = new PolicyBazaarHomeInsurancePage();
		toImplicitlyWait(15);
		jsGetAttribute("Mobile No : ", p.getMobileEditBox());
		try {
			if (p.getCheckFormatMobile().isDisplayed()) {
				System.out.println("Entered Phone Number accepted ");
			} else if (p.getMobileErrorCommand().isDisplayed()) {
				toGetText("Error Message :", p.getMobileErrorCommand());
			} else if (p.getErrorMobileMessage().isDisplayed()) {
				toGetText("Error Message :", p.getErrorMobileMessage());
			}
		} catch (NullPointerException e) {
			System.out.println("Enter valid Mobile Number");
		}
	}

	@When("To fill Email edit box {string}")
	public void toFillEmailEditBox(String emailId) {

		p = new PolicyBazaarHomeInsurancePage();
		toImplicitlyWait(15);
		jsSetAttribute(p.getEmailEditBox(), emailId);
	}

	@Then("validating Email edit box")
	public void validatingEmailEditBox() {

		p = new PolicyBazaarHomeInsurancePage();
		toImplicitlyWait(15);
		jsGetAttribute("Email Id :", p.getEmailEditBox());
		try {
			if (p.getCheckFormateEmail().isDisplayed()) {
				System.out.println("Entered EmailId accepted ");
			} else if (p.getEmailErrorCommand().isDisplayed()) {
				toGetText("Error Message :", p.getEmailErrorCommand());
			} else if (p.getErrorEmailMessage().isDisplayed()) {
				toGetText("Error Message :", p.getErrorEmailMessage());
			}
		} catch (NullPointerException e) {
			System.out.println("Enter valid name");
		}
	}

	@When("Automatically fetch data from one dimensional list")
	public void automaticallyFetchDataFromOneDimensionalList(io.cucumber.datatable.DataTable d) {
		List<String> l = d.asList();

		p = new PolicyBazaarHomeInsurancePage();
		jsSetAttribute(p.getNameEditBox(), l.get(0));
		jsGetAttribute("First Name : ", p.getNameEditBox());

		jsSetAttribute(p.getMobileEditBox(), l.get(1));
		jsGetAttribute("Mobile No : ", p.getMobileEditBox());

		jsSetAttribute(p.getEmailEditBox(), l.get(2));
		jsGetAttribute("Email Id :", p.getEmailEditBox());

	}

	@When("Automatically fetch data from two dimensional list")
	public void automaticallyFetchDataFromTwoDimensionalList(io.cucumber.datatable.DataTable d) {
		List<List<String>> l1 = d.asLists();

		p = new PolicyBazaarHomeInsurancePage();
		jsSetAttribute(p.getNameEditBox(), l1.get(0).get(0));
		jsGetAttribute("First Name : ", p.getNameEditBox());

		jsSetAttribute(p.getMobileEditBox(), l1.get(0).get(1));
		jsGetAttribute("Mobile No : ", p.getMobileEditBox());

		jsSetAttribute(p.getEmailEditBox(), l1.get(0).get(2));
		jsGetAttribute("Email Id :", p.getEmailEditBox());

	}

	@When("Automatically fetch data from one dimensional map")
	public void automaticallyFetchDataFromOneDimensionalMap(io.cucumber.datatable.DataTable d) {
		Map<String, String> mp = d.asMap(String.class, String.class);

		p = new PolicyBazaarHomeInsurancePage();
		jsSetAttribute(p.getNameEditBox(), mp.get("firstName"));
		jsGetAttribute("First Name : ", p.getNameEditBox());

		jsSetAttribute(p.getMobileEditBox(), mp.get("mobileNo"));
		jsGetAttribute("Mobile No : ", p.getMobileEditBox());

		jsSetAttribute(p.getEmailEditBox(), mp.get("emailid"));
		jsGetAttribute("Email Id :", p.getEmailEditBox());

	}

	@When("Automatically fetch data from two dimensional map")
	public void automaticallyFetchDataFromTwoDimensionalMap(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> m = d.asMaps();

		p = new PolicyBazaarHomeInsurancePage();
		jsSetAttribute(p.getNameEditBox(), m.get(1).get("firstName"));
		jsGetAttribute("First Name : ", p.getNameEditBox());

		jsSetAttribute(p.getMobileEditBox(), m.get(1).get("mobileNo"));
		jsGetAttribute("Mobile No : ", p.getMobileEditBox());

		jsSetAttribute(p.getEmailEditBox(), m.get(1).get("emailid"));
		jsGetAttribute("Email Id :", p.getEmailEditBox());
	}

	@When("To click continue button")
	public void toClickContinueButton() {

		p = new PolicyBazaarHomeInsurancePage();
		jsClick(p.getContinueButton());
	}

	@Then("validating credantials")
	public void validatingCredantials() {
		try {

			p = new PolicyBazaarHomeInsurancePage();
			if (p.getNameErrorCommand().isDisplayed()) {
				toGetText("Error Message :", p.getNameErrorCommand());
			} else if (p.getNameRequired().isDisplayed()) {
				toGetText("Error Message :", p.getNameRequired());
			} else if (p.getMobileErrorCommand().isDisplayed()) {
				toGetText("Error Message :", p.getMobileErrorCommand());
			} else if (p.getErrorMobileMessage().isDisplayed()) {
				toGetText("Error Message :", p.getErrorMobileMessage());
			} else if (p.getEmailErrorCommand().isDisplayed()) {
				toGetText("Error Message :", p.getEmailErrorCommand());
			} else if (p.getErrorEmailMessage().isDisplayed()) {
				toGetText("Error Message :", p.getErrorEmailMessage());
			} else {
				System.out.println("CONTINUE button Enabled");
			}

		}

		catch (NullPointerException e) {
			System.out.println("CONTINUE button not Enabled");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("CONTINUE button Enabled");
		}

		catch (NoSuchElementException e) {
			System.out.println("CONTINUE button Enabled");
		}

		catch (Exception e) {
			System.out.println("CONTINUE button Enabled");
		}
	}

	@When("To validate Privacy policy")
	public void toValidatePrivacyPolicy() {
		toImplicitlyWait(15);
		p = new PolicyBazaarHomeInsurancePage();
		jsClick(p.getBtnPrivacyPolicy());
		toHandleWindows();
		policyContent("Privacy Policy");

	}

	@When("To validate Terms of use")
	public void toValidateTermsOfUse() {
		toImplicitlyWait(15);
		p = new PolicyBazaarHomeInsurancePage();
		jsClick(p.getBtnTermsOfUse());
		toHandleWindows();
		policyContent("Terms of Use");
	}
}
