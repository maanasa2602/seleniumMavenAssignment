package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage1 {
    WebDriver driver = null;

    public HomePage1(WebDriver driver) {
        this.driver = driver;
    }

    public void setSearchText(String value) {
        String Loc = "//*[@id=\"login_field\"]";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.sendKeys(value);
    }

    public void setSearchText1(String value) {
        String Loc = "//*[@id=\"password\"]";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.sendKeys(value);
    }

    public void clickSearchButton() {
        String Loc = "//*[@id=\"login\"]/div[4]/form/div/input[13]";

        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
}