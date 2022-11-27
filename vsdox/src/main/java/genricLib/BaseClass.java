package genricLib;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public PropertyFille pdata = new PropertyFille();
	public WebDriverUtilies driverutilies=new WebDriverUtilies();

	@BeforeMethod
	public void openApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getdata("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException {
		int status = res.getStatus();
		String name = res.getName();
		
		if(status==2) {
			Screenshot p=new Screenshot();
			p.getPhoto(driver, name);
		}

		driver.quit();
	}

}
