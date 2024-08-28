package com.mobile.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.time.Duration;
import java.util.Arrays;

public class ToneOpCarePage {
	
	AppiumDriver driver;
	WebDriverWait wait;
	
	
	public ToneOpCarePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    By cartIcon = By.xpath("//android.widget.TextView[@text=\"\"]");
    
    By addToCartButton = By.xpath("//android.widget.TextView[@text=\"\"][1]");
    
    By wishlistButton = By.xpath("//android.widget.TextView[@text=\"\"][1]");
    
    By allProductsButton = By.xpath("//android.widget.TextView[@text=\"All Products\"]");
    
    By toneOpCareHeading = By.xpath("//android.widget.TextView[@text=\"ToneOp Care\"]");
    
    

    public void scrollDownAndTapAddToCart() {
    	
    	WebElement allProductsButtondisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(allProductsButton));
    	
    	allProductsButtondisplay.isDisplayed();
    	
    	Dimension size = driver.manage().window().getSize();
    	int startX = size.width / 2;
    	int startY = (int) (size.height * 0.8);
    	int endY = (int) (size.height * 0.2);

    	
    	PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(finger, 1);
    	swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
    	swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
    	swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), startX, endY));
    	swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

    	
    	driver.perform(Arrays.asList(swipe));
    	
    	WebElement addToCartButtonclick = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        
        addToCartButtonclick.click();
    }

    public void tapWishlistButton() {
    	
    	WebElement wishlistButtonclick = wait.until(ExpectedConditions.elementToBeClickable(wishlistButton));
        wishlistButtonclick.click();
    }
    
public void tapCartIcon() {
    	
    	Dimension size = driver.manage().window().getSize();
    	int startX = size.width / 2;
    	int startY = (int) (size.height * 0.2); 
    	int endY = (int) (size.height * 0.8);   

    	PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(finger, 1);
    	swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
    	swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
    	swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), startX, endY));
    	swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

    	driver.perform(Arrays.asList(swipe));
    	
    	WebElement cartIconclick = wait.until(ExpectedConditions.elementToBeClickable(cartIcon));
        cartIconclick.click();
    }

    public boolean verifyToneOpCarePage() {
    	
    	WebElement toneOpCareHeadingdisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(toneOpCareHeading));
        
    	try {
    	    return toneOpCareHeadingdisplay.isDisplayed();  
    	} catch (NoSuchElementException e) {
    	    return false;  
    	}
    }

    public void tapAllProducts() {
    	
    	Dimension size = driver.manage().window().getSize();
    	int startX = size.width / 2;
    	int startY = (int) (size.height * 0.2); 
    	int endY = (int) (size.height * 0.8);   

    	PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    	Sequence swipe = new Sequence(finger, 1);
    	swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
    	swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
    	swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), startX, endY));
    	swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

    	driver.perform(Arrays.asList(swipe));

    	
    	WebElement allproductsbuttonclick = wait.until(ExpectedConditions.elementToBeClickable(allProductsButton));
        allproductsbuttonclick.click();
    }

   
	
}
