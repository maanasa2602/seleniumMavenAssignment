
package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;



class TestCasevalid{
    WebDriver driver = null;

    @BeforeMethod
    public void setUp() {
        String url = "https://github.com/login";
        String chromeDriverPath = "C:\\software\\selenium\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("WebDriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}