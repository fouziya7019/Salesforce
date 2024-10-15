package com.learnautomtion.textcases;

import com.automation.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidLogin {
    @Test
            public void logging(){

        WebDriver driver =new ChromeDriver();
        driver.get("https://test.salesforce.com/");
        LoginPage login=new LoginPage(driver);
        login.setLoginPage("avinash.r@zucitech.com.ztdev1","Zucitech@12")  ;
       // driver.quit()   ;
    }
}
