package testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageObject.Producr_Name;
import pageObject.Product_Prize;

public class priceSort extends BaseClass {
	@Test
	public void priceSorting() {
	 ExtentTest test = extent.createTest("sorting the products prices");
	Product_Prize priSort = new Product_Prize(driver);
	test.info("Select the price option in dropdown");
	priSort.priceSelect();
	test.info("store the all product prices in one variable");
	priSort.PriceList();
	test.info("sorting the prices in assending order and validate");
	priSort.sortingAsending();
	test.info("sorting the prices in decending order and validate");
	priSort.sortingDecending();
	
	

	}
	

	

}
