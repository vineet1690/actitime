package HomeModule;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.BaseClass;


public class ToVerifyTheHomePageTitleTest extends BaseClass{
	
	@Test(invocationCount = 1)
	public void toVerifyTheHomePageTitleTest() throws EncryptedDocumentException, IOException 
	{
		String expectedHomepageTitle = fUtils.fetchDataFromExcelSheet("TestData", 1, 0);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(expectedHomepageTitle));
		
		String actualHomePageTitle = driver.getTitle();
		
		Assert.assertTrue(actualHomePageTitle.contains(expectedHomepageTitle));
		System.out.println("The home page title is verified");
		
	}

}
