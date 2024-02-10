package PageObjectModel;

import org.openqa.selenium.By;

import java.security.PublicKey;

public class DevLabLoginPopup {

    public By getLoginPageTitle(){
        return By.xpath("//div/span[2][text()='Login']");
    }

    public By addEmail(){
        return By.xpath("//input[@name='email']");

    }

    public By addPassword(){
        return By.xpath("//input[@name='password']");

    }

}
