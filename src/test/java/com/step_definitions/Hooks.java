package com.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before
    public void setup(){

        System.out.println("----This Statement comes from BEFORE----");
    }

    @After
    public void tearDown(){

        System.out.println("----This Statement comes from AFTER----");
    }

    @Before ("@db") //before ve after metodlari olusturup yanina yazilan etiketlerde
    //o etiketlere sahip test senaryolari öncesinde ve sonrasinda calisiyor!!
    public void setupDb(){

        System.out.println("*** - Connecting to Database - ***");
    }

    @After ("@db")
    public void closeDb(){

        System.out.println("*** - Disconnecting to Database - ***");

    }

}
