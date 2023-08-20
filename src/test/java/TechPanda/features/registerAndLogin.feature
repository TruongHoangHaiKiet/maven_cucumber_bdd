Feature: Register and Login

  @Register_and_Login
  Scenario: Register to system and login
    #Open Url -> Hooks
  Given Open Login Page URL
  When Click on My Account link
    And Input valid email address and password
    And Click on Login button
    Then Verify contact info