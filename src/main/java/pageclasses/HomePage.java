package pageclasses;

import com.antonio.resources.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HomePage {

    public String getUrl(WebDriver driver){
        return driver.getCurrentUrl();
    }

    public void click_women_section(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.WOMENBUTTON)).click();
    }

    public void no_products_cart(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.NOPRODUCTSCART)).isDisplayed();
    }

    public void go_to_pdp(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.HOMEPRODUCTBLOCK)).click();
    }

    public void cart_is_empty(WebDriver driver){
        try {
            driver.findElement(By.cssSelector(Selectors.EMPTYPRODUCTCOUNTER)).isDisplayed();
        }catch (NoSuchElementException e){
            System.out.println("The cart have products");
            driver.quit();
        }
    }

    public void click_on_cart(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.CARTBUTTON)).click();
    }

}
