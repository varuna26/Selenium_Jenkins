package Pages;

import org.openqa.selenium.By;

import static Test.Seleniumtest.driver;

public class Home {
    public static String clickMenus= "//*[@id=\"menuToggle\"]/input";
    public static String onlineProdLink="ul#menu a:nth-child(3) li";

    public static void clickMenu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(clickMenus)).click();
    }
    public static void onlineProductSelected() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(onlineProdLink)).click();
    }
}

