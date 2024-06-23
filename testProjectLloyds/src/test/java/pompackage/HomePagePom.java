package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePom {
	
//	private WebDriver driver;
//	
	//ByLocators
	
	private By logoLocator = By.cssSelector("#nav-logo-sprites");
	private By SignInSpanLocator = By.cssSelector("#nav-link-accountList-nav-line-1");
	private By Defaultlanglocator = By.cssSelector("#icp-nav-flyout > span > span.nav-line-2 > div");
	
	
	
	//Constructor
//	public HomePagePom(WebDriver driver) {
//		this.driver = driver;
//	}



	public By getLogoLocator() {
		return logoLocator;
	}



	public void setLogoLocator(By logoLocator) {
		this.logoLocator = logoLocator;
	}



	public By getSignInSpanLocator() {
		return SignInSpanLocator;
	}



	public void setSignInSpanLocator(By signInSpanLocator) {
		SignInSpanLocator = signInSpanLocator;
	}



	public By getDefaultlanglocator() {
		return Defaultlanglocator;
	}



	public void setDefaultlanglocatopr(By defaultlanglocator) {
		Defaultlanglocator = defaultlanglocator;
	}
	
	
	
	
	
	

}
