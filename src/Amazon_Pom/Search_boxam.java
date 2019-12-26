package Amazon_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_boxam
{
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement Srchbx;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement srchicon;
	
	
	
	public Search_boxam(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Search(String text)
	{
		Srchbx.sendKeys(text);
	}
    public void srcicon()
    {
    	srchicon.click();
    }
    
    
}
