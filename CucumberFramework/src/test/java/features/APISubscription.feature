Feature: API Subscription Functionality

Background:
    Given the user has logged in successfully and searched for the API
    When the user click on api card it navigate to the API asset detail page

	@vHub
  Scenario: Verify that the user can successfully subscribe to an API by swagger
    Then the user should be able to subscribe to the API successfully by swagger
    
  @vHub
    Scenario: Verify that the user can successfully subscribe to an API by Postman
    Then the user should be able to subscribe to the API successfully by postman