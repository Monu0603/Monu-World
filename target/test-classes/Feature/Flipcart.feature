Feature: To validate the Flipcart Booking Module
Background:
Given:Open the browser
  Scenario:To validate the search Functionality
    Given User should oen the broeser and provide URL of Flipcart
    When user has to search the desired product in search bar and click on search
    And user has to check the list of item searched
    Then user has to handle the window after clicking on desired product

  Scenario:To validate the Add to cart functionality
    Given user has to check the Pin for delivery
    When user has to check the number of product selected
    And user has to Click on Add to cart option for all selected product
    And user has to click the cart from home page
    Then user has to click  on continue for shopping

  Scenario:To validate the Login Address and Payment Functionality
    Given user has to provide valid username and password
    When user has to click on the login
    And user has to click on the selected address and click on proceed
    Then user should move on the payment page

   