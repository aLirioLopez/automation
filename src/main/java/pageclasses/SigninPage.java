package pageclasses;

import com.antonio.resources.EmailGenerator;
import com.antonio.resources.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {
    EmailGenerator email = new EmailGenerator();
    AccountFormPage newaccountpage = new AccountFormPage();

    public String getUrl(WebDriver driver){
        return driver.getCurrentUrl();
    }

    public String get_step(WebDriver driver){
        return driver.findElement(By.cssSelector(Selectors.SIGNINPAGESTEP)).getText();
    }

    public void create_or_login(WebDriver driver, String arg0){
        if(arg0.equals("new")){
            String  new_account = email.getEmail();
            driver.findElement(By.cssSelector(Selectors.SIGNUPEMAILFIELD)).sendKeys(new_account);
            driver.findElement(By.cssSelector(Selectors.CREATEACCOUNTBUTTON)).click();
            newaccountpage.create_account(driver);
        }else if(arg0.equals("login")){
            driver.findElement(By.cssSelector(Selectors.SIGNINEMAILFIELD)).sendKeys("pruebaprueba@mailinator.com");
            driver.findElement(By.cssSelector(Selectors.SIGNINPWDFIELD)).sendKeys("123123");
            driver.findElement(By.cssSelector(Selectors.SIGNINBUTTON)).click();
        } else {
            System.out.println("User is not in sign in page.");
        }
    }
}
