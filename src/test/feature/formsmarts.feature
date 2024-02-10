Feature: add value to form
  @regression
  Scenario: add values in the form
    When user gives information for form
    Then user clicks on continue button


  @smoke
  Scenario Outline: add values in the form
      Given user is on home page for form
      Then user fills the form with "<firstname>","<lastname>","<email>","<inquiry>"
      Examples:
      |firstname|lastname|email|inquiry|
      |sara|k|acwe@gmail.com|xyz|
      |sara|B|abcd@gmail.com|xyz|
      |sara|M|abck@gmail.com|xyz|
      |sara|J|abcl@gmail.com|xyz|
      |sara|E|abcm@gmail.com|xyz|
      |sara|F|abcu@gmail.com|xyz|
      |sara|Y|abcf@gmail.com|xyz|
      |sara|Z|abcd@gmail.com|xyz|
      |sara|k|abcq@gmail.com|xyz|





