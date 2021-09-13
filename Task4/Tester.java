package com.company.GroupProject.Task4;

public class Tester {
    public static void main(String[] args) {
        RemoteWebDriver chromeDriver = new ChromeDriverClass();
        chromeDriver.navigate();
        chromeDriver.open();
        chromeDriver.close();
        chromeDriver.getScreenshot();

        RemoteWebDriver firefoxDriver = new FirefoxDriverClass();
        firefoxDriver.navigate();
        firefoxDriver.open();
        firefoxDriver.close();
        firefoxDriver.getScreenshot();

        RemoteWebDriver safariDriver = new SafariDriverClass();
        safariDriver.navigate();
        safariDriver.open();
        safariDriver.close();
        safariDriver.getScreenshot();

    }
}
