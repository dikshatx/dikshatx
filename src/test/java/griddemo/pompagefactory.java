package griddemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pompagefactory {

    @FindBy(name = "email")
    WebElement username;

    @FindBy(name = "password")
    WebElement pwd;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement Loginbutton;

    public void enterusername(String uname)
    {
        username.sendKeys(uname);
    }
    public void enterpassword(String password)
    {
        pwd.sendKeys(password);
    }
    public void Loginbutton()
    {
Loginbutton.click();
    }
}
