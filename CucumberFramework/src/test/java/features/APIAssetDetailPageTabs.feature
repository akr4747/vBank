Feature: API Asset Detail Page - Tab Navigation

  @vHub
  Scenario: User navigates through all tabs on the API Asset Detail page
    Given the user is logged in and search the API
    When the user navigates to the API Asset Detail page
    Then the user should be able to successfully navigate through all the available tabs