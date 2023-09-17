@Register_Login
Feature: Register and Login

  @Login_with_valid_user
  Scenario: Login with valid user
    #Open Url -> Hooks
  Given Open Login Page URL
  When Click on My Account link
    And Input valid email address and password
    And Click on Login button
    Then Verify contact info

  @Register_a_new_user
  Scenario Outline: Register a new user
    Given Log out user
    When Click on My Account link
    And Click on "Create an Account" button
    And Input "firstname" to textbox with value "<First Name>"
    And Input "lastname" to textbox with value "<Last Name>"
    And Input "email_address" to textbox with value "<Email Address>"
    And Input "password" to textbox with value "<Password>"
    And Input "confirmation" to textbox with value "<Password Confirmation>"
    And Click on Register button
    Then Display success message at "success-msg" with content "Thank you for registering with Main Website Store."
  Examples:
    | First Name | Last Name | Email Address            | Password | Password Confirmation |
    | Automation | FC        | AutomationFC@hotmail.com | 123123   | 123123                |