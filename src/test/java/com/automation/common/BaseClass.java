package com.automation.common;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    @BeforeTest
    public void SetUp(){
         driver =new ChromeDriver();
        driver.get("https://test.salesforce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

@AfterTest
    public void TearDown(){
      //  driver.quit();

}
public void CaptureSreenshot(String filename){
    TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
    File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/" + filename);
        try {
            FileUtils.copyFile(sourceFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
		System.out.println("Screenshot saved successfully");

}
}
