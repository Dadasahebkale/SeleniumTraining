package com.dk.basetest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.bymatautomation.seleniumtraining.DataCollection;
import com.bymatautomation.seleniumtraining.ExcelReader;
import com.dk.Xls_Reader;
import com.dk.pages.HomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Wait<WebDriver> f_wait;
	public static ExcelReader excel;
	public static ExtentReports reports;
	public static ExtentTest test;
	public static Properties Config;    
	public static FileInputStream fis;
	public static String testCaseName;
	public static Hashtable<String, String> run_mode=new Hashtable<>();
	public static HomePage hp;         

@BeforeSuite

public void setUP() {

try {
	fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyFiles\\Config.properties");
	
}catch(Exception e) {
	e.printStackTrace();
	e.getMessage();
}
Config=new Properties();
try {
	Config.load(fis);
}catch(Exception e) {
	e.printStackTrace();
	e.getMessage();
}
System.out.println("Config file has been loaded");
excel=new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\Master_Sheet.xlsx");
String timeStamp=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
reports=new ExtentReports(System.getProperty("user.dir")+"\\src\\test\\resources\\executionReports\\ExtentReport_"+timeStamp+".html");



}
public static void getDriver() {
	if(Config.getProperty("browser").equalsIgnoreCase("chrome")) {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(ops);
	}else if(Config.getProperty("browser").equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}else if(Config.getProperty("browser").equalsIgnoreCase("ff")) {
		WebDriverManager.firefoxdriver();
		driver=new FirefoxDriver();
	}else {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get(Config.getProperty("app_url_test"));
	test=reports.startTest(testCaseName);
	
	System.out.println("User Navigate to "+Config.getProperty("app_url_test")+" Url");
	
	test.log(LogStatus.INFO, "User Navigate to "+Config.getProperty("app_url_test")+" URL");
	hp=new HomePage();
}
public static void tearDown() {
	try {
		Thread.sleep(2000);
		driver.quit();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
    public static void ScreenShot(){

	String timeStamp=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
	File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String screenShotPath=System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\ScreenShot_"+timeStamp+".png";
	File destfile=new File(screenShotPath);
	try {
		FileHandler.copy(scrfile,destfile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		test.log(LogStatus.FAIL,test.addScreenCapture(screenShotPath));
	}
    
    @DataProvider
    public Object[][] data_Collection(){
        DataCollection dc=new DataCollection(excel,"Test_Data",testCaseName);
                return dc.dataArray();
    }
    
	@AfterSuite
	public void endTest() {
		reports.endTest(test);
		reports.flush();
	}
	public void excel() {
		Xls_Reader xl=new Xls_Reader("D:\\TestingFramework\\FrameWork\\src\\test\\resources\\testData\\Practice.xlsx");
		System.out.println(xl.addSheet("dk"));
		
	}
	
	
	
	
}