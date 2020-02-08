package pageclasses;

import com.antonio.resources.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

        public class OrderPage {

            public String getUrl(WebDriver driver){
                return driver.getCurrentUrl();
            }

            public int click_on_plus_button(WebDriver driver){
                int units = Integer.parseInt(driver.findElement(By.cssSelector(Selectors.PRODUCTQUANTITY)).getAttribute("value"));
                driver.findElement(By.cssSelector(Selectors.PRODUCTPLUSBUTTON)).click();
                return units;
            }

            public int click_on_minus_button(WebDriver driver){
                int units = Integer.parseInt(driver.findElement(By.cssSelector(Selectors.PRODUCTQUANTITY)).getAttribute("value"));
                driver.findElement(By.cssSelector(Selectors.PRODUCTMINUSBUTTON)).click();
                return units;
            }

            public void click_on_delete_button(WebDriver driver){
                driver.findElement(By.cssSelector(Selectors.PRODUCTDELETEBUTTON)).click();
            }

            public void click_on_continue_shopping_button(WebDriver driver){
                driver.findElement(By.cssSelector(Selectors.ORDERCONTINUEBUTTON)).click();
            }

            public void click_on_proceed_button(WebDriver driver){
                driver.findElement(By.cssSelector(Selectors.ORDERPROCEEDBUTTON)).click();
            }

            public String get_step(WebDriver driver){
                return driver.findElement(By.cssSelector(Selectors.ORDERPAGESTEP)).getText();
            }

            public void summary_cart_empty(WebDriver driver){
                try{
                    //WebDriverWait wait = new WebDriverWait(driver, 15);
                    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Selectors.ORDERPAGEEMTPY)));
                    driver.findElement(By.cssSelector(Selectors.ORDERPAGEEMTPY)).isDisplayed();
                }catch(NoSuchElementException e){
                    System.out.println("The summary cart page have products.");
                }
            }

            public void summary_cart_counter(WebDriver driver){
                try{
                    driver.findElement(By.cssSelector(Selectors.ORDERPRODUCTCOUNTER)).isDisplayed();
                }catch(NoSuchElementException e){
                    System.out.println("The summary cart is empty.");
                }
            }

            public void continue_shopping(WebDriver driver){
                driver.findElement(By.cssSelector(Selectors.ORDERCONTINUEBUTTON)).click();
            }

            public void check_continue_page(WebDriver driver){
                if(!driver.getCurrentUrl().equals(Selectors.PRODUCT1URL)){
                    System.out.println("The previous page isn't correct.");
                }
            }

            public void continue_to_checkout(WebDriver driver){
                driver.findElement(By.cssSelector(Selectors.ORDERPROCEEDBUTTON)).click();
            }

            public void increase_by_one(WebDriver driver, int arg0){
                int after_units = Integer.parseInt(driver.findElement(By.cssSelector(Selectors.PRODUCTQUANTITY)).getAttribute("value"));
                if(after_units != (arg0 + 1)){
                    System.out.println("The units has not increased.");
                }
            }

            public void decrease_by_one(WebDriver driver, int arg0){
                int after_units = Integer.parseInt(driver.findElement(By.cssSelector(Selectors.PRODUCTQUANTITY)).getAttribute("value"));
                if(after_units != (arg0 - 1)){
                    System.out.println("The units has not decreased.");
                }
            }

            public void enter_quantity(WebDriver driver, String units){
                driver.findElement(By.cssSelector(Selectors.PRODUCTQUANTITY)).clear();
                driver.findElement(By.cssSelector(Selectors.PRODUCTQUANTITY)).sendKeys(units);
            }

            public String get_quantity(WebDriver driver){
                return driver.findElement(By.cssSelector(Selectors.PRODUCTQUANTITY)).getAttribute("value");
            }

            public void get_product_counter(WebDriver driver){
                driver.findElement(By.cssSelector(Selectors.ORDERPRODUCTCOUNTER));
            }

            public void click_delete_button(WebDriver driver){
                driver.findElement(By.cssSelector(Selectors.PRODUCTDELETEBUTTON)).click();
            }

}

