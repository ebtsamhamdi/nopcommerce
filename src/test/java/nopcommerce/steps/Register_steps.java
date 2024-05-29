package nopcommerce.steps;

import nopcommerce.pages.HomePage;
import nopcommerce.pages.RegisterPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class Register_steps extends Base {
    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod
    public void setUpPages() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test(dataProvider = "registrationData")
    public void register(String gender, String firstName, String lastName, String day, String month, String year, String email, String companyName, String password, String confirmPassword) {
        homePage.registerbutton.click();

        String Actual = driver.getCurrentUrl();
        System.out.println("This is Actual URL= " + Actual);

        if (gender.equals("female")) {
            registerPage.genderfemale.click();
        } else {
            registerPage.gendermale.click();
        }

        registerPage.firstname.sendKeys(firstName);
        registerPage.lastname.sendKeys(lastName);
        registerPage.getBODDay().selectByValue(day);
        registerPage.getBODMonth().selectByValue(month);
        registerPage.getBODYear().selectByValue(year);
        registerPage.email.sendKeys(email);
        registerPage.companyname.sendKeys(companyName);
        registerPage.password.sendKeys(password);
        registerPage.confirmpass.sendKeys(confirmPassword);
        registerPage.Register.click();

        String Expected = driver.getCurrentUrl();
        System.out.println("This is expected URL =" + Expected);

        try {
            Assert.assertNotEquals(Actual, Expected, "The registration process did not proceed to a new page.");
        } catch (AssertionError e) {
            takeScreenshot("failed_registration");
            throw e; // Re-throw the exception to ensure the test fails
        }
    }

    private static AtomicInteger counter = new AtomicInteger(0);

    private void takeScreenshot(String fileName) {
        int count = counter.incrementAndGet();
        String fullFileName = fileName + "_" + count + ".png";

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File("C:\\Users\\ebtsam\\IdeaProjects\\nopcommerce-task\\target\\screenshots\\" + fullFileName));
            System.out.println("Screenshot taken: " + fullFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DataProvider(name = "registrationData")
    public Object[][] getData() throws IOException {
        return CSVdata.readCSV("C:\\Users\\ebtsam\\Desktop\\data.csv");
    }
}
