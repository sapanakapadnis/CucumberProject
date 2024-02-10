package PageObjectModel;

import org.openqa.selenium.By;

public class FormSmart {
    public By firstName(){
        return By.xpath("//input[@id='u_SCn_4607']");
    }

    public By lastName(){
        return By.xpath("//input[@id='u_SCn_338354']");
    }

    public By emailId(){
        return By.xpath("//input[@id='u_SCn_4608']");
    }

    public By selectInq(){
        return By.xpath("//input[@id='u_SCn_338367']");
    }

    public By ind(){
        return By.xpath("//input[@id='u_SCn_4609']");
    }


}
