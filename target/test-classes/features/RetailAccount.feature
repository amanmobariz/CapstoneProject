Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'aisha13@gmail.com' and password 'Aman@12347' 
    And User click on login button
    And User should be logged in into Account

  @updateProfile
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Aisha' and Phone '07766554439'
    And User click on Update button
    Then user profile information should be updated

  @updatePassword
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Aman@12347       | Aman@12348  | Aman@12348      |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully

  @addPayment
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2211334455667780 | Aman Moba  |              10 |           2025 |          466 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  @editPayment
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on master card link
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 9988776655443325 | Sahar Mob  |              12 |           2024 |          323 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @removeDebit
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on master card section
    And User click on remove option of card section
    Then payment details should be removed

  @addAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName    | phoneNumber | streetAddress   | apt | city    | state  | zipCode |
      | United States | Tayeb Mobar | 07785997299 | somerset Garden |  58 | Romford | Alaska |   98765 |
    And User click Add Your Address button
    Then a message should be displayed like 'Address Added Successfully'

  @editAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user update new address form with below information
      | country        | fullName     | phoneNumber | streetAddress | apt | city    | state | zipCode |
      | United Kingdom | Ahmad Mobari | 07785996622 | Stright Road  | 124 | Romford | Luton |   99886 |
    And User click update Your Address button
    Then a message should be displayed such as 'Address Updated Successfully' 

  @removeAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed

    