package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;


public abstract class BasePage {

    @FindBy(xpath = "//a[normalize-space(text())='İletişim']")
    public WebElement IletisimButton;




    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

}
