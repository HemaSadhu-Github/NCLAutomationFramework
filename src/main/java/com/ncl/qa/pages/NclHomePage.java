package com.ncl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ncl.qa.base.TestBase;
import com.ncl.qa.utilities.NclTestUtil;

public class NclHomePage extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),'Destination')]")
	WebElement destCityClick;
	
	@FindBy(xpath="//span[contains(text(),'Alaska Cruises')]")
	WebElement selectDestCity;
	
	@FindBy(xpath="//a[contains(text(),'Apply')]")
	WebElement cityApplyBtn;
	
	@FindBy(xpath="//span[contains(text(),'Dates')]")
	WebElement dateClick;
	
	@FindBy(xpath="//body/main[1]/section[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")
	WebElement dateApplyBtn;
	
	@FindBy(xpath="//body[1]/main[1]/section[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[2]/ul[1]/li[4]")
	WebElement month;

	@FindBy(xpath="//a[contains(text(),'Find a Cruise')]")
	WebElement findCruiseBtn;
	
	public NclHomePage() {
		PageFactory.initElements(driver, this);		
	}
	
	public NclsearchResultsPage cruiseSearch() {		
	
		NclTestUtil.nclPageClicks(destCityClick);
		NclTestUtil.nclPageClicks(selectDestCity);
		NclTestUtil.nclPageClicks(cityApplyBtn);		
		NclTestUtil.nclPageClicks(dateClick);
		NclTestUtil.nclPageClicks(month);
		NclTestUtil.waitForElementsToLoad(dateApplyBtn);
		NclTestUtil.nclPageClicks(dateApplyBtn);
		NclTestUtil.waitForElementsToLoad(findCruiseBtn);
		NclTestUtil.nclPageClicks(findCruiseBtn);
		
		return new NclsearchResultsPage();
	}

}
