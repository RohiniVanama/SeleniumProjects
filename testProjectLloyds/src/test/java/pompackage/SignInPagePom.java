package pompackage;

import org.openqa.selenium.By;

public class SignInPagePom {

	private By useridlocator = By.cssSelector("#ap_email");
	private By continuelocator = By.cssSelector("#continue");
	private By Errormessagelocator = By.cssSelector("#auth-error-message-box > div > div > ul > li > span");
	public By getUseridlocator() {
		return useridlocator;
	}
	public void setUseridlocator(By useridlocator) {
		this.useridlocator = useridlocator;
	}
	public By getContinuelocator() {
		return continuelocator;
	}
	public void setContinuelocator(By continuelocator) {
		this.continuelocator = continuelocator;
	}
	public By getErrormessagelocator() {
		return Errormessagelocator;
	}
	public void setErrormessagelocator(By errormessagelocator) {
		Errormessagelocator = errormessagelocator;
	}
	
}
