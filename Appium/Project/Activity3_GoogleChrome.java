package liveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Activity3_GoogleChrome {
    //Driver declaration
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceId","5fafae1f");
        caps.setCapability("platformName","android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("appPackage","com.android.chrome");
        caps.setCapability("appActivity","com.google.android.apps.chrome.Main");
        caps.setCapability("noReset",true);

        //Appium Server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver Initialization
        driver = new AndroidDriver<MobileElement>(serverURL, caps);
        wait = new WebDriverWait(driver, 20);
        // Navigate to the page
        driver.get("https://www.training-support.net/selenium");
    }

    @Test
    public void ToDoList() {
        // wait for page to load
       // driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollForward(4);
      //  MobileElement pageTitle = driver.findElementByClassName("android.widget.TextView");
      //  wait.until(ExpectedConditions.textToBePresentInElement(pageTitle, "To-Do List"));
        // driver.findElementById("To-Do List").click();
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        //driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollIntoView(text(\"To-Do List\"))")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollForward(3).scrollIntoView(new UiSelector().text(\"To-Do List\"))")).click();

        String[] tasks = {"Add tasks to list", "Get number of tasks", "Clear the list"};
        wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.EditText")));

        //List<MobileElement> element1 = (List<MobileElement>) driver.findElementById("taskInput");


      //  MobileElement element = (MobileElement) driver.findElement(By.className("android.widget.EditText"));


        //driver.findElement(By.className("android.widget.EditText")).sendKeys(tasks[1]);
        //driver.findElement(MobileBy.AndroidUIAutomator("resource-id\"taskInput\"")).sendKeys(tasks[1]);
        //driver.findElement(MobileBy.AndroidUIAutomator("text\"Add task\"")).click();
        //driver.findElementByXPath("//@text[contains(text(),\"Add task\"]").click();
        //element.sendKeys(tasks[0]);
         //driver.findElement(By.className("android.widget.Button")).click();
         //driver.findElementsByAndroidUIAutomator(U)

        driver.findElement(By.xpath ("//*[contains(., 'Add Task')]")).click();


        //wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.EditText")));
        //driver.findElement(By.className("android.widget.EditText")).sendKeys(tasks[1]);
        //element.sendKeys(tasks[1]);
        //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText")).sendKeys(tasks[0]);
        //driver.findElement(By.id("taskInput")).sendKeys(tasks[0]);
       // driver.findElement(By.className("android.widget.Button")).click();
        //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText")).sendKeys(tasks[1]);
        //driver.findElement(By.id("taskInput")).sendKeys(tasks[1]);
        //driver.findElement(By.className("android.widget.Button")).click();
        //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText")).sendKeys(tasks[2]);
        //driver.findElement(By.id("taskInput")).sendKeys(tasks[2]);
       // driver.findElement(By.className("android.widget.Button")).click();
       // wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.EditText")));
        //driver.findElement(By.className("android.widget.EditText")).sendKeys(tasks[2]);
        //element.sendKeys(tasks[2]);
       // driver.findElement(By.className("android.widget.Button")).click();


            // Assertion after scrolling
        //Assert.assertEquals(numberOfImages.size(), 4);
    }

 //   @AfterClass
 //   public void afterClass() {
 //       driver.quit();
 //   }
}
