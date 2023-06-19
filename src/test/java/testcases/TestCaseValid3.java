package testcases;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.simple.JSONObject;


public class TestCaseValid3 {
    WebDriver driver = null;

    @BeforeMethod
    public void setUp() throws IOException, ParseException {
        String chromeDriverPath = "C:\\Software\\chromedriver_ver113\\chromedriver.exe";
        String loginDataPath = "src/main/resources/LoginData1.json";
        System.setProperty("webDriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        FileReader fr = new FileReader(loginDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        String url = (String) jsonObject.get("url");
        System.out.println(url);
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void validuser1() throws InterruptedException, IOException, ParseException {
        //try{
        String searchComputerDataPath = "src/main/resources/LoginData1.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("user1");
        String searchText = (String) tc.get("userId");
        String searchText1 = (String) tc.get("password");
        String expectedMessage = "Valid";
        System.out.println("Login Successfull");
        System.out.println(expectedMessage+" user1");
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
    }

    @Test
    public void validuser2() throws InterruptedException, IOException, ParseException {

        String searchComputerDataPath = "src/main/resources/LoginData1.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("user2");
        String searchText = (String) tc.get("userId");
        String searchText1 = (String) tc.get("password");
        String expectedMessage = "Valid";
        System.out.println("Login Successfull");
        System.out.println(expectedMessage + " user2");
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void validuser3() throws InterruptedException, IOException, ParseException {
        //try{
        String searchComputerDataPath = "src/main/resources/LoginData1.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("user3");
        String searchText = (String) tc.get("userId");
        String searchText1 = (String) tc.get("password");
        String expectedMessage = "Valid";
        System.out.println("Login Successfull");
        System.out.println(expectedMessage + " user3");
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void validuser4() throws InterruptedException, IOException, ParseException {
        String searchComputerDataPath = "src/main/resources/LoginData1.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("user4");
        String searchText = (String) tc.get("userId");
        String searchText1 = (String) tc.get("password");
        String expectedMessage = "Valid";
        System.out.println("Login Successfull");
        System.out.println(expectedMessage + " user4");
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void validuser5() throws InterruptedException, IOException, ParseException {
        String searchComputerDataPath = "src/main/resources/LoginData1.json";
        FileReader fr = new FileReader(searchComputerDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject tc = (JSONObject) jsonObject.get("user4");
        String searchText = (String) tc.get("userId");
        String searchText1 = (String) tc.get("password");
        String expectedMessage = "Invalid";
        System.out.println("Login Unsuccessfull");
        System.out.println(expectedMessage + " user5");
        HomePage hp = new HomePage(driver);
        hp.setSearchText(searchText);
        hp.setSearchText1(searchText1);
        hp.clickSearchButton();
        Thread.sleep(5000);
    }
}