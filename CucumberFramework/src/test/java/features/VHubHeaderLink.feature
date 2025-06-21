Feature: Verify vHub Header Navigation Links
  As a logged-in user on the vHub Home page  
  I want to verify that header links redirect to their appropriate destinations  
  So that I can access key resources seamlessly

  Background:
    Given the user is on the vHub Home page

  @vHub
  Scenario: Verify Developer Console link opens the Vahana Account page.
    When the user clicks on the Developer Console link
    Then the user should be redirected to the Vahana Account page

  @vHub
  Scenario: Verify Documentation link opens the Vahana Academy page.
    When the user clicks on the Documentation link
    Then the user should be redirected to the Vahana Academy page

  @vHub
  Scenario: Verify Vahana Community link opens the Community page.
    When the user clicks on the Vahana Community link
    Then the user should be redirected to the Vahana Community page
