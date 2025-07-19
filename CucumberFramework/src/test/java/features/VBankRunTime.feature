Feature: Verify Navigation from Control Plane to Runtime Environment

  Background:
    Given the user is logged in and on the vHub home page
    When the user opens the Asset Details page for the app
    And the user is redirected to the vBank landing page

  @vBank
  Scenario: Navigate to the Runtime Sandbox environment via Access to Sandbox button
    Then the system should navigate the user to the Sandbox Runtime environment

  @vBank
  Scenario: Navigate to the Runtime Production environment via Access to Production button
    Then the system should navigate the user to the Production Runtime environment