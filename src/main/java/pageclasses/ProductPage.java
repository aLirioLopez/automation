package pageclasses;

import com.antonio.resources.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    public String getUrl(WebDriver driver){
        return driver.getCurrentUrl();
    }

    public void click_on_add_to_cart(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.ADDTOCART)).click();
    }

    public void click_on_plus_button(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.PRODUCTPLUSBUTTON)).click();
    }

    public void click_on_minus_button(WebDriver driver){
        driver.findElement(By.cssSelector(Selectors.PRODUCTMINUSBUTTON)).click();
    }

    public void click_on_proceed_to_cart(WebDriver driver){
        //WebDriverWait wait = new WebDriverWait(driver, 15);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Selectors.MODALPROCEEDBUTTON)));
        driver.findElement(By.cssSelector(Selectors.MODALPROCEEDBUTTON)).click();
    }

    public void enter_quantity(WebDriver driver, String units){
        driver.findElement(By.cssSelector(Selectors.PRODUCTQUANTITYFIELD)).clear();
        driver.findElement(By.cssSelector(Selectors.PRODUCTQUANTITYFIELD)).sendKeys(units);
    }

    public void invalid_quantity(WebDriver driver){
        //WebDriverWait wait = new WebDriverWait(driver, 15);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Selectors.NULLQUANTITYMODAL)));
    }

    public void product_added(WebDriver driver){
        //WebDriverWait wait = new WebDriverWait(driver, 15);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Selectors.ADDEDMODAL)));
    }

    public void select_different_size(WebDriver driver, String size){
        Select size_combo = new Select(driver.findElement(By.cssSelector(Selectors.PRODUCTSIZECOMBO)));
        size_combo.selectByVisibleText(size);
    }

    public void select_different_color(WebDriver driver, String color){
        if(color.equals("orange")){
            driver.findElement(By.cssSelector(Selectors.PRODUCT1ORANGE)).click();
        }else{
            driver.findElement(By.cssSelector(Selectors.PRODUCT1BLUE)).click();
        }
    }

}
