Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'aisha13@gmail.com' and password 'Aman@12345'
    And User click on login button
    And User should be logged in into Account

  @update
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Aman' and Phone '07788000000'
    And User click on Update button
    Then user profile information should be updated

  @newPass, @update
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Aman@12344       | Aman@12341  | Aman@12341      |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully

  @addPay
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2211334455667788 | Aman Moba  |              10 |           2025 |          444 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully

  @editePay
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on master card link
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 9988776655443322 | Sahar Mob  |              12 |           2024 |          333 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully

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
      | United States | Tayeb Mobar | 07785997299 | somerset Garden |  53 | Romford | Alaska |   98765 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully

  @updateAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user update new address form with below information
      | country        | fullName     | phoneNumber | streetAddress | apt | city    | state | zipCode |
      | United Kingdom | Ahmad Mobari | 07785996622 | Stright Road  | 124 | Romford | Luton |   99886 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully

  @removeAdd
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed

    