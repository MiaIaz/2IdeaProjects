package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_5_ScrollPractice {

    @Test
    public void scroll_practice_task1() {
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”
        //WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("Powered by CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        //4- Scroll using Actions class “moveTo(element)” method
/*
        Actions actionsDown = new Actions(Driver.getDriver());
        BrowserUtils.sleep(3);
        actionsDown.moveToElement(cydeoLink);

 */


        //TC #5: Scroll practice 2
        //1- Continue from where the Task 4 is left in the same test.
        //2- Scroll back up to “Home” link using PageUP button


        Actions actionsUp = new Actions(Driver.getDriver());
        BrowserUtils.sleep(3);
        actionsUp.moveToElement(homeLink);



    }
 }
