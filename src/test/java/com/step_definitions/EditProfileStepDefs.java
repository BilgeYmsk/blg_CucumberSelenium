package com.step_definitions;

import com.pages.DevelopersPage;
import com.pages.EditProfilePage;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditProfileStepDefs {

    EditProfilePage editProfilePage=new EditProfilePage();
    DevelopersPage developersPage=new DevelopersPage();

    @When("the user navigates to {string}")
    public void the_user_navigates_to(String module) {
        developersPage.navigateToMenu(module);
//        WebElement dashboardModule= Driver.get().findElement(By.xpath("//*[text()='"+module+"']"));
//        dashboardModule.click();
        BrowserUtils.waitFor(2);


    }

    @When("the user select {string} {string}")
    public void the_user_select(String status, String type) {

        editProfilePage.selectModule_Method(status,type); //methodlar page sayfasinda olsun diye asagidaki yazilan metodu page e
        //aktardik ve burada sadece methodu cagirarak burayi sadelestirmis olduk .

//        WebElement selectMenu=Driver.get().findElement(By.xpath("//select[@name='"+status+"']"));
//        Select select=new Select(selectMenu);
//        select.selectByValue(type);
//        BrowserUtils.waitFor(2);



    }

    @When("the user add {string} {string}")
    public void the_user_add(String placeBox, String placeInput) {

        editProfilePage.addInfo_Method(placeBox,placeInput);

        //ayni sekilde asagidaki methoduda page e yolladik

//        WebElement placeHolder=Driver.get().findElement(By.name(placeBox));
//        placeHolder.clear();
//        placeHolder.sendKeys(placeInput);

    }

    @Then("the user enters submit button")
    public void the_user_enters_submit_button() {

        editProfilePage.profilSubmitButton_loc.click();


    }
}
