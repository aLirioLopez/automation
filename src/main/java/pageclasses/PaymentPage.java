package pageclasses;

import com.antonio.resources.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {

    public String getUrl(WebDriver driver) {
        return driver.getCurrentUrl();
    }

    public String get_step(WebDriver driver) {
        return driver.findElement(By.cssSelector(Selectors.PAYMENTPAGESTEP)).getText();
    }

    public void select_payment_method(WebDriver driver, String arg0) {
        if (arg0.equals("bank")) {
            driver.findElement(By.cssSelector(Selectors.PAYBYBANKBUTTON)).click();
        } else if (arg0.equals("check")) {
            driver.findElement(By.cssSelector(Selectors.PAYBYCHECKBUTTON)).click();
        } else {
            System.out.println("There is no payment methods available.");
        }
    }

    public void confirm_order(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.CONFIRMORDERBUTTON)).click();
    }

    public void get_confirmation(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.SUCCESSALERT));
    }
}
