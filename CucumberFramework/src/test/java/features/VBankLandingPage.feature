Feature: Verify navigate to vBank Landing Page successfully.

@vBank
  Scenario: Veirfy Successfully navigate to vBank Landing Page after login
    Given the user has successfully logged in and is on the vHub home page
    When the user navigates to the Asset Details page
    Then the user should be redirected to the vBank Landing Page


