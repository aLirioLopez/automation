package pageclasses;

import com.antonio.resources.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {

    public String getUrl(WebDriver driver){
        return driver.getCurrentUrl();
    }

    public String get_step(WebDriver driver){
        return driver.findElement(By.cssSelector(Selectors.SHIPPINGPAGESTEP)).getText();
    }

    public void accept_terms(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.TERMSOFSERVICECHECK)).click();
    }

    public void click_on_proceed(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.SHIPPINGPROCEEDBUTTON)).click();
    }

}
