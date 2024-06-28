package pompackage;

import org.openqa.selenium.By;

public class SignInPagePom {

	private By useridlocator = By.cssSelector("#ap_email_login");
	private By continuelocator = By.cssSelector("#continue");
	private By emailErrormessagelocator = By.cssSelector("#invalid-email-alert > div > div");
	private By phoneErrormessagelocator = By.cssSelector("#invalid-phone-alert > div > div");
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
//	public By getErrormessagelocator() {
//		return Errormessagelocator;
//	}
//	public void setErrormessagelocator(By errormessagelocator) {
//		Errormessagelocator = errormessagelocator;
//	}
	public By getEmailErrormessagelocator() {
		return emailErrormessagelocator;
	}
	public void setEmailErrormessagelocator(By emailErrormessagelocator) {
		this.emailErrormessagelocator = emailErrormessagelocator;
	}
	public By getPhoneErrormessagelocator() {
		return phoneErrormessagelocator;
	}
	public void setPhoneErrormessagelocator(By phoneErrormessagelocator) {
		this.phoneErrormessagelocator = phoneErrormessagelocator;
	}
	
}
