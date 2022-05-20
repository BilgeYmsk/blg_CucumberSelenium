package com.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NavigationMenuStepDefs {

    @Given("the user sees Welcome text")
    public void the_user_sees_Welcome_text() {
        System.out.println("The user sees Welcome text");
    }

    @Then("the user goes to Developers menu")
    public void the_user_goes_to_Developers_menu() {
        System.out.println("The user goes to Developers menu");
    }

    @Then("the user should the able to get the header of Developers")
    public void the_user_should_the_able_to_get_the_header_of_Developers() {
        System.out.println("The user should the able to get the header of Developers");
    }


    @Then("the user goes to All Post menu")
    public void the_user_goes_to_All_Post_menu() {
        System.out.println("The user goes to All Post menu");
    }

    @Then("the user should the able to get the header of Posts")
    public void the_user_should_the_able_to_get_the_header_of_Posts() {
        System.out.println("The user should the able to get the header of Posts");
    }

    @Then("the user goes to My Account menu")
    public void the_user_goes_to_My_Account_menu() {
        System.out.println("The user goes to My Account menu");
    }

    @Then("the user should the able to get the header of Dashboard")
    public void the_user_should_the_able_to_get_the_header_of_Dashboard() {
        System.out.println("The user should the able to get the header of Dashboard");
    }











}
