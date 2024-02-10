package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class Action {

    public WebDriver driver = null;

    //this method is used to create driver instance headless
    public WebDriver getDriver(){
        driver = new ChromeDriver();
        return driver;
    }

    //this method is used type something in text box
    public boolean typeInaTextBox(By by, String input){
        boolean flag = false;
        try{
            driver.findElement(by).sendKeys(input);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    //method to click buttons/links
    public boolean clickButtonsandImplictWait(By by){
        boolean flag = false;
        try{
            driver.findElement(by).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean clickButtonsandExplicitWait(By by, int time){
        boolean flag = false;
        try{
            driver.findElement(by).click();
            Thread.sleep(time);
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean validateElementPresent(By by){
        boolean flag = false;
        try{
            driver.findElement(by).isDisplayed();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    //method to read properties files
    public String readProperties(String key){
        String flag = null;
        try{
            Properties prop = new Properties();
            prop.load(new FileInputStream(System.getProperty("user.dir")+"/global.properties"));
            flag = prop.getProperty(key);

        }
        catch (Exception e){
            e.printStackTrace();
        }

        return flag;
    }

}
