Feature: Register functionality

  Scenario: Register with valid username and password

    Given Navigate to cleverppc
    When User clicks sign in button
    And Enters a valid email address
    And Clicks on the Create an account button
    And Fill in all mandatory information and click on the register button
    Then The user has been successfully redirected to the system