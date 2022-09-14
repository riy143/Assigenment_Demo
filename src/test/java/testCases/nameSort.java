package testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageObject.Producr_Name;

public class nameSort extends BaseClass {
	
	@Test
	public void productNameSorting() {
		ExtentTest test = extent.createTest("sortong the products name");
		Producr_Name pSort=new Producr_Name(driver);
		test.info("Locate all the products names");
		pSort.ProductsList();
		test.info("select the product name in dropdown");
		pSort.selectProductname();
		test.info("sort the product names in assending order and validate");
		pSort.assendingSorting();
		test.info("sort the product names in decending order and validate");
		pSort.decendingSorting();
		extent.flush();
		
		
	}
	
	
	

}
