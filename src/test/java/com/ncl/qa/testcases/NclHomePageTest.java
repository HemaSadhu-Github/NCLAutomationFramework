package com.ncl.qa.testcases;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.ncl.qa.base.TestBase;
import com.ncl.qa.pages.NclHomePage;


public class NclHomePageTest extends TestBase{

	NclHomePage NclHomePage;
	Logger log = Logger.getLogger(NclHomePageTest.class);

	public NclHomePageTest(){
		super();
	}
	
	//To initilize the webdriver and browser
	@BeforeMethod
	public void setup() {
		log.info("Starting test cases execution");
		initialization();
		log.info("Initializing web browser");
		NclHomePage=new NclHomePage();
	}
	
	//This code can be used to read data from excel for data driven testing
//	@DataProvider
//	public Object[][] getNclTestData() {
//		Object data[][]=NclTestUtil.getTestData(sheetName);
//		return data;
//		
//	}
	@Test
	public void nclCruiseSearchTest() throws InterruptedException {
		log.info("trying to search for elements");
		NclHomePage.cruiseSearch();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		log.info("Browser is closed");
	}
	
	
}
