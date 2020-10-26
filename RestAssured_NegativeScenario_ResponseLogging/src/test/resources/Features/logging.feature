Feature: Test script for negative scenario

  Scenario: Validate response for Negative Scenario
    Given API for foreign exchange
    When posted with future date information
    Then validate positive response code received
