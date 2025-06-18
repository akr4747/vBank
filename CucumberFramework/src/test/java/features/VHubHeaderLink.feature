Feature: Verify the vHub Header Links
  As a logged-in user on the vHub Home page  
  I want to verify that header links redirect to their appropriate destinations  
  So that I can access key resources seamlessly

  Background:
    Given the user is on the vHub Home page

  @vHub
  Scenario: Developer Console link redirects to Vahana Account page
    When the user clicks on the Developer Console link
    Then the user should be redirected to the Vahana Account page

  @vHub
  Scenario: Documentation link redirects to Vahana Academy page
    When the user clicks on the Documentation link
    Then the user should be redirected to the Vahana Academy page

  @vHub
  Scenario: Vahana Community link redirects to Community page
    When the user clicks on the Vahana Community link
    Then the user should be redirected to the Vahana Community page
