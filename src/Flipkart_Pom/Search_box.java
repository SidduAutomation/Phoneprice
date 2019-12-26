package Flipkart_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_box 
{
	@FindBy(xpath="//button[.='✕']")
	private WebElement close;
	
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	private WebElement Srchbox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement srchicon;
	
	public Search_box(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
   
	public void clse()
	{
		close.click();
	}
	
	public void Srch(String text)
	{
		Srchbox.sendKeys(text);
	}
	
	public void Srchclick()
	{
		srchicon.click();
	}
	
}
