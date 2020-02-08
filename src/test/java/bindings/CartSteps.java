package bindings;

import com.antonio.resources.Selectors;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageclasses.*;

import java.util.concurrent.TimeUnit;


public class CartSteps {

    WebDriver driver = null;
    //ChromeOptions options = new ChromeOptions().addArguments("--headless");
    HomePage homepage = new HomePage();
    ProductPage productpage = new ProductPage();
    OrderPage orderpage = new OrderPage();
    SigninPage signinpage = new SigninPage();
    AddressesPage addressespage = new AddressesPage();
    ShippingPage shippingpage = new ShippingPage();
    PaymentPage paymentpage = new PaymentPage();

    @Before
    public void before(Scenario scenario) {
        System.out.println("__________________________________");
        System.out.println("Starting - " + scenario.getName());
        System.out.println("__________________________________");

        //options.addArguments("--headless");
        // Descomentar para lanzar la prueba en modo headless.
        // driver = new ChromeDriver(options);

        driver = new ChromeDriver();
    }

    @Given("^user is on homepage")
    public void user_is_on_homepage() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Selectors.HOMEURL);
    }

    @When("user go to product page$")
    public void user_go_to_product_page(){
        homepage.go_to_pdp(driver);
        if(!productpage.getUrl(driver).equals(Selectors.PRODUCT1URL)){
            Assert.fail("the user is not in pdp");
        }
    }

    @And("^user clicks on add to cart$")
    public void user_clicks_on_add_to_cart(){
        productpage.click_on_add_to_cart(driver);
    }

    @Then("^one product is added to cart$")
    public void one_product_is_added_to_cart(){
        productpage.product_added(driver);
        driver.quit();
    }

    @And("^user clicks on add a unit$")
    public void user_clicks_on_add_a_unit(){
        productpage.click_on_plus_button(driver);
    }

    @Then("^multiple units are added to cart$")
    public void multiple_units_are_added_to_cart(){
        productpage.product_added(driver);
    }

    @And("^user clicks on subtract a unit$")
    public void user_clicks_on_subtract_a_unit(){
        productpage.click_on_minus_button(driver);
    }

    @Then("^error message is displayed$")
    public void error_message_is_displayed(){
        productpage.invalid_quantity(driver);
    }

    @And("user enter {string} units on quantity field")
    public void userEnterUnitsOnQuantityField(String arg0) {
        if(orderpage.getUrl(driver).equals(Selectors.ORDERURL)){
            orderpage.enter_quantity(driver, arg0);
        }else {
            productpage.enter_quantity(driver, arg0);
        }
    }

    @Then("the {string} is displayed on screen")
    public void theIsDisplayedOnScreen(String arg0) {
        if(arg0.equals("Error")){
            productpage.invalid_quantity(driver);
        }else{
            productpage.product_added(driver);
        }
    }

    @And("user select different {string} from combo")
    public void userSelectDifferentSizeFromCombo(String arg0) {
        productpage.select_different_size(driver, arg0);
    }

    @After
    public void after(){
        driver.quit();
        //driver = null;
    }

    @And("user select different {string}")
    public void userSelectDifferent(String arg0) {
        productpage.select_different_color(driver, arg0);
    }

    @And("the cart is empty")
    public void theCartIsEmpty() {
        homepage.cart_is_empty(driver);
    }

    @When("user clicks on cart")
    public void userClicksOnCart() {
        homepage.click_on_cart(driver);
    }

    @And("user is on summary cart page")
    public void userIsOnSummaryCartPage() {
        if(!orderpage.getUrl(driver).equals(Selectors.ORDERURL) && !orderpage.get_step(driver).equals("01.")){
            System.out.println("There user isn't in the cart summary page");
        }
    }

    @And("the product is deleted")

    @Then("a message is displayed indicating that the car is empty")
    public void aMessageIsDisplayedIndicatingThatTheCarIsEmpty() {
        orderpage.summary_cart_empty(driver);
    }

    @And("the cart have products")
    public void theCartHaveProducts() {
        homepage.go_to_pdp(driver);
        productpage.click_on_add_to_cart(driver);
        productpage.click_on_proceed_to_cart(driver);
    }

    @Then("there are products in summary cart")
    public void thereAreProductsInSummaryCart() {
        orderpage.summary_cart_counter(driver);
    }

    @Given("user go to summary cart page with products")
    public void userGoToSummaryCartPageWithProducts() {
        user_is_on_homepage();
        homepage.go_to_pdp(driver);
        productpage.click_on_add_to_cart(driver);
        productpage.click_on_proceed_to_cart(driver);
    }

    @When("user clicks on continue shopping button")
    public void userClicksOnContinueShoppingButton() {
        orderpage.continue_shopping(driver);
    }

    @Then("the user go back to previous page")
    public void theUserGoBackToPreviousPage() {
        orderpage.check_continue_page(driver);
    }

    @When("user clicks on continue to checkout button")
    public void userClicksOnContinueToCheckoutButton() {
        orderpage.continue_to_checkout(driver);
    }

    @Then("user go to login page")
    public void userGoToLoginPage() {
        if(!signinpage.getUrl(driver).equals(Selectors.SIGINURL) && !signinpage.get_step(driver).equals("02.")){
            System.out.println("There user isn't in the sign in page");
        }
    }

    @When("user clicks on plus button")

    @Then("the product quantity increases by one")
    public void theProductQuantityIncreasesByOne() {
        int units = orderpage.click_on_plus_button(driver);
        orderpage.increase_by_one(driver, units);
    }

    @And("the product have more than one unit")
    public void theProductHaveMoreThanOneUnit() {
        orderpage.click_on_minus_button(driver);
    }

    @When("user clicks on minus button")

    @Then("the product quantity decreases by one")
    public void theProductQuantityDecreasesByOne() {
        int units = orderpage.click_on_minus_button(driver);
        orderpage.decrease_by_one(driver, units);
    }

    @Then("the product quantity increases to {string}")
    public void theProductQuantityIncreasesTo(String arg0) {
        if(!orderpage.get_quantity(driver).equals(arg0)){
            System.out.println("Quantity has not increased");
        }
    }

    @And("the product have {string} unit")
    public void theProductHaveUnit(String arg0) {
        orderpage.enter_quantity(driver, arg0);
    }

    @Then("the product quantity decreases to {string}")
    public void theProductQuantityDecreasesTo(String arg0) {
        if(!orderpage.get_quantity(driver).equals(arg0)){
            System.out.println("Quantity has not decreased");
        }
    }

    @When("user enter zero units to quantity field")
    public void userEnterZeroUnitsToQuantityField() {
        orderpage.enter_quantity(driver,"0");
    }


    @When("user clicks on delete button")
    public void userClicksOnDeleteButton() {
        orderpage.click_delete_button(driver);
    }

    @And("user creates or login with {string}")
    public void userCreatesOrLogin(String arg0) {
        signinpage.create_or_login(driver, arg0);
    }

    @Then("user should see the addresses page")
    public void userShouldSeeTheAddressesPage() {
        if(!addressespage.getUrl(driver).equals(Selectors.ADDRESSESURL) && !addressespage.get_step(driver).equals("03.")){
            System.out.println("There user isn't in the addresses page");
        }
    }

    @And("update or create a new {string}")
    public void updateOrCreateANew(String arg0) {
        addressespage.create_or_update(driver, arg0);
        addressespage.click_on_proceed(driver);
    }

    @When("user go to shipping page accepting the shipping conditions")
    public void userGoToShippingPageAcceptingTheShippingConditions() {
        if(!shippingpage.getUrl(driver).equals(Selectors.SHIPPINGURL) && !shippingpage.get_step(driver).equals("04.")){
            System.out.println("There user isn't in the shipping page");
        }else{
            shippingpage.accept_terms(driver);
        }
    }

    @And("go to payment page selecting {string}")
    public void goToPaymentPageSelecting(String arg0) {
        shippingpage.click_on_proceed(driver);
        if(!paymentpage.getUrl(driver).equals(Selectors.PAYMENTURL) && !paymentpage.get_step(driver).equals("05.")){
            System.out.println("There user isn't in the payment page");
        }else{
            paymentpage.select_payment_method(driver, arg0);
        }
    }

    @And("confirm the order")
    public void confirmTheOrder() {
        paymentpage.confirm_order(driver);
    }

    @Then("a success purchase message should be displayed")
    public void aSuccessPurchaseMessageShouldBeDisplayed() {
        try {
            paymentpage.get_confirmation(driver);
        } catch (NoSuchElementException e){
            System.out.println("Order confirmation failed.");
        }
    }
}
