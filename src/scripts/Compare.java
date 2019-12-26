package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Amazon_Pom.Phone_priceam;
import Amazon_Pom.Search_boxam;
import Flipkart_Pom.Phone_price;
import Flipkart_Pom.Search_box;

public class Compare implements generic.Auto_const
{
	public WebDriver driver;
	@Test
	public void compare_price()
	{
		System.setProperty(Gecko_key,Gecko_value);
	  	driver=new FirefoxDriver();
	  
	  	//Amazon Application
	  	driver.get("https://www.amazon.in");
	  	driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  	
	  	Search_boxam a=new Search_boxam(driver);
	  	
	  	a.Search("iPhone XR(64GB)-Yellow");
	  	
	  	a.srcicon();
	  	
	  	Phone_priceam p=new Phone_priceam(driver);
	  	
	  	//It will get "iPhone XR(64GB)-Yellow" PhoneCost in Amazon application
	  	int Amazon_Price = p.phonecost();
	  	
	  	System.out.println(Amazon_Price);
	  	
	  	//Flipkart Application
	  	driver.get("https://www.flipkart.com/");
	  	driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  	
	  	Search_box b=new Search_box(driver);
	  	b.clse();
	  	
	  	b.Srch("iPhone XR(64GB)-Yellow");
	  	b.Srchclick();
	  	
	  	Phone_price q=new Phone_price(driver);

	  	//It will get "iPhone XR(64GB)-Yellow" PhoneCost in Flipkart application
	  	int Flipkart_Price = q.phonecost();
	  	
		System.out.println(Flipkart_Price);
	  	
	  	if(Amazon_Price>Flipkart_Price)
	  	{
	  		Reporter.log("Flipkart has lessar value for iphone xr(64GB)-Yellow than Amazon",true);
	  	}
	  	else
	  	{
	  		Reporter.log("Amazon has lessar value for iphone xr(64GB)-Yellow than Flipkart",true);
	  	}
	  	
	}

}
