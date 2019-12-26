package Amazon_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Phone_priceam
{   
	@FindBy(xpath="//a[contains(@href,'/Apple-iPhone-XR-64GB-Yellow/dp/')]/span[1]/span[2]")
	private WebElement price;
  
	public Phone_priceam(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public int phonecost()
	{
		    String S = price.getText();
		    String s1 = S.replaceAll("₹","");
		    String s2 = s1.replaceAll(",","");
		   int Amazone_price = Integer.parseInt(s2);
		   return Amazone_price;
	}

}
