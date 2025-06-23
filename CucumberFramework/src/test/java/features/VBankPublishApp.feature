Feature:  Verify Publish app to Sandbox successfully.

  
@vBank
  Scenario: Verify Fill all required fields and publish the app to Sandbox.
    Given User Land on vbank Landing page
    And Fill all the required field of App setting page
    When Fill all required  field of Consent configuration page
    |Enterprise No Code Composable No Code Platform for Digital Banking Digital Insurance Industry Workflow Customer|
    |https://www.learningcontainer.com/wp-content/uploads/2020/02/Kalimba.mp3|
    |http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4|
    | Consent  Configuration data details |
    Then Fill all the required field on Publish App page.
    | First Release |
    | vBank app     |
    

