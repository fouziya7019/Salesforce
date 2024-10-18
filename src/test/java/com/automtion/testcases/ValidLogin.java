package com.automtion.testcases;

import com.automation.common.BaseClass;
import com.automation.pages.LoginPage;
import org.testng.annotations.Test;

public class ValidLogin  extends BaseClass{
@Test (testName = "saleslogin")
        public void logging() throws InterruptedException {
            LoginPage login=new LoginPage(driver);
            login.setLoginPage("avinash.r@zucitech.com.ztdev1","Zucitech@12")  ;
            Thread.sleep(4000);
//   assert driver.getCurrentUrl()=="https://zucitechsoftwaresolutions--ztdev1.sandbox.lightning.force.com/lightning/o/Employees__c/new?count=2&nooverride=1&useRecordTypeCheck=1&navigationLocation=LIST_VIEW&uid=172916146265228141&backgroundContext=%2Flightning%2Fo%2FEmployees__c%2Flist%3FfilterName%3D__Recent";


}

}
