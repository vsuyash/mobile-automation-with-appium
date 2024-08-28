package com.mobile.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class WishlistPage {

	AppiumDriver driver;
	WebDriverWait wait;
	
	
	public WishlistPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
	
	By productInWishlist = By.xpath("//android.view.ViewGroup[@content-desc=\", Ova 360 Sachets-15 Sachets / Myo-Inositol, D-Chiro Inositol, Vitamin D3 & Folic Acid Sachets / Complete PCOS Care / Each 5 gm, Price : , ₹ 603.84 , ₹ 888, (32 % off)\"]");
	
	By wishlistHeading = By.xpath("(//android.widget.TextView[@text=\"Wishlist\"])[1]");
	
	By removeWishlistButton = By.xpath("//android.widget.TextView[@text=\"\"]");
	
	By emptyWishlistMessage = By.xpath("(//android.widget.ImageView)[2]");
	
	By backButton = By.xpath("//android.widget.TextView[@text=\"\"]");
	
	By cartIcon = By.xpath("//android.widget.TextView[@text=\"\"]");
    

    public boolean verifyProductInWishlist() {
    	
    	WebElement productInWishlistdisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(removeWishlistButton));
    	
    	try {
    	    return productInWishlistdisplay.isDisplayed();  
    	} catch (NoSuchElementException e) {
    	    return false;  
    	}
        
    }

    public void tapRemoveWishlistButton() {
    	
    	WebElement removeWishlistButtonclick = wait.until(ExpectedConditions.elementToBeClickable(removeWishlistButton));
    	
        removeWishlistButtonclick.click();
    }

    public boolean verifyEmptyWishlistMessage() {
    	
    	WebElement emptyWishlistMessagedisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(emptyWishlistMessage));
    	
    	try {
    	    return emptyWishlistMessagedisplay.isDisplayed();  
    	} catch (NoSuchElementException e) {
    	    return false;  
    	}
        
    }

    public boolean verifyWishlistPage() {
    	
    	WebElement wishlistHeadingdisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(wishlistHeading));
    	
    	try {
    	    return wishlistHeadingdisplay.isDisplayed();  
    	} catch (NoSuchElementException e) {
    	    return false;  
    	}
        
    }

    public void tapBackButton() {
    	
    	WebElement backButtonclick = wait.until(ExpectedConditions.elementToBeClickable(backButton));
        backButtonclick.click();
    }
    
    public void tapcartIcon() {
    	
    	WebElement cartIconclick = wait.until(ExpectedConditions.elementToBeClickable(cartIcon));
    	cartIconclick.click();
    }
	
}
