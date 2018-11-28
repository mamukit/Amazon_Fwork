package com.AmazonRunnerFile;

import java.io.File;

import org.testng.annotations.AfterClass;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)// need this line for JUnit
@CucumberOptions(plugin = { "pretty", "html:target", "json:target/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Extents_report.html" },

		features = { "src\\main\\resources\\FindLaptopAndPayment.feature" }, 
		glue = { "com.AmazonStepDef" },

		monochrome = true, dryRun = false)
public class RunnerFileAmazon extends AbstractTestNGCucumberTests {// remove from extends if JUnit

	@AfterClass
	public static void tearDown() throws Throwable {
		Reporter.loadXMLConfig(new File("./ExtentsReportCucumber.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Window 10");
		Reporter.setTestRunnerOutput("Sample test runner output message");

		// Reporter.addScreenCaptureFromPath("absolute screenshot path");
		// Reporter.addScreenCast("absolute screen cast path");
	}
}