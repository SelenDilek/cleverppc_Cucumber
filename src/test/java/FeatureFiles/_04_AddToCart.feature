Feature: Add to cart functionality

  @Cart @Smoke @Regression
  Scenario: User randomly adds one of the summer dresses into the cart

    Given Navigate to Homepage
    When Click on the element in the DialogContent
      | homepageSignInButton |
    And Enter e-mail "alicabbar1234@gmail.com" and password "alicabbar123" then click sign in button
    Then User should login successfully

    When Click on the element in the DialogContent
      | womenButton   |
      | dressesbutton |
      | summerDressesButton |
    Then User should verify summer dresses message
    And User randomly mouseover one of the products and clicks add to cart button
    Then User gets product successfully added to your shopping cart message