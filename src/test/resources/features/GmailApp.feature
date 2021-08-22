Feature: test the functionality of the inputs in the message sending window in the gmail application

  Scenario: Navigating in gmail app
    Given Navigate to main page and press send new email
    When I check that the subject and body mail entries are enabled
    Then I check that the subject and body mail entries are enabled, result of check should be true