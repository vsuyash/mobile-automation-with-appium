package com.mobile.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class MarketplacePage {

	AppiumDriver driver;
	WebDriverWait wait;
	
	
	public MarketplacePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    By cartIcon = By.xpath("//android.widget.TextView[@text=\"\"]");
    
    By marketplaceHeading = By.xpath("//android.widget.TextView[@text=\"MarketPlace\"]");
    
    By addToCartButton = By.xpath("//android.widget.TextView[@text=\"\"][1]");
    
    By backButton = By.xpath("//android.widget.TextView[@text=\"\"]");
    
    By addToWishlist = By.xpath("(//android.widget.TextView[@text=\"\"])[2]");
    
    By wishlistButton = By.xpath("//android.widget.TextView[@text=\"\"][1]");
    
    
    public void tapCartIcon() {
    	
    	WebElement wait1 = wait.until(ExpectedConditions.elementToBeClickable(cartIcon));
        wait1.click();
    }

    public void tapAddToCartOnFirstProduct() {
    	WebElement wait1 = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        wait1.click();
    }

    public void tapBackButton() {
    	
    	WebElement wait1 = wait.until(ExpectedConditions.elementToBeClickable(backButton));
        wait1.click();
        
    }

    public void addProductToWishlist() {
    	
    	WebElement wait1 = wait.until(ExpectedConditions.elementToBeClickable(addToWishlist));
        wait1.click();
    	
    }
    
    public void tapwishlistButton() {
    	
    	WebElement wait1 = wait.until(ExpectedConditions.elementToBeClickable(wishlistButton));
        wait1.click();
    	
    }
    
    
    public boolean verifyMarketplacePage() {
    	
    	WebElement wait1 = wait.until(ExpectedConditions.visibilityOfElementLocated(marketplaceHeading));
    	
    	try {
    	    return wait1.isDisplayed();  
    	} catch (NoSuchElementException e) {
    	    return false;  
    	}
        
    }
}
