@test
Feature: Facebook login page

  @no_param
  Scenario: Scenatio doesn't have parameter
    Given Open facebook application
    When Input to username textbox with
    And Input to password textbox with
    And Click on login button
    And Close application

  @have_param_quotation
  Scenario: Scenario have parameter
    Given Open facebook application
    When Input to username textbox with "automationtestingUI@gmail.com"
    And Input to password textbox with "123123"
    And Click on login button
    And Close application

  @have_param_no_quotation
  Scenario: Scenario have parameter
    Given Open facebook application
    When Input to username textbox with automationtestingUI@gmail.com
    And Input to password textbox with 123123
    And Click on login button
    And Close application

  @multiple_param
  Scenario: Scenario have parameter
    Given Open facebook application
    When Input to username with "automationtestingUI@gmail.com" and password with "123123"
    And Click on login button
    And Close application

  @datatable_step
  Scenario Outline: Create new customer with username <username>
    Given Open facebook application
    When Input to username and username
      | username   | password   | address   |
      | <username> | <password> | <address> |
    And Click on login button
    Then Verify submitted infor displayed
      | username   | address   |
      | <username> | <address> |
    And Close application
    Examples:
      | username                      | password | address |
      | automationtestingUI@gmail.com | 123123   | le loi  |