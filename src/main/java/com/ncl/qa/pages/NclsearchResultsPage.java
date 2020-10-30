package com.ncl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ncl.qa.base.TestBase;
import com.ncl.qa.utilities.NclTestUtil;

public class NclsearchResultsPage extends TestBase{
	
	@FindBy(xpath="//body/main[1]/ul[1]/li[2]/section[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/article[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")
	static	WebElement startPrice;
	
	@FindBy(xpath="//body/main[1]/ul[1]/li[2]/section[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/article[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/a[1]")
	static	WebElement viewPriceDates;
	
	@FindBy(linkText="View Cruise")
	static	WebElement viewCruiseBtn;
	
	@FindBy(xpath="//body/main[1]/ul[1]/li[2]/section[1]/div[1]/div[1]/div[3]/ul[1]/li[2]/article[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/a[1]")
	static
	WebElement metaPrice;
	
	public NclsearchResultsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void viewPricesDates() {
		NclTestUtil.waitForElementsToLoad(viewPriceDates);
		NclTestUtil.nclPageClicks(viewPriceDates);
		return	;
		
	}	
	public void viewCruiseBtnClick() {
		NclTestUtil.waitForElementsToLoad(viewCruiseBtn);
		NclTestUtil.nclPageClicks(viewCruiseBtn);
		return;
		
	}
	public static String verifyPrices() {
		NclTestUtil.waitForElementsToLoad(startPrice);
		String adverPrice=NclTestUtil.nclGetTexts(startPrice);
		return adverPrice;		
		
	}
	
	public String viewDatesPricesClick() {
		NclTestUtil.waitForElementsToLoad(metaPrice);
		String metaprice=NclTestUtil.nclGetTexts(metaPrice);
		return metaprice;
		
		
	}
}
