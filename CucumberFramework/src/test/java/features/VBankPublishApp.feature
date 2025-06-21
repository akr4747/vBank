Feature:  Verify Publish app to Sandbox successfully.

  
@vBank
  Scenario: Verify Fill all required fields and publish the app to Sandbox.
    Given User Land on vbank Landing page
    And Fill all the required field of App setting page
    When Fill all required  field of Consent configuration page
    | Consent  Configuration data details |
    Then Fill all the required field on Publish App page.
    | First Release |
    | vBank app     |
    

