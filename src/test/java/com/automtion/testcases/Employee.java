package com.automtion.testcases;

import com.automation.pages.EmployeePages;
import org.testng.annotations.Test;

public class
Employee extends  ValidLogin{
    @Test
    public void EmployeeCreation() throws InterruptedException {
        EmployeePages page2=new EmployeePages(driver);
        page2.setLoginPage("12434","banu","20000");

    }
}
