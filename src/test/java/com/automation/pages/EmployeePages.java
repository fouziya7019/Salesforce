package com.automation.pages;

import com.automation.common.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.*;
public class EmployeePages  extends BaseClass {
    Logger Log= LogManager.getLogger(LoginPage.class);
    @FindBy(xpath = "//*[@class='slds-context-bar__label-action dndItem' and @title='Employees']")
    public WebElement EmployeesObject;
     @FindBy(css ="a[class=\"forceActionLink\"]")
     public WebElement NewButton;
     @FindBy(xpath = "//*[@name='Employee_ID__c']")
     public WebElement EmpID;
@FindBy(xpath = "//*[@name='Name']")
public  WebElement Nametextbox;
@FindBy(xpath = "//*[@name='Cost__c']")
public  WebElement costtextbox;
@FindBy(xpath = "//*[text()='Quality Assurance']")
public  WebElement businessunitdropdown;
@FindBy(xpath = "//*[@data-value='--None--'  and @aria-label='Business Unit']")
public WebElement BusinessUnit;
@FindBy(xpath = "//*[@class='slds-button slds-button_brand']")
public WebElement Savebutton;

    public EmployeePages(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void setLoginPage(String ID,String name,String Cost) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("EMployee Displayed--->"+EmployeesObject.isDisplayed());
        EmployeesObject.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        NewButton.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        EmpID.sendKeys(ID);
        Thread.sleep(2000);
        Nametextbox.sendKeys(name);
        Thread.sleep(2000);

        costtextbox.sendKeys(Cost);
        Thread.sleep(2000);

        BusinessUnit.click();
        Thread.sleep(2000);

        businessunitdropdown.click();
        Savebutton.click();
        Log.info("for info only");
    }
}
