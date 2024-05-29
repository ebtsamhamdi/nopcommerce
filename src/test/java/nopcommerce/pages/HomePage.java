package nopcommerce.pages;

import nopcommerce.steps.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
    public HomePage (){
        PageFactory.initElements(Base.driver,this);
    }

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    public WebElement registerbutton;

}
