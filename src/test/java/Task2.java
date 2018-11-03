import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


/**
 * Created by sergey.kliepikov on 11/2/18.
 */
public class Task2 {

    public static void main(String[] args) {
        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
    //Go to page
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLogin&token=d251f363cceb5a849cb7330938c64dea");

    //Login
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("webinar.test@gmail.com");
        WebElement passwordField = driver.findElement(By.id("passwd"));
        passwordField.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement submitButton = driver.findElement(By.name("submitLogin"));
        submitButton.click();

    //Waiting until login
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("employee_avatar_small")));

    //Checking Dashboard menu
        WebElement dashboardMenu = driver.findElement(By.id("tab-AdminDashboard"));
        dashboardMenu.click();
        WebElement dashboardMenuTitle = driver.findElement(By.className("page-title"));
        System.out.println(dashboardMenuTitle.getText());
        driver.navigate().refresh();
        WebElement dashboardMenuBreadcrumb = driver.findElement(By.className("breadcrumb-current"));
        Assert.assertEquals(dashboardMenuBreadcrumb.getText(),"Dashboard");

    //Checking Orders menu
        WebElement ordersMenu = driver.findElement(By.id("subtab-AdminParentOrders"));
        ordersMenu.click();
        WebElement ordersMenuTitle = driver.findElement(By.className("page-title"));
        System.out.println(ordersMenuTitle.getText());
        driver.navigate().refresh();
        WebElement ordersMenuBreadcrumb = driver.findElement(By.className("breadcrumb-container"));
        Assert.assertEquals(ordersMenuBreadcrumb.getText(),"Заказы");

    //Checking Catalog menu
        WebElement catalogMenu = driver.findElement(By.id("subtab-AdminCatalog"));
        catalogMenu.click();
        WebElement catalogMenuTitle = driver.findElement(By.cssSelector("h2.title"));
        System.out.println(catalogMenuTitle.getText());
        driver.navigate().refresh();
        WebElement catalogMenuBreadcrumb = driver.findElement(By.xpath("//ol[@class='breadcrumb']/li[2]"));
        Assert.assertEquals(catalogMenuBreadcrumb.getText(),"товары");

    //Checking Clients menu
        WebElement clientsMenu = driver.findElement(By.xpath("//ul[@class='main-menu']/li[5]"));
        clientsMenu.click();
        WebElement clientsMenuTitle = driver.findElement(By.className("page-title"));
        System.out.println(clientsMenuTitle.getText());
        driver.navigate().refresh();
        WebElement clientsMenuBreadcrumb = driver.findElement(By.className("page-breadcrumb"));
        Assert.assertEquals(clientsMenuBreadcrumb.getText(),"Клиенты");

    //Checking Support menu
        WebElement supportMenu = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
        supportMenu.click();
        WebElement supportMenuTitle = driver.findElement(By.className("page-title"));
        System.out.println(supportMenuTitle.getText());
        driver.navigate().refresh();
        WebElement supportMenuBreadcrumb = driver.findElement(By.className("breadcrumb-current"));
        Assert.assertEquals(supportMenuBreadcrumb.getText(),"Customer Service");

    //Checking Statistics menu
        WebElement statsMenu = driver.findElement(By.id("subtab-AdminStats"));
        statsMenu.click();
        WebElement statsMenuTitle = driver.findElement(By.className("page-title"));
        System.out.println(statsMenuTitle.getText());
        driver.navigate().refresh();
        WebElement statsMenuBreadcrumb = driver.findElement(By.className("breadcrumb-current"));
        Assert.assertEquals(statsMenuBreadcrumb.getText(),"Статистика");

    //Checking Modules menu
        WebElement modulesMenu = driver.findElement(By.id("subtab-AdminParentModulesSf"));
        modulesMenu.click();
        WebElement modulesMenuTitle = driver.findElement(By.cssSelector("h2.title"));
        System.out.println(modulesMenuTitle.getText());
        driver.navigate().refresh();
        WebElement modulesMenuBreadcrumb = driver.findElement(By.className("breadcrumb"));
        Assert.assertEquals(modulesMenuBreadcrumb.getText(),"Modules");

    //Checking Design menu
        WebElement designMenu = driver.findElement(By.xpath("//ul[@class='main-menu']/li[10]"));
        designMenu.click();
        WebElement designMenuTitle = driver.findElement(By.className("page-title"));
        System.out.println(designMenuTitle.getText());
        driver.navigate().refresh();
        WebElement designMenuBreadcrumb = driver.findElement(By.className("breadcrumb-current"));
        Assert.assertEquals(designMenuBreadcrumb.getText(),"Шаблоны");

    //Checking Delivery menu
        WebElement deliveryMenu = driver.findElement(By.id("subtab-AdminParentShipping"));
        deliveryMenu.click();
        WebElement deliveryMenuTitle = driver.findElement(By.className("page-title"));
        System.out.println(deliveryMenuTitle.getText());
        driver.navigate().refresh();
        WebElement deliveryMenuBreadcrumb = driver.findElement(By.className("breadcrumb-current"));
        Assert.assertEquals(deliveryMenuBreadcrumb.getText(),"Курьеры");

    //Checking Payment menu
        WebElement paymentMenu = driver.findElement(By.id("subtab-AdminParentPayment"));
        paymentMenu.click();
        WebElement paymentMenuTitle = driver.findElement(By.className("page-title"));
        System.out.println(paymentMenuTitle.getText());
        driver.navigate().refresh();
        WebElement paymentMenuBreadcrumb = driver.findElement(By.className("breadcrumb-current"));
        Assert.assertEquals(paymentMenuBreadcrumb.getText(),"Payment Methods");

    //Checking International menu
        WebElement internationalMenu = driver.findElement(By.id("subtab-AdminInternational"));
        internationalMenu.click();
        WebElement internationalMenuTitle = driver.findElement(By.className("page-title"));
        System.out.println(internationalMenuTitle.getText());
        driver.navigate().refresh();
        WebElement internationalMenuBreadcrumb = driver.findElement(By.className("breadcrumb-container"));
        Assert.assertEquals(internationalMenuBreadcrumb.getText(),"Локализация");

    //Checking Shop Parameters menu
        WebElement shopParametersMenu = driver.findElement(By.id("subtab-ShopParameters"));
        shopParametersMenu.click();
        WebElement shopParametersMenuTitle = driver.findElement(By.className("page-title"));
        System.out.println(shopParametersMenuTitle.getText());
        driver.navigate().refresh();
        WebElement shopParametersMenuBreadcrumb = driver.findElement(By.className("breadcrumb-current"));
        Assert.assertEquals(shopParametersMenuBreadcrumb.getText(),"General");

    //Checking Configuration menu
        WebElement configMenu = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
        configMenu.click();
        WebElement configMenuTitle = driver.findElement(By.className("page-title"));
        System.out.println(configMenuTitle.getText());
        driver.navigate().refresh();
        WebElement configMenuTitleBreadcrumb = driver.findElement(By.className("breadcrumb-current"));
        Assert.assertEquals(configMenuTitleBreadcrumb.getText(),"Information");

        driver.quit();

    }

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resources//chromedriver");
        return new ChromeDriver();
    }
}
