package Utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pomRepo.HomePage;
import pomRepo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fUtils = new FileUtility();

	@BeforeSuite
	public void bsConfig() {

		System.out.println("Data base Connection");

	}

//	@BeforeTest
//	public void btConfig() {
//
//		System.out.println("Parallel execution");
//	}

	@BeforeClass
	public void bcConfig() throws IOException {
		
		String url = fUtils.fetchDataFromPropertyFile("url");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Launch the Browser");
		
		driver.get(url);
		System.out.println("Navigate to the URL");
		
		
	}

	@BeforeMethod
	public void bmConfig() throws IOException {
		
		String username = fUtils.fetchDataFromPropertyFile("username");
		String password = fUtils.fetchDataFromPropertyFile("password");

		
		LoginPage login = new LoginPage(driver);
		login.loginAction(username, password);
		
		System.out.println("Login To the Application");
	}

	@AfterMethod
	public void amConfig() {

		HomePage home = new HomePage(driver);
		home.logOutAction();

		System.out.println("Logout from the application");
	}

	@AfterClass
	public void acConfig() {
		driver.quit();
		System.out.println("Close the browser");

	}

//	@AfterTest
//	public void atConfig() {
//
//		System.out.println("Stop the parallel Execution");
//	}

	@AfterSuite
	public void asConfig() {

		System.out.println("Close the Data base");
	}

}
