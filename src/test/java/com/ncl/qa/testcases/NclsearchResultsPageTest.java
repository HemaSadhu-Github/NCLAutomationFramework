package com.ncl.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ncl.qa.base.TestBase;
import com.ncl.qa.pages.NclHomePage;
import com.ncl.qa.pages.NclsearchResultsPage;

public class NclsearchResultsPageTest extends TestBase{
	
	NclHomePage nclHomePage;
	NclsearchResultsPage nclsearchresultpage;
	NclHomePageTest NclHomePagetest;
		
	public NclsearchResultsPageTest(){
		super();
	}
	
	//To initilialize the webdriver and the browser
	@BeforeMethod
	public void setup() {
		initialization();
		nclHomePage=new NclHomePage();
		nclsearchresultpage=new NclsearchResultsPage();
		NclHomePagetest=new NclHomePageTest();
	}
	
	@Test
	public void comparePrices() throws InterruptedException {
		nclHomePage.cruiseSearch();
		String advertisePrice=NclsearchResultsPage.verifyPrices();
		String meta=nclsearchresultpage.viewDatesPricesClick();
		Assert.assertEquals(advertisePrice, meta);
		System.out.println(advertisePrice+' '+meta);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
