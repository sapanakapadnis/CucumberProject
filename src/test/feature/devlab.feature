Feature: validate dev lab application

  Scenario: validate devlab homepage header navigation
    Then  User validate homepage title
    And User validate devlab logo
    When User clicks on login button
    Then Login pop-up screen displays
    When user gives input as username and password
    Then user close the login pop up



