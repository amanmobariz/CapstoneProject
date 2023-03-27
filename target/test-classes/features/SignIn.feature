Feature: Retail Sign In feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @signIn
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'aisha13@gmail.com' and password 'Aman@12347'
    And User click on login button
    Then User should be logged in into Account

  @createAccount
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name | email            | password  | confirmPassword |
      | aman | aisha9@gmail.com | Adib@2019 | Adib@2019       |
    And User click on SignUp button
    Then User should be logged into account page
