package com.mobile.automation.stepdefinations;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.mobile.automation.pages.WishlistPage;
import com.mobile.automation.pages.CartPage;
import com.mobile.automation.pages.LoginPages;
import com.mobile.automation.pages.ToneOpCarePage;

import com.mobile.automation.pages.MarketplacePage;



public class CartFunctionality {
	
	  	AppiumDriver driver;
	    MarketplacePage marketPlacePage;
	    ToneOpCarePage toneOpCarePage;
	    CartPage cartPage;
	    WishlistPage wishlistPage;
	    LoginPages loginPages;
	    
	    String APPIUM_SERVER_URL = "http://localhost:4723/wd/hub";
	    String DEVICE_NAME = "Pixel_6a_API_26_first";
	    String PLATFORM_NAME = "android";
	    String APP_PATH = "C:/Users/91883/Downloads/toneop-health-and-fitness-app-3-34.apk";  
	    String PLATFORM_VERSION = "8.0.0";

	    public CartFunctionality() {

			DesiredCapabilities desiredcapabilities = new DesiredCapabilities();
				
			desiredcapabilities.setCapability("platformName", PLATFORM_NAME);
			desiredcapabilities.setCapability("platformVersion", PLATFORM_VERSION);
			desiredcapabilities.setCapability("deviceName", DEVICE_NAME);
			desiredcapabilities.setCapability("automationName", "UIAutomator2");
			desiredcapabilities.setCapability("app", APP_PATH);
			desiredcapabilities.setCapability("autoGrantPermissions", true);
			
			
			try {
				driver = new AndroidDriver(new URL(APPIUM_SERVER_URL), desiredcapabilities);
			}catch (MalformedURLException e) {
				e.printStackTrace();
			}
	        
	        marketPlacePage = new MarketplacePage(driver);
	        toneOpCarePage = new ToneOpCarePage(driver);
	        cartPage = new CartPage(driver);
	        wishlistPage = new WishlistPage(driver);
	        loginPages = new LoginPages(driver);
	    }
	
	    
	    
	    @Given("the user login with valid credentials and is on the ToneOp home page")
	    public void the_user_login_with_valid_credentials_and_is_on_the_tone_op_home_page()  {
	    
	    	loginPages.tapskipButton();
	    	
	    	loginPages.inputPhoneNumber();
	    	
	    	loginPages.getOTPButton();
	    	
	    	loginPages.inputOTP();
	    	
	    	loginPages.tapSkipIntroButton();
	        
	    }

	    @When("the user taps on the Care button")
	    public void the_user_taps_on_the_Care_button() {
	        loginPages.tapCareButton();
	    }

	    @Then("the user should navigate to the ToneOp Care page")
	    public void the_user_should_navigate_to_the_ToneOp_Care_page() {
	    	toneOpCarePage.verifyToneOpCarePage();
	    }

	    @When("the user scrolls down and taps on Add to Cart for the first product")
	    public void the_user_scrolls_down_and_taps_on_Add_to_Cart_for_the_first_product()  {
	    	
	    	toneOpCarePage.scrollDownAndTapAddToCart();
	    }

	    @And("the user taps on the Wishlist button")
	    public void the_user_taps_on_the_Wishlist_button() throws InterruptedException  {
	    	Thread.sleep(5000);
	    	toneOpCarePage.tapWishlistButton();
	    }

	    @Then("the user verifies if there is any product in the wishlist")
	    public void the_user_verifies_if_there_is_any_product_in_the_wishlist() {
	        wishlistPage.verifyEmptyWishlistMessage();
	    }

	    @When("the user tap back button and taps on the Cart icon from ToneOp Care Page")
	    public void the_user_tap_back_button_and_taps_on_the_cart_icon_from_tone_op_care_page() throws InterruptedException {
	    	wishlistPage.tapBackButton();
	    	Thread.sleep(3000);
	        toneOpCarePage.tapCartIcon();
	    }

	    @Then("the user should see the added product in the cart")
	    public void the_user_should_see_the_added_product_in_the_cart() {
	        cartPage.verifyfirstProductInCart();
	    }

	    @When("the user taps on the Delete button")
	    public void the_user_taps_on_the_Delete_button() {
	        cartPage.tapDeleteButton();
	    }

