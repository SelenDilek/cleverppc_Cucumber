Feature: New address functionality

  @Addresses @Regression
  Scenario: User creates a new address

    Given Navigate to Homepage
    When Click on the element in the DialogContent
      | homepageSignInButton |
    And Enter e-mail "alicabbar1234@gmail.com" and password "alicabbar123" then click sign in button
    Then User should login successfully

    When Click on the element in the DialogContent
      | siteMap   |
      | addresses |
    Then User should verify add a new address message
    When Click on the element in the DialogContent
      | addAnewAddressButton |
    Then User should verify fill out form message
    When Click on the element in the DialogContent
      | addressSaveButton |
    Then User gets address error message
    And User sends the keys into the dialog box
      | address1Input | Malkara     |
      | city          | Tekirdag    |
      | postcode      | 59300       |
      | phone_mobile  | 05955959595 |
    And Select state for address in the DialogContent
    When Click on the element in the DialogContent
      | addressSaveButton |