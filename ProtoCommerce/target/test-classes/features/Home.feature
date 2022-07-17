Feature: Home

  @Home
  Scenario Outline: Home scenario
    Given I am on the Home page
    When I input "<name>", "<email>", "<password>","<gender>","<birth>"
    And click submit button
    Then I validate "<response>"
    Examples:
      |name|email|password|gender|birth|response|
      |putri|putrioctavia716@gmail.com|123putri|gender|10/15/2000|success|
