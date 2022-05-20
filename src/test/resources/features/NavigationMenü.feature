@wip
Feature: User should be able to login

#  Feature üzerine etiket koyarsak o classi tümüyle calistirir!!! @wip

  @Developer
  Scenario: Navigating to Developer menü
    Given the user is on login page
    And the user enters teacher credentials
    And   the user sees Welcome text
    When  the user goes to Developers menu
    And   the user should the able to get the header of Developers

  @AllPost
  Scenario: Navigating to All Post menü
    Given the user is on login page
    And the user enters teacher credentials
    And   the user sees Welcome text
    When  the user goes to All Post menu
    And   the user should the able to get the header of Posts


#  @Dashboard
#  database dan alinacak islemler icin buraya bir etiket verip
#  Hooks clasinda before ve after metodlari olusturup method üzerine ayni etiketi yazarak kullaniyoruz.

  @db
  Scenario: Navigating to My Account menü
    Given the user is on login page
    And the user enters teacher credentials
    And   the user sees Welcome text
    When  the user goes to My Account menu
    And   the user should the able to get the header of Dashboard


