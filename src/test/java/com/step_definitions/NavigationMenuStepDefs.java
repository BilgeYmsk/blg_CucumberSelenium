package com.step_definitions;

import com.pages.DashboardPage;
import com.pages.DevelopersPage;
import com.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @Then("the user should get the text of welcome")
    public void the_user_should_get_the_text_of_welcome() {
        System.out.println("the user should get the text of welcome");

    }
    @Then("the user goes to Developers menu")
    public void the_click_My_Account_menu() {
        new DashboardPage().developers.click();

    }
    @And("the user should get the text of Dashboard")
    public void the_user_should_get_the_text_of_Dashboard() {
        System.out.println("the user should get the text of Dashboard");
    }
    @Then("the user should be able to get the text of Developers")
    public void the_user_should_be_able_to_get_the_text_of_Developers() {
        String expectedText="Filter Profiles by Skill or by Location";
        String actualText=new DevelopersPage().developersHead.getText();
        System.out.println("User can see the header");
        //BrowserUtils.verifyElementDisplayed(new DevelopersPage().developersHead);
        Assert.assertEquals(expectedText,actualText);
    }

    @When("the user goes All Posts menu")
    public void the_user_goes_All_Posts_menu() {
        System.out.println("the user goes All Posts menu");
    }
    @Then("the user should be able get the text of Posts")
    public void the_user_should_get_the_text_of_Posts() {
        System.out.println("the user should be able get the text of Posts");
    }
    @Then("the user goes My Account menu")
    public void the_goes_My_Account_menu() {
        System.out.println("the goes My Account menu");
    }
    @Then("the user should get the text of Posts")
    public void the_user_should_get_the_text_of_Posts1() {
        System.out.println("the user should get the text of Posts");
    }

    @And("the user navigates to {string} menu")
    public void theUserNavigatesToMenu(String menuType) {
        BrowserUtils.waitFor(2);
        new DevelopersPage().navigateToMenu(menuType);
    }

    @Then("the user should be able to see header as {string}")
    public void theUserShouldBeAbleToSeeHeaderAs(String headerText) {
        BrowserUtils.waitFor(2);
        String actualText=new DevelopersPage().getHeadText(headerText);
        Assert.assertEquals(headerText,actualText);
    }
}