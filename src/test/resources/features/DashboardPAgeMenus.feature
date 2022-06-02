Feature: DashboardPage Menus

  Background:
    Given the user is on the login page

@xyz
  Scenario: User should be able ti see the Dashboard menus after logged in as a teacher

    When the user logs in using "eurotech@gmail.com" and "Test12345!"
    Then the user should be able to see following menus
      | Developers |
      | All Posts  |
      | My Account |

  @123
  Scenario: User should be able ti see the Dashboard menus after logged in as a student
#    Given  the user is on the login page
    When the user logs in using "zehra@gmail.com" and "12345#"
    Then the user should be able to see following menus
      | Developers |
      | All Posts  |
      | My Account |


  Scenario: Log in as a spesific user
#    Given the user is on the login page
    When the user logs in using following credentials
      | username | eurotech@gmail.com |
      | password | Test12345!         |
    Then the user should be able to login
    Then the user should be able to see following menus
      | Developers |
      | All Posts  |
      | My Account |


  Scenario: Log in as a spesific user mit Table
#    Given the user is on the login page
    When the user logs in using following credentials
      | username | eurotech@gmail.com |
      | password | Test12345!         |
    Then the user should be able to login
    Then the user should be able to see following menu test
      | Developers | Eurotech |
      | All Posts  | Mustafa  |
      | My Account | Zehra    |
