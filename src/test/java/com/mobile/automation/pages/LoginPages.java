package com.mobile.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import java.time.Duration;
import java.util.Scanner;

public class LoginPages {
	
	AppiumDriver driver;
	
	WebDriverWait wait;
	
	Scanner scanner;
	
	
	public LoginPages(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.scanner = new Scanner(System.in);
    }
	
	By SkipButton = By.xpath("//android.widget.TextView[@text=\"Skip\"]");
	
	By PhoneNumberInput = By.xpath("//android.widget.EditText[@resource-id=\"login_mobile_input\"]");
	
	By GetOTPButton = By.xpath("//android.view.ViewGroup[@content-desc=\"Get OTP\"]");
	
	By OTPInput1 = By.xpath("//android.widget.EditText[@content-desc=\"otpInput-0\"]");
	
	By OTPInput2 = By.xpath("//android.widget.EditText[@content-desc=\"otpInput-1\"]");
	
	By OTPInput3 = By.xpath("//android.widget.EditText[@content-desc=\"otpInput-2\"]");
	
	By OTPInput4 = By.xpath("//android.widget.EditText[@content-desc=\"otpInput-3\"]");
	
	By SkipIntroButton = By.xpath("//android.view.ViewGroup[@content-desc=\"Skip\"]");
	
	By careButton = By.xpath("//android.view.View[@content-desc=\"Care\"]");
	
		
	public void tapskipButton() {
        WebElement skipButton = wait.until(ExpectedConditions.elementToBeClickable(SkipButton));
        skipButton.click();
    }

    public void inputPhoneNumber() {
        
        System.out.println("Enter Phone Number: ");
        String userInput = scanner.next(); // Changed to next() to match the type of PhoneNumberInput

        WebElement phoneNumberInput = wait.until(ExpectedConditions.visibilityOfElementLocated(PhoneNumberInput));
        phoneNumberInput.sendKeys(userInput);
    }

    public void getOTPButton() {
        WebElement getOTPButton = wait.until(ExpectedConditions.elementToBeClickable(GetOTPButton));
        getOTPButton.click();
    }

    public void inputOTP() {
        System.out.println("Enter OTP: ");
        String userInput = scanner.next();
        scanner.close();

        char digit1 = userInput.charAt(0);
        char digit2 = userInput.charAt(1);
        char digit3 = userInput.charAt(2);
        char digit4 = userInput.charAt(3);

        WebElement otpInput1 = wait.until(ExpectedConditions.visibilityOfElementLocated(OTPInput1));
        WebElement otpInput2 = wait.until(ExpectedConditions.visibilityOfElementLocated(OTPInput2));
        WebElement otpInput3 = wait.until(ExpectedConditions.visibilityOfElementLocated(OTPInput3));
        WebElement otpInput4 = wait.until(ExpectedConditions.visibilityOfElementLocated(OTPInput4));

        otpInput1.sendKeys(String.valueOf(digit1));
        otpInput2.sendKeys(String.valueOf(digit2));
        otpInput3.sendKeys(String.valueOf(digit3));
        otpInput4.sendKeys(String.valueOf(digit4));
    }

    public void tapSkipIntroButton() {
        WebElement skipIntroButton = wait.until(ExpectedConditions.elementToBeClickable(SkipIntroButton));
        skipIntroButton.click();
    }

    public void tapCareButton() {
        WebElement careButtonElement = wait.until(ExpectedConditions.elementToBeClickable(careButton));
        careButtonElement.click();

        System.out.println("Care button clicked");
    }
	
	
	
	
}
