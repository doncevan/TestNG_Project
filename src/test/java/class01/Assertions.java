package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assertions {
    public static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void OpenAndLaunchBrowser() {

        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void VerifyTheErrorMessage() {
        WebElement userNameTextBox = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userNameTextBox.sendKeys("Admin");
        WebElement login = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        login.click();

//        get the text
        WebElement errorMsg = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String actualErrorMsg = errorMsg.getText();
        String expectedErrorMsg = "Password cannot be empty";
        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
    }
}

