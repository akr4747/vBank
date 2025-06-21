Feature: Verify navigation from Control Plane to Runtime Environment 
 

  @vBank
   Scenario: Successfully navigate to the Runtime environment after login  
    Given the user is logged in and on the vHub home page  
    When the user clicks on the Asset Details page  
    And user on vBank Landing Page
    Then the system should redirect the user to the Runtime environment

