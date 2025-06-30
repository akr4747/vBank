Feature: Navigate to Subscription Page

  @vHub
  Scenario: User successfully navigates to the Subscriptions page
    Given the user is logged in and lands on the vHub page
    When the user navigates to the Account Details page
    Then the user should be on the Subscriptions page