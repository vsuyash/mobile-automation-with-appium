Feature: End-to-End Testing of ToneOp Care Page

  Scenario: Navigate through ToneOp Care, add products to cart and wishlist, and verify actions
    Given the user login with valid credentials and is on the ToneOp home page

    When the user taps on the Care button
    Then the user should navigate to the ToneOp Care page

    When the user scrolls down and taps on Add to Cart for the first product
    And the user taps on the Wishlist button
    Then the user verifies if there is any product in the wishlist

    When the user tap back button and taps on the Cart icon from ToneOp Care Page
    Then the user should see the added product in the cart
    When the user taps on the Delete button
    Then a popup should appear with Yes and Cancel options
    When the user taps on Yes
    Then the user should see an empty cart message

    When the user taps on the Back button
    Then the user should navigate back to the ToneOp Care page

    When the user taps on All Products
    And the user taps on Add to Wishlist for the first product
    And the user taps on the Wishlist icon
    Then the user should see the recently added item in the wishlist

    When the user taps on the Cart icon2
    Then the cart should be empty

    When the user taps on the Back button
    Then the user should navigate back to the wishlist page
    When the user taps on the Remove Wishlist button
    Then the wishlist should be empty with a message

    When the user taps on the Back button
    Then the user should navigate back to the marketplace page

    When the user taps on Add to Cart on the first product
    And the user taps on the Back button
    And the user taps on Add to Cart on the first product on another page
    And the user taps on the Cart icon1
    Then the user should see both products added from different pages in the cart
    Then Application is closed