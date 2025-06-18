Feature: Navigate to  vHub Landing page and search the Asset Type vConsent
@vHub
Scenario: Verify Search Experience for Asset type App on home page

    Given User is on vHub Landing Page
    When user searched Asset Type App "vConsent" from home page 
    Then Asset Type search successfully
 
