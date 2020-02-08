package pageclasses;

import com.antonio.resources.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddressesPage {
    public String getUrl(WebDriver driver){
        return driver.getCurrentUrl();
    }

    public String get_step(WebDriver driver){
        return driver.findElement(By.cssSelector(Selectors.ADDRESSSTEP)).getText();
    }

    public void create_or_update(WebDriver driver, String arg0){
        if(arg0.equals("new")){
            driver.findElement(By.cssSelector(Selectors.ADDNEWADDRESSBUTTON2)).click();
            create_address(driver);
        }else if(arg0.equals("update")){
            driver.findElement(By.cssSelector(Selectors.UPDATEDELIVERYBUTTON)).click();
            update_address(driver);
        } else {
            System.out.println("The user is not in the addresses page.");
        }
    }

    public void create_address(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.ADDRESSFIRSTNAMEFIELD)).sendKeys("newfirstname");
        driver.findElement(By.cssSelector(Selectors.ADDRESSLASTNAMEFIELD)).sendKeys("newlastname");
        driver.findElement(By.cssSelector(Selectors.COMPANYFIELD)).sendKeys("new company name");
        driver.findElement(By.cssSelector(Selectors.ADDRESSFIELD)).sendKeys("224 Guerrero St");
        driver.findElement(By.cssSelector(Selectors.ADDRESS2FIELD)).sendKeys("new Commerce");
        driver.findElement(By.cssSelector(Selectors.CITYFIELD)).sendKeys("San Francisco");
        Select state = new Select(driver.findElement(By.cssSelector(Selectors.STATECOMBO)));
        state.selectByValue("5");
        driver.findElement(By.cssSelector(Selectors.POSTALCODEFIELD)).sendKeys("94103");
        Select country = new Select(driver.findElement(By.cssSelector(Selectors.COUNTRYCOMBO)));
        country.selectByValue("21");
        driver.findElement(By.cssSelector(Selectors.ADDITIONALINFOBOX)).sendKeys("New additional info");
        driver.findElement(By.cssSelector(Selectors.HOMEPHONEFIELD)).sendKeys("+1 800-457-7694");
        driver.findElement(By.cssSelector(Selectors.MOBILEPHONEFIELD)).sendKeys("+1 415-255-7478");
        driver.findElement(By.cssSelector(Selectors.ADDRESSALIASFIELD)).sendKeys("New address");

        driver.findElement(By.cssSelector(Selectors.SUBMITADDRESSBUTTON)).click();
    }

    public void update_address(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.ADDRESSFIRSTNAMEFIELD)).clear();
        driver.findElement(By.cssSelector(Selectors.ADDRESSFIRSTNAMEFIELD)).sendKeys("updatefirstname");
        driver.findElement(By.cssSelector(Selectors.ADDRESSLASTNAMEFIELD)).clear();
        driver.findElement(By.cssSelector(Selectors.ADDRESSLASTNAMEFIELD)).sendKeys("updatelastname");
        driver.findElement(By.cssSelector(Selectors.COMPANYFIELD)).clear();
        driver.findElement(By.cssSelector(Selectors.COMPANYFIELD)).sendKeys("update company name");
        driver.findElement(By.cssSelector(Selectors.ADDRESSFIELD)).clear();
        driver.findElement(By.cssSelector(Selectors.ADDRESSFIELD)).sendKeys("75 E Santa Clara St");
        driver.findElement(By.cssSelector(Selectors.ADDRESS2FIELD)).clear();
        driver.findElement(By.cssSelector(Selectors.ADDRESS2FIELD)).sendKeys("update Commerce");
        driver.findElement(By.cssSelector(Selectors.CITYFIELD)).clear();
        driver.findElement(By.cssSelector(Selectors.CITYFIELD)).sendKeys("San Jose");
        Select state = new Select(driver.findElement(By.cssSelector(Selectors.STATECOMBO)));
        state.selectByValue("5");
        driver.findElement(By.cssSelector(Selectors.POSTALCODEFIELD)).clear();
        driver.findElement(By.cssSelector(Selectors.POSTALCODEFIELD)).sendKeys("95113");
        Select country = new Select(driver.findElement(By.cssSelector(Selectors.COUNTRYCOMBO)));
        country.selectByValue("21");
        driver.findElement(By.cssSelector(Selectors.ADDITIONALINFOBOX)).clear();
        driver.findElement(By.cssSelector(Selectors.ADDITIONALINFOBOX)).sendKeys("Update additional info");
        driver.findElement(By.cssSelector(Selectors.HOMEPHONEFIELD)).clear();
        driver.findElement(By.cssSelector(Selectors.HOMEPHONEFIELD)).sendKeys("+1 408-207-4381");
        driver.findElement(By.cssSelector(Selectors.MOBILEPHONEFIELD)).clear();
        driver.findElement(By.cssSelector(Selectors.MOBILEPHONEFIELD)).sendKeys("+1 408-477-8350");
        driver.findElement(By.cssSelector(Selectors.ADDRESSALIASFIELD)).clear();
        driver.findElement(By.cssSelector(Selectors.ADDRESSALIASFIELD)).sendKeys("Update address");

        driver.findElement(By.cssSelector(Selectors.SUBMITADDRESSBUTTON)).click();
    }

    public void click_on_proceed(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.ADDRESSPROCEEDBUTTON)).click();
    }
}
