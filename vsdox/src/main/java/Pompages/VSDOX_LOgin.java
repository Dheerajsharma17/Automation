package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VSDOX_LOgin {
	@FindBy(id="PWDAuth")
	 private WebElement internal_radiobutton;
	@FindBy(id="ADAuth")
	private WebElement External_radiobutton;
	@FindBy(name="login_netid")
	private  WebElement Enter_valid_userid;
	@FindBy(name="login_password")
	private WebElement Enter_valid_password;
	@FindBy (name="login_submit")
	private WebElement Login;
	 public VSDOX_LOgin(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	 }
	public void internal() {
		 internal_radiobutton.click();
	}
public void External()
{
	
	}
public void user_id() {
	Enter_valid_userid.sendKeys("admin12345");
	
}
public  void password() {
	Enter_valid_password.sendKeys("DSPACE@1dspace");
	
	
}
public void submit() {
	Login.click();
	
}

}
