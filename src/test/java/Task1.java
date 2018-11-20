import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 extends Base{

    public static void main(String[] args) {

        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);

        goToLoginPage(driver);
        login(driver, wait);
        logout(driver);

        driver.quit();

    }
}
