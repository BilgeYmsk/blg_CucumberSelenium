Feature: Teacher should be able to Navigate Menu

  @123
  Scenario: Navigate developer menu
    Given the user is on the login page
    When the user enters teacher credentials
    Then the user goes to Developers menu
    And the user should be able to get the text of Developers


  Scenario: navigate to All post
    Given the user is on the login page
    When the user enters teacher credentials
    Then the user goes to Developers menu
    Then the user goes All Posts menu
    And the user should get the text of Posts


  Scenario: Navigate to My account
    Given the user is on the login page
    When the user enters teacher credentials
    Then the user should get the text of welcome
    Then the user goes My Account menu
    And the user should get the text of Dashboard
    #  @Dashboard
#  database dan alinacak islemler icin buraya bir etiket verip
#  Hooks clasinda before ve after metodlari olusturup method üzerine ayni etiketi yazarak kullaniyoruz.