	    @Then("a popup should appear with Yes and Cancel options")
	    public void a_popup_should_appear_with_Yes_and_Cancel_options() {
	        cartPage.verifyDeletePopup();
	    }

	    @When("the user taps on Yes")
	    public void the_user_taps_on_Yes() {
	        cartPage.confirmDelete();
	    }

	    @Then("the user should see an empty cart message")
	    public void the_user_should_see_an_empty_cart_message() {
	        cartPage.verifyEmptyCartMessage();
	    }

	    @When("the user taps on the Back button")
	    public void the_user_taps_on_the_Back_button() throws InterruptedException {
	    	Thread.sleep(3000);
	    	cartPage.tapBackButton();
	    }

	    @Then("the user should navigate back to the ToneOp Care page")
	    public void the_user_should_navigate_back_to_the_ToneOp_Care_page() {
	    	toneOpCarePage.verifyToneOpCarePage();
	    }

	    @When("the user taps on All Products")
	    public void the_user_taps_on_All_Products() {
	    	toneOpCarePage.tapAllProducts();
	    }

	    @And("the user taps on Add to Wishlist for the first product")
	    public void the_user_taps_on_Add_to_Wishlist_for_the_first_product() {
	    	marketPlacePage.addProductToWishlist();
	    }

	    @And("the user taps on the Wishlist icon")
	    public void the_user_taps_on_the_Wishlist_icon() throws InterruptedException {
	    	Thread.sleep(3000);
	        marketPlacePage.tapwishlistButton();
	    }

	    @Then("the user should see the recently added item in the wishlist")
	    public void the_user_should_see_the_recently_added_item_in_the_wishlist() {
	        wishlistPage.verifyProductInWishlist();
	    }

	    @When("the user taps on the Cart icon2")
	    public void the_user_taps_on_the_Cart_icon2() {
	        wishlistPage.tapcartIcon();
	    }

	    @Then("the cart should be empty")
	    public void the_cart_should_be_empty() {
	        cartPage.verifyEmptyCartMessage();
	    }

	    @When("the user taps on the Back button1")
	    public void the_user_taps_on_the_Back_button1() {
	        cartPage.tapBackButton();
	    }

	    @Then("the user should navigate back to the wishlist page")
	    public void the_user_should_navigate_back_to_the_wishlist_page() {
	        wishlistPage.verifyWishlistPage();
	    }

	    @When("the user taps on the Remove Wishlist button")
	    public void the_user_taps_on_the_Remove_Wishlist_button() {
	        wishlistPage.tapRemoveWishlistButton();
	    }

	    @Then("the wishlist should be empty with a message")
	    public void the_wishlist_should_be_empty_with_a_message() {
	        wishlistPage.verifyEmptyWishlistMessage();
	    }

	    @When("the user taps on the Back button2")
	    public void the_user_taps_on_the_Back_button2() {
	        wishlistPage.tapBackButton();
	    }

	    @Then("the user should navigate back to the marketplace page")
	    public void the_user_should_navigate_back_to_the_marketplace_page() {
	        marketPlacePage.verifyMarketplacePage();
	    }

	    @When("the user taps on Add to Cart on the first product")
	    public void the_user_taps_on_Add_to_Cart_on_the_first_product() {
	        marketPlacePage.tapAddToCartOnFirstProduct();
	    }

	    @And("the user taps on the Back button3")
	    public void the_user_taps_on_the_Back_button3() {
	        marketPlacePage.tapBackButton();
	    }

	    @And("the user taps on Add to Cart on the first product on another page")
	    public void the_user_taps_on_Add_to_Cart_on_the_first_product_on_another_page() {
	        toneOpCarePage.scrollDownAndTapAddToCart();
	    }

	    @And("the user taps on the Cart icon1")
	    public void the_user_taps_on_the_Cart_icon1() throws InterruptedException {
	    	Thread.sleep(5000);
	        toneOpCarePage.tapCartIcon();
	    }

	    @Then("the user should see both products added from different pages in the cart")
	    public void the_user_should_see_both_products_added_from_different_pages_in_the_cart() {
	        cartPage.verifyfirstProductInCart();
	        cartPage.verifysecondProductInCart();
	    }
	    
	    @Then("Application is closed")
	    public void application_is_closed() {
	        driver.quit();
	    }

}
