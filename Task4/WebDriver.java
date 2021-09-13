package com.company.GroupProject.Task4;

//Implement Code for Diagram:
//WebDriver InterFace
//TakeScreenShot Interface
//RemoteWebDriver Interface
//ChromeDriver Class, FirefoxDriver Class, SafariDriver Class

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver , TakeScreenshot {
    void navigate(); }

interface TakeScreenshot{
    void getScreenshot();}

class ChromeDriverClass implements RemoteWebDriver{
    public void navigate(){System.out.println("Navigate to Chrome browser.");}
    @Override
    public void open() {System.out.println("Open Chrome browser.");}
    @Override
    public void close() {System.out.println("Close Chrome browser.");}
    @Override
    public String getTitle() {return "Chrome browser.";}
    @Override
    public void getScreenshot() {System.out.println("Take a screenshot of Chrome browser.");}}

class FirefoxDriverClass implements RemoteWebDriver{
    public void navigate(){System.out.println("Navigate to Firefox browser.");}
    @Override
    public void open() {System.out.println("Open Firefox browser.");}
    @Override
    public void close() {System.out.println("Close Firefox browser.");}
    @Override
    public String getTitle() {return "Firefox browser.";}
    @Override
    public void getScreenshot() {System.out.println("Take a screenshot of Firefox browser.");}}

class SafariDriverClass implements RemoteWebDriver{
    public void navigate(){System.out.println("Navigate to Safari browser.");}
    @Override
    public void open() {System.out.println("Open Safari browser.");}
    @Override
    public void close() {System.out.println("Close Safari browser.");}
    @Override
    public String getTitle() {return "Safari browser.";
    }
    @Override
    public void getScreenshot() {System.out.println("Take a screenshot of Safari browser.");}}
