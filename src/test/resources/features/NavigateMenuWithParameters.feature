
Feature: Navigate to menü with Parameters


  Scenario: User navigate to menu
    Given the user is on the login page
    When the user logs in using "eurotech@gmail.com" and "Test12345!"
    Then the user should be able to login
    And the user navigates to "Developers" menu
    Then the user should be able to see header as "Filter Profiles by Skill or by Location"


  Scenario: User navigate to menu
    Given the user is on the login page
    When the user logs in using "eurotech@gmail.com" and "Test12345!"
    Then the user should be able to login
    And the user navigates to "All Posts" menu
    Then the user should be able to see header as "Posts"


  Scenario: User navigate to menu
    Given the user is on the login page
    When the user logs in using "eurotech@gmail.com" and "Test12345!"
    Then the user should be able to login
    And the user navigates to "My Account" menu
    Then the user should be able to see header as "Dashboard"


    Scenario Outline: User navigate to menu outline
      Given the user is on the login page
      When the user logs in using "<userTypes>" and "<password>"
      Then the user should be able to login
      And the user navigates to "<menu>" menu
      Then the user should be able to see header as "<text>"
      Examples:
        |userTypes  |password|menu|text|
      |eurotech@gmail.com|Test12345!|Developers|Filter Profiles by Skill or by Location|
      |eurotech@gmail.com|Test12345!|All Posts|Posts|
      |eurotech@gmail.com|Test12345!|My Account|Dashboard|


