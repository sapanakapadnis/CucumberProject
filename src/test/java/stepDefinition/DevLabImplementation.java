package stepDefinition;
import PageObjectModel.FormSmart;
import action.Action;
import PageObjectModel.DevLabLoginPopup;
import PageObjectModel.DevlabHome;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class DevLabImplementation extends Action {

     private WebDriver driver = null;
     public String url = null;


    DevlabHome homePageObj;
    DevLabLoginPopup popUpPageObject;

    FormSmart formpage;

    @Before
    public void setup() throws InterruptedException {
        homePageObj = new DevlabHome();
        popUpPageObject= new DevLabLoginPopup();
        formpage = new FormSmart();
        driver = getDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.devlabsalliance.com/");
        driver.get(readProperties("urlform"));
        Thread.sleep(3000);

        /*
        if((readProperties("applicationname").equals("formsmart"))){
            url = readProperties("urlform");
        }

        if((readProperties("applicationname").equals("devlab"))){
            url = readProperties("url");
        }

        //driver.get(readProperties("urlform"));*/
    }


    @Then("User validate homepage title")
    public void user_validate_homepage_title() {
        String title = driver.getTitle();
        System.out.println(title);

    }

    @Then("User validate devlab logo")
    public void user_validate_devlab_logo() {

        Assert.assertTrue(validateElementPresent(homePageObj.getLogo()));
        validateElementPresent(homePageObj.getLogo());
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        clickButtonsandExplicitWait(homePageObj.getLoginButton(),30);
    }

    @Then("Login pop-up screen displays")
    public void login_pop_up_screen_displays() {


        Assert.assertTrue(validateElementPresent(popUpPageObject.getLoginPageTitle()));
        validateElementPresent(popUpPageObject.getLoginPageTitle());
    }

    @When("user gives input as username and password")
    public void user_gives_input_as_username_and_password() {

        String name = readProperties("email");
        String password =readProperties("password");

        typeInaTextBox(popUpPageObject.addEmail(),name);
        typeInaTextBox(popUpPageObject.addPassword(),password);
    }

    @Then("user close the login pop up")
    public void user_close_the_login_pop_up() throws InterruptedException {
        driver.navigate().refresh();
        Thread.sleep(1000);
        validateElementPresent(homePageObj.getLogo());
    }




    @When("user gives information for form")
    public void user_gives_information_for_form() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        /*String fname = readProperties("fname");
        typeInaTextBox(formpage.firstName(),fname);
        String lname = readProperties("lname");
        typeInaTextBox(formpage.lastName(),lname);*/

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@placeholder='Your first name']")).sendKeys("abc");
        driver.findElement(By.xpath("//input[@placeholder='Your last name']")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@placeholder='Your email address']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//textarea[@placeholder='Your comment']")).sendKeys("This is sample inquiry");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();


    }



    @Then("user clicks on continue button")
    public void user_clicks_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
    }


    @Given("user is on home page for form")
    public void user_is_on_home_page_for_form() {

    }
    @Then("user fills the form with {string},{string},{string},{string}")
    public void user_fills_the_form_with(String fname, String lname, String email, String inq) throws InterruptedException {
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@placeholder='Your first name']")).sendKeys(fname);
        driver.findElement(By.xpath("//input[@placeholder='Your last name']")).sendKeys(lname);
        driver.findElement(By.xpath("//input[@placeholder='Your email address']")).sendKeys(email);
        driver.findElement(By.xpath("//textarea[@placeholder='Your comment']")).sendKeys(inq);
        Thread.sleep(3000);
        driver.switchTo().defaultContent();

    }

    @After
    public void closeBrowser(){
        driver.quit();

    }





}
