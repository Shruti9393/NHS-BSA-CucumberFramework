package nhs.pages;

import nhs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareHomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public CareHomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-no']")
    WebElement nocarehome;
    @CacheLookup
    @FindBy(xpath = "//input[@class='button']")
    WebElement nextbuttonforcarehome;
    //partner permenently care home
    public void clickOnPartnerInCareHome() {
        clickOnElement(nocarehome);
        log.info("Clicking on no " + nocarehome.toString());
    }
    public void clickOnNext10() {
        clickOnElement(nextbuttonforcarehome);
        log.info("Clicking on next " + nextbuttonforcarehome.toString());
    }
}
