package pageclasses;

import com.antonio.resources.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountFormPage {

    public void create_account(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.SELECTGENDERRADIO)).click();
        driver.findElement(By.cssSelector(Selectors.FIRSTNAMEFIELD)).sendKeys("firstname");
        driver.findElement(By.cssSelector(Selectors.LASTNAMEFIELD)).sendKeys("lastanme");
        driver.findElement(By.cssSelector(Selectors.PASSWORDFIELD)).sendKeys("123123");
        Select day = new Select(driver.findElement(By.cssSelector(Selectors.DAYOFBIRTHCOMBO)));
        day.selectByValue("8");
        Select month = new Select(driver.findElement(By.cssSelector(Selectors.MONTHOFBIRTHCOMBO)));
        month.selectByValue("4");
        Select year = new Select(driver.findElement(By.cssSelector(Selectors.YEAROFBIRTHCOMBO)));
        year.selectByValue("1993");
        driver.findElement(By.cssSelector(Selectors.NEWSLETTERCHECK)).click();
        driver.findElement(By.cssSelector(Selectors.SPECIALOFFERSCHECK)).click();
        driver.findElement(By.cssSelector(Selectors.ADDRESSFIRSTNAMEFIELD)).sendKeys("firstname");
        driver.findElement(By.cssSelector(Selectors.ADDRESSLASTNAMEFIELD)).sendKeys("lastname");
        driver.findElement(By.cssSelector(Selectors.COMPANYFIELD)).sendKeys("company name");
        driver.findElement(By.cssSelector(Selectors.ADDRESSFIELD)).sendKeys("6226 Ferguson Dr");
        driver.findElement(By.cssSelector(Selectors.ADDRESS2FIELD)).sendKeys("Commerce");
        driver.findElement(By.cssSelector(Selectors.CITYFIELD)).sendKeys("Los Angeles");
        Select state = new Select(driver.findElement(By.cssSelector(Selectors.STATECOMBO)));
        state.selectByValue("5");
        driver.findElement(By.cssSelector(Selectors.POSTALCODEFIELD)).sendKeys("90022");
        Select country = new Select(driver.findElement(By.cssSelector(Selectors.COUNTRYCOMBO)));
        country.selectByValue("21");
        driver.findElement(By.cssSelector(Selectors.ADDITIONALINFOBOX)).sendKeys("This is additional info");
        driver.findElement(By.cssSelector(Selectors.HOMEPHONEFIELD)).sendKeys("+1 323-721-8994");
        driver.findElement(By.cssSelector(Selectors.MOBILEPHONEFIELD)).sendKeys("+1 323-720-1684");
        driver.findElement(By.cssSelector(Selectors.ADDRESSALIASFIELD)).sendKeys("New user address");

        driver.findElement(By.cssSelector(Selectors.REGISTERBUTTON)).click();
    }

}
