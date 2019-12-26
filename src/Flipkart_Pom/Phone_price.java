package Flipkart_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Phone_price 
{
	@FindBy(xpath="//a[contains(@href,'/apple-iphone-xr-yellow-64-gb')]/div[2]/div[2]/div[1]/div[1]/div[1]")
	private WebElement Price;
	
	public Phone_price(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public int phonecost()
	 {
		String S = Price.getText();
		 String s1 = S.replaceAll("₹","");
		 String s2 = s1.replaceAll(",","");
		  

		int Flipkart_price = Integer.parseInt(s2);
		
		return Flipkart_price;
		
	 }

}
