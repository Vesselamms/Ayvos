package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class  IletisimPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Ad Soyad']")
    public WebElement AdSoyad;

    @FindBy(xpath = "//input[@placeholder='E-Mail']")
    public WebElement Email;

    @FindBy(xpath = "//input[@placeholder='Telefon']")
    public WebElement Telefon;

    @FindBy(xpath = "//input[@placeholder='Mesajınız']")
    public WebElement Mesajiniz;


    @FindBy(xpath = " //input[@value='Gönder']")
    public WebElement Submittusu;
}
