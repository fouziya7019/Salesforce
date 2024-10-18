package com.automation.common;

import org.testng.ITestResult;

public class pwITestListener  extends BaseClass implements org.testng.ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        CaptureSreenshot(result.getTestName()+".jpg");
    }
}
