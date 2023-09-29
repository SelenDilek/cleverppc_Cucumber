Feature: Contact Us functionality

  @Contact @Support @Regression
  Scenario: User sends a file to the company from contact us link

    Given Navigate to Homepage
    When Click on the element in the DialogContent
      | contactUsButton |
    Then User should verify contact-us message
    And Select as "Customer service" from the Subject Heading dropbox
    And Sends email as "alicabbar1234@gmail.com" and order reference as "PKNJRYSGL" and message as "Banka havalesi henüz yapýldý, ödeme dekontu ektedir. Ali Cabbar"
    When Click on the element in the DialogContent
      | chooseFileButton |
    And Attach a file
    When Click on the element in the DialogContent
      | sendButton |
    Then User should verify message has been successfully sent