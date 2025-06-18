Feature: Navigate to vBank Landing Page

@vBank1
  Scenario: Veirfy Successfully navigate to vBank Landing Page after login
    Given the user has successfully logged in and is on the vHub home page
    When the user navigates to the Asset Details page
    Then the user should be redirected to the vBank Landing Page

 
