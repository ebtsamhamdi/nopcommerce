package nopcommerce.pages;

import nopcommerce.steps.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Base{
    public RegisterPage(){
        PageFactory.initElements(Base.driver,this);
    }

    @FindBy(id = "gender-female")
    public WebElement genderfemale;

    @FindBy(id = "gender-male")
    public WebElement gendermale;

    @FindBy(id = "FirstName")
    public WebElement firstname;

    @FindBy(id = "LastName")
    public WebElement lastname;

    public Select getBODDay() {
        return new Select(driver.findElement(By.name("DateOfBirthDay")));
    }

    public Select getBODMonth() {
        return new Select(driver.findElement(By.name("DateOfBirthMonth")));
    }

    public Select getBODYear() {
        return new Select(driver.findElement(By.name("DateOfBirthYear")));
    }

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Company")
    public WebElement companyname;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmpass;

    @FindBy(id = "register-button")
    public WebElement Register;
}
