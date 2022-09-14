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

public class Product_Prize {
	public static WebDriver driver;
	
	List<Integer> priceList;
	
	public Product_Prize(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//span[@class='special-price']/span/span/span[@class='price']")
	List<WebElement> productPrice;
	@FindBy (id="sorter")
	WebElement priceOption;
	@FindBy (xpath="//span[@class='special-price']/span/span/span[@class='price']")
	List<WebElement> AfterFilter;
	
	
	
	public void priceSelect() {
        Select dropdown =new Select(priceOption);
		
		dropdown.selectByVisibleText("Price");;
		
		
	}
	
	public void PriceList() {
		
		priceList = new ArrayList();
		
		for(WebElement b:productPrice) {
			priceList.add(Integer.valueOf(b.getText().replaceAll("[^0-9]","")));
			}
		
	}
	
	public void sortingAsending() {
		Collections.sort(priceList);
		Assert.assertEquals(1700, priceList.get(0));
	}
	public void sortingDecending() {
		Collections.sort(priceList,Collections.reverseOrder());
		Assert.assertEquals(1700, priceList.get(priceList.size()-1));

		
	}
	

}
