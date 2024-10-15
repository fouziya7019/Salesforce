package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id="username")
    private WebElement untbx;
    @FindBy(name="pw")
    private WebElement pwtb;
    @FindBy(name="Login")
    private WebElement lgbtn;
    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void setLoginPage(String un,String pwd){
        untbx.sendKeys(un);
        pwtb.sendKeys(pwd)  ;
        lgbtn.click();


    }

}
