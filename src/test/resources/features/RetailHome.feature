Feature: Retail Home Page

  @sideBar
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @sideBar2
  Scenario Outline: Verify department sidebar options
    When User click on All section
    And User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department    | optionOne                      | optionTwo                |
      | 'Electronics' | TV & Video                     | Video Games              |
      | 'Computers'   | Accessories                    | Networking               |
      | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
      | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
      | 'Automotive'  | Automative Parts & Accessories | MotorCycle & Powersports |

  @addItem2
  Scenario: Verify User can add an item to cart
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'aisha13@gmail.com' and password 'Aman@12347'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  @placeOrder1
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'aisha13@gmail.com' and password 'Aman@12347'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address information
      | country       | fullName  | phoneNumber | streetAddress | apt | city    | state  | zipCode |
      | United States | Aisha Gul | 07785997384 | Somer Street  | 128 | Fairfox | Alaska |   77662 |
    And User click Add Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill bellow Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 9988776655449922 | Tayeb Moba |              10 |           2025 |          333 |
    And User click on Add card button
    And User click on Place Your Order
    Then a message should be displayed be 'Order Placed, Thanks'

  @placeOrder2
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'aisha13@gmail.com' and password 'Aman@12347'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on the item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should be changed to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed with 'Order Placed, Thanks'
