package com.AmazonUtil;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class MyScreenShot {

	public static String captureScreenShot(WebDriver driver, String ScreenShotName) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		File file = new File(currentDir + "\\ScreenShots");

		if (!file.exists()) {
			file.mkdirs();
			System.out.println("Create new folder");
		} else {
			file.delete();
			file.mkdirs();
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
		Date date = new Date();
		String dateTime = dateFormat.format(date.getTime());

		String destination = currentDir + "/ScreenShots/" + dateTime + "_" + ScreenShotName + ".png";

		try {
			FileHandler.copy(source, new File(destination));
		} catch (IOException e) {

			e.printStackTrace();
		}

		return destination;

	}

}
