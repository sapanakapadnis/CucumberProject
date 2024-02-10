package PageObjectModel;

import org.openqa.selenium.By;

public class DevlabHome {

    public By getLogo(){
        return By.xpath("//img[@alt = 'DevLabs Alliance Logo']");
    }

    public By getLoginButton(){
        return By.xpath("//button[@id='header_Button']");
    }

}
