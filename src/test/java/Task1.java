import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by sergey.kliepikov on 11/2/18.
 */
public class Task1 {

    public static void main(String[] args) {
        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLogin&token=d251f363cceb5a849cb7330938c64dea");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("webinar.test@gmail.com");
        WebElement passwordField = driver.findElement(By.id("passwd"));
        passwordField.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement submitButton = driver.findElement(By.name("submitLogin"));
        submitButton.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("employee_avatar_small")));

        WebElement employeeProfile = driver.findElement(By.className("employee_avatar_small"));
        employeeProfile.click();
        WebElement logout = driver.findElement(By.id("header_logout"));
        logout.click();

    }

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resources//chromedriver");
        return new ChromeDriver();
    }
}
