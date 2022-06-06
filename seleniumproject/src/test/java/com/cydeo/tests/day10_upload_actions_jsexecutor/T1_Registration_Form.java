package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_test() {


        //1. Open browser
        //2. Go to website:https://practice.cydeo.com/registration_form
        //Driver.getDriver() --> driver
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));


        //Create JavaFaker object
        Faker faker = new Faker();

        //3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());


        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());


        //5. Enter username
        WebElement inputUserName= Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //inputUserName.sendKeys(faker.name().username().replaceAll(".", ""));
        String user = faker.bothify("helpdesk####");
        inputUserName.sendKeys(user);

        //6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name=\"email\"]"));
        inputEmail.sendKeys(user + "@email.com");

        //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name=\"password\"]"));
        inputPassword.sendKeys(faker.numerify("########"));

        //8. Enter phone number
        WebElement inputPhone = Driver.getDriver().findElement(By.xpath("//input[@name=\"phone\"]"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));


        //9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        //10.Enter date of birth
        WebElement inputBirthday= Driver.getDriver().findElement(By.xpath("//input[@name=\"birthday\"]"));
        //faker.number().numberBetween(1,31);
        inputBirthday.sendKeys("08/01/1989");

        //11.Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name=\"department\"]")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

        //12.Select Job Title
        WebElement jobTitle =   Driver.getDriver().findElement(By.xpath("//select[@name='job_title']"));
        Select dropdown2 = new Select(jobTitle);
        dropdown2.selectByVisibleText("QA");

        //13.Select programming language from checkboxes
        WebElement dropdownProgramLanguage = Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        dropdownProgramLanguage.click();

        //14.Click to sign up button
        WebElement signInButton = Driver.getDriver().findElement(By.id("wooden_spoon"));
        signInButton.click();
        BrowserUtils.sleep(3);

        //15.Verify success message “You’ve successfully completed registration.” is
        //displayed.
        String actual = Driver.getDriver().findElement(By.tagName("p")).getText();
        String expected="You've successfully completed registration!";
        Assert.assertEquals(actual,expected,"actual and expected did not match");




    }

}
