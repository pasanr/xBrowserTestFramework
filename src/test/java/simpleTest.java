import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class simpleTest {
    WebDriver driver;

//    https://www.guru99.com/cross-browser-testing-using-selenium.html
    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws Exception {
        if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else {
            throw new Exception("Browser is not correctly configured");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
    }

    @Test
    public void testAd() throws Exception {
//        driver.get("https://selfcare.hsenidmobile.com/prepaid-admin/");
        driver.get("https://www.google.com/");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
