Feature: Retail SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @signIn
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'aisha13@gmail.com' and password 'Aman@12345'
    And User click on login button
    Then User should be logged in into Account

  @dryRun @smokeTest @Regression @registerAccount @tc1
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name | email           | password  | confirmPassword |
      | aman | aisha@gmail.com | Adib@2019 | Adib@2019       |
    And User click on SignUp button
    Then User should be logged into account page

  