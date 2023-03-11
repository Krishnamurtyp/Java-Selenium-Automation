package com.simplytesting.jsfw.pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.simplytesting.jsfw.base.TestRun;

public class MenuToolbarPage extends TestRun{
	
		//////////////////////////////////////////////
		//Searchbar
		//////////////////////////////////////////////
		@FindBy(id = "searchtext_freetext_search_form")
		WebElement searchTextbox;
	
		@FindBy(xpath = "//div[contains(text(), \"Search for your dream holiday\")]/..")
		WebElement searchButton;

		//////////////////////////////////////////////
		//Menus
		//////////////////////////////////////////////
		@FindBy(xpath = "//a[contains(text(),'Holiday Types')]")
		WebElement menuHolidayTypes;
		
		@FindBy(xpath = "//a[contains(text(),'Inspiration')]")
		WebElement menuInspiration;
		
		@FindBy(xpath = "//a[contains(text(),'Special Offers')]")
		WebElement menuSpecialOffers;
		
		
		//////////////////////////////////////////////
		//Constructor - initialise elements
		//////////////////////////////////////////////
		public MenuToolbarPage() {
			PageFactory.initElements(driver, this);
		}
		
		public String getHomePageTitle(){
			return driver.getTitle().trim();
		}
		
	
		/////////////////////////////////////////////////////////////////////////////////////
		//Page methods
		/////////////////////////////////////////////////////////////////////////////////////
//		
//		public void clickOnNewContactLink(){
//			Actions action = new Actions(driver);
//			action.moveToElement(contactsLink).build().perform();
//			newContactLink.click();
//			
//		}

		public SearchResultsPage search(String searchString) {
			TestRun.uiWrappers.enterText(searchTextbox, searchString);
			TestRun.uiWrappers.click(searchButton);
			return new SearchResultsPage();
		}
		
}