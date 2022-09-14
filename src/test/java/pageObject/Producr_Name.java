package pageObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Producr_Name {
	public static WebDriver driver;
	 List<String> productNames;
	 List<String> afterfiltername;
	
	public Producr_Name(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div/strong/a[@class='product-item-link']")
	List<WebElement> ProductList;
	@FindBy (id="sorter")
	WebElement productname;
	@FindBy (xpath="//div/strong/a[@class='product-item-link']")
	List<WebElement> AfterFilter;
	
	
	
	public void ProductsList() {
		
		  productNames = new ArrayList();
		
		for (WebElement a : ProductList) {
			productNames.add(String.valueOf(a.getText()));

		}
		}
	public void selectProductname() {
		Select dropdown=new Select(productname);
		dropdown.selectByVisibleText("Product Name");
		
	}
	
	public void assendingSorting() {
		
		Collections.sort(productNames);
		Assert.assertEquals("Back-UPS Pro External Battery Pack 24V",productNames.get(productNames.size()-1));
		
	
		
	}
	
	public void decendingSorting() {
		Collections.sort(productNames,Collections.reverseOrder());
		Assert.assertEquals("Back-UPS Pro External Battery Pack 24V",productNames.get(0));
		
	}

	
	
	
	
	
	

}
