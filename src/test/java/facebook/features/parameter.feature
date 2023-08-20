@parameter
Feature: Parameter feature

  @no_param
  Scenario: Doesn't have parameter
    When Input to username textbox
    And Input to password textbox
    And Click on login button

  @have_param_quotation
  Scenario: Have parameter
    When Input username textbox with "automationtestingUI@gmail.com"
    And Input password textbox with "123123"
    And Click on login button

  @multiple_param
  Scenario: Mutilple parameters
    When Input to username with "automationtestingUI@gmail.com" and password with "123123"
    And Click on login button