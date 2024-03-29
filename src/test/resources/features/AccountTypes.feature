Feature: Account Types

  @Failedtest
  Scenario: Teacher User
    Given the user is on the login page
    When the user logs in using "eurotech@gmail.com" and "Test12345!"
    Then the user should be able to login and see message "Eurotech"

  @Failedtest
  Scenario: Student User
    Given the user is on the login page
    When the user logs in using "zehra@gmail.com" and "12345#"
    Then the user should be able to login and see message "zehra"

  @Failedtest
  Scenario: Developer User
    Given the user is on the login page
    When the user logs in using "oyku@gmail.com" and "oyku123!"
    Then the user should be able to login and see message "oyku"


  Scenario: Mentor User
    Given the user is on the login page
    When the user logs in using "havva@outlook.com" and "Havva123!"
    Then the user should be able to login and see message "Havva"

  Scenario Outline: First Outline Test
    Given the user is on the login page
    When the user logs in using "<userType>" and "Havva123!"
    Then the user should be able to login and see message "Havva"
    Examples:
      | userType          |
      | havva@outlook.com |
      | havva@outlook.com |
      | havva@outlook.com |
      | havva@outlook.com |
      | havva@outlook.com |
#    her examples -->bir line bir seneryo aluyor yani excel tabelasini burada olusturmus oluyoruz. 5 kez bu senaryoyu calistirdi

  @wip
  Scenario Outline: DD Account Test "<name>"
    Given the user is on the login page
    When the user logs in using "<userType>" and "<password>"
    Then the user should be able to login and see message "<name>"
    Examples:
      | userType               | password       | name      |
      | eurotech@gmail.com     | Test12345!     | Eurotech  |
      | zehra@gmail.com        | 12345#         | zehra     |
      | havva@outlook.com      | Havva123!      | Havva     |
      | oyku@gmail.com         | oyku123!       | oyku      |
      | kal_osman077@gmail.com | kal_osman1234. | Osman Kal |
      | betbal1994@gmail.com   | betul1994      | Betul     |
      | sdet_blg@gmail.com     | Test1234!      | Blg       |