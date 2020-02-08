package pageclasses;

import com.antonio.resources.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomenPage {

    public String getUrl(WebDriver driver){
        return driver.getCurrentUrl();
    }

    public void click_on_product_block(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.PRODUCTBLOCK)).click();
    }

}
