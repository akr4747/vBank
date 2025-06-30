Feature: App Asset Detail Page - Tab Navigation

  @detail
  Scenario: User navigates through all tabs on the App Asset Detail page
    Given the user is logged in and on the vHub page
    When the user navigates to the App Asset Detail page
    Then the user should be able to successfully navigate through all available tabs