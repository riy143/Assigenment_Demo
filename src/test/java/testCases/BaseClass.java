package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
public static   ExtentReports extent;
public  static ExtentSparkReporter reporter;
//public static ExtentTest  test;
	
	@BeforeSuite
	
	public void browser_intilazation() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://shop.schneider-electric.co.in/shop-by-category/ups-and-stabilizers.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		reporter = new ExtentSparkReporter(".//Report//Scheneider_electic.html");
		reporter.config().setReportName("Sorting verify");
		reporter.config().setDocumentTitle("Scheneider_electic eccomerce");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		
		
		
	}
	
	
		
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
		extent.flush();
		
	}
	
	
	
}
