package step_definitions;

import Pages.DashboardPage;
import Pages.IletisimPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class iletisim {
    DashboardPage dashboardPage= new DashboardPage();
    IletisimPage iletisimPage=new IletisimPage();

    @Given("kullanici ana sayfaya erisebilmeli")
    public void kullanici_ana_sayfaya_erisebilmeli() {
        //WebDriver driver = Driver.get(); (Singleton pattern)
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);



    }

    @When("kullanici sayfa sonunda bulunan {string} modulune tiklayabilmeli")
    public void kullanici_sayfa_sonunda_bulunan_modulune_tiklayabilmeli(String Iletisim) {



        /*JavascriptExecutor jse = (JavascriptExecutor) Driver.get();

        for (int i = 0; i < 6; i++) {
            BrowserUtils.waitFor(2);
            jse.executeScript("window.scrollBy(0,500)");

        }*/

        dashboardPage.IletisimButton.click();




    }

    @Then("kullanici url kismini {string} seklinde gormeli")
    public void kullanici_url_kismini_seklinde_gormeli(String ExpectedURL) {

        String ActualURL=Driver.get().getCurrentUrl();
        Assert.assertEquals(ActualURL,ExpectedURL);
    }

    @Given("Kullanici iletisim sayfasinda")
    public void kullanici_iletisim_sayfasinda() {
        String url2= ConfigurationReader.get("url2");
        Driver.get().get(url2);

    }

    @When("Kullanici Mesaj Gonder bolumunde bulunan")
    public void kullanici_Mesaj_Gonder_bolumunde_bulunan() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();

        for (int i = 0; i < 6; i++) {
            BrowserUtils.waitFor(2);
            jse.executeScript("window.scrollBy(0,500)");

        }
    }

    @When("{string} kismina isim soyismini yazmali")
    public void kismina_isim_soyismini_yazmali(String string) {

        iletisimPage.AdSoyad.sendKeys("Ibrahim");

    }

    @When("{string} kismina  mail adresini yazmali")
    public void kismina_mail_adresini_yazmali(String string) {


        iletisimPage.Email.sendKeys("ibrahimoztom@gmail.com");
    }

    @When("{string} kismina telefon numarisini yazmali")
    public void kismina_telefon_numarisini_yazmali(String string) {
        iletisimPage.Telefon.sendKeys("54566556");
    }

    @Then("Kullanici Gonder butonuna bastiginda {string} URL yi gormeli")
    public void kullanici_Gonder_butonuna_bastiginda_URL_yi_gormeli(String ExpectedURL) {



        iletisimPage.Submittusu.click();
        BrowserUtils.waitFor(3);

        String actualURL=Driver.get().getCurrentUrl();

        Assert.assertEquals(ExpectedURL,actualURL);

    }


}
