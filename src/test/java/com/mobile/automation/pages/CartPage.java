package com.mobile.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class CartPage {
	
	
	 AppiumDriver driver;
	 WebDriverWait wait;
		
		
		public CartPage(AppiumDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    }
		
		By productInCart = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]");
		
		By secondProductInCart = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]");
		
		By deleteButton = By.xpath("//android.widget.TextView[@text=\"\"]");
		
		By deleteProductDialogueBox = By.xpath("//android.widget.LinearLayout[@resource-id=\"android:id/parentPanel\"]");
		
		By yesButton = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
		
		By emptyCartMessage = By.xpath("//android.widget.ImageView");
		
		By backButton = By.xpath("//android.widget.TextView[@text=\"\"]");
		
		By wishlistButton = By.xpath("//android.widget.TextView[@text=\"\"][1]");


	    public boolean verifyfirstProductInCart() {
	    	
	    	WebElement productInCartdisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(productInCart));
	    	
	    	try {
	    	    return productInCartdisplay.isDisplayed();  
	    	} catch (NoSuchElementException e) {
	    	    return false;  
	    	}	        
	    }

	    public void tapDeleteButton() {
	    	
	    	WebElement deleteButtonclick = wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
	        deleteButtonclick.click();
	    }

	    public boolean verifyDeletePopup() {
	    	
	    	WebElement deleteProductDialogueBoxdisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(deleteProductDialogueBox));
	    	
	    	try {
	    	    return deleteProductDialogueBoxdisplay.isDisplayed();  
	    	} catch (NoSuchElementException e) {
	    	    return false;  
	    	}
	        
	    }

	    public void confirmDelete() {
	    	
	    	WebElement yesButtonclick = wait.until(ExpectedConditions.elementToBeClickable(yesButton));
	        yesButtonclick.click();
	    }

	    public boolean verifyEmptyCartMessage() {
	    	
	    	WebElement emptyCartMessagedisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCartMessage));
	    	
	    	try {
	    	    return emptyCartMessagedisplay.isDisplayed();  
	    	} catch (NoSuchElementException e) {
	    	    return false;  
	    	}
	        
	    }

	    public boolean verifysecondProductInCart() {
	    	
	    	WebElement secondProductInCartdisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(secondProductInCart));
	    	
	    	try {
	    	    return secondProductInCartdisplay.isDisplayed();  
	    	} catch (NoSuchElementException e) {
	    	    return false;  
	    	}
	        
	    }
	    
	    public void tapBackButton() {
	    	
	    	WebElement backButtonclick = wait.until(ExpectedConditions.elementToBeClickable(backButton));
	    	
	        backButtonclick.click();
	    }
	
}
