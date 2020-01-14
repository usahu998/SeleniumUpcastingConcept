package com.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CaptureScreenshot_ActiTIMEPage extends BaseTest{
    @Test
    public void testCaptureScreenshotFacebookPage() throws IOException {

        Date date = new Date();

        //Printing the actual date
        String date1 = date.toString();
        System.out.println(date1);

        //replacing the colon present in the date timestamp format to "_" using replaceAll()
        //method of String class
        String date2 = date1.replaceAll(":", "_");
        System.out.println(date2);

        //Enter the url
        driver.get("https://facebook.com");

        //Typecasting the driver object to TakesScreenshot interface type.
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        //getting the source file using getScreenshotAs() method and storing in a file
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        /*Created a folder called "screenshot" in the project directory
        Created another file by concatenating the date value which has "_" in it
        (Underscore is the accepted character while creating a file in the project )*/
        File destFile = new File("/home/admin1/SeleniumTesting/SeleniumUpcastingConcept/src/main/resources/ScreenShot" + date2 + "__actiTIMELoginPage.png");
        /*copyFile() method is a static method present in FileUtils class of JAVA
        storing the screenshot in the destination location*/
        FileUtils.copyFile(srcFile,destFile);
    }
}
