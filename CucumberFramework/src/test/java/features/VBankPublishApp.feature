Feature:  App has been successfully Published to Sandbox.
  
@vBank1
  Scenario: Verify all the required  field fill successfully to publish the app.
    Given User Land on vbank Landing page
    And Fill all the required field of App setting page
    When Fill all required  field of Consent configuration page
    | Consent  Configuration data details |
    Then Fill all the required field on Publish App page.
    | First Release |
    | vBank app     |
    

