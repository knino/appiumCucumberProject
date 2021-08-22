package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.Activity;

public class BaseClass {
    protected static AppiumDriver<MobileElement> _driver;
    protected static DesiredCapabilities _caps;
    protected static URL _url;
    private static WebDriverWait wait;
    private static Activity activity;

    static {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName","Android");
            caps.setCapability("platformVersion","11");
            caps.setCapability("deviceName","apollo");
            caps.setCapability("automationName","UiAutomator2");
            caps.setCapability("appPackage","com.google.android.gm");
            caps.setCapability("appActivity","com.google.android.gm.ConversationListActivityGmail");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            _caps = caps;
            _url = url;
            AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(_url, _caps);
            _driver = driver;
            wait = new WebDriverWait(driver, 10);
        } catch (Exception e) {
            System.out.println("causado por: "+ e.getCause());
            System.out.println("Mensaje: " + e.getMessage());
        }
    }


    public BaseClass(AppiumDriver<MobileElement> driver){
        BaseClass._driver = _driver;
        }

    public WebElement find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public WebElement findById(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
    }

    public void clickElementByXpath(String locator){
        find(locator).click();
    }

    public void clickElementById(String locator){
        findById(locator).click();
    }

    public boolean checkEnableId(String locator){
        return findById(locator).isEnabled();
    }
    public boolean checkEnableXpath(String locator){
        return find(locator).isEnabled();
    }
    }
