package Test;

import Pages.Home;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Seleniumtest {
    public static WebDriver driver;

    static ExtentReports reports;
    static ExtentTest test;
    static ExtentReports extent=new ExtentReports();


    @BeforeTest
    public static void setup()
    {
        driver =new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        ExtentSparkReporter spark=new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);

    }
    @Test
    void validateOnlineProductPage() throws InterruptedException {
        test=extent.createTest("URL OPENS","Validate URL OPEN");
        Thread.sleep(2000);
        Home.clickMenu();
        Home.onlineProductSelected();
        extent.flush();
    }
}
