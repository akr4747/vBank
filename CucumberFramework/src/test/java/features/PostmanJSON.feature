Feature: API Asset Detail - Postman Collection Download

@vHub
  Scenario: User should be able to download Postman JSON from the Asset Detail page
    Given the user has successfully logged into the application
    When the user searches for a specific API and navigates to its Asset Detail page
    Then the user should be able to download the Postman collection in JSON format