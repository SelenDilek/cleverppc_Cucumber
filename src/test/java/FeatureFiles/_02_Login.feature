

Feature:  Login Functionality

  Background:
    Given Navigate to Cleverppc
    When Click on the element in Dialog
      | SingButton |

  Scenario Outline: Clever enter Login


    When Enter email and password  Cleveppc  email as"<email>" password as "<password>"
    And Click on the element in Dialog
      | SubmitLogin |

    Then There is an error
    Examples:
      | email           | password |
      | email@g          | password |
      | email@gmail     |   1234   |

  Scenario Outline: Clever enter Login


    When Enter email and password  Cleveppc  email as"<email>" password as "<password>"
    And Click on the element in Dialog
      | SubmitLogin |

    Then There is an error


    And User sending the keys in Dialog

    Examples:
      | email           | password |
      |                 |          |
      | email@gmail     |   1234   |
      | samfreeman@gamail.com | password |

  Scenario Outline: Clever enter Login

    When Enter email and password  Cleveppc  email as"<email>" password as "<password>"
    And Click on the element in Dialog
      | SubmitLogin |
    Then Home page  login



    Examples:
      | email           | password |
      | samfreeman3452@gmail.com | 12345 |






















