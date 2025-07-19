Feature: Verify user logout functionality from vHub and vBank

  @vHub
  Scenario: User successfully logs out from vHub
    Given the user is logged in and on the vHub Home page
    When the user logs out from vHub using the header menu
    Then the user should be redirected to the vHub login page

  @vBank
  Scenario: User successfully logs out from vBank
    Given the user is logged in and search vConsent
    When the user navigates to the Asset Details page and accesses the vBank Landing Page
    And the user logs out from vBank using the header menu
    Then the user should be redirected back to the Asset Details page