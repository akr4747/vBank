Feature: Verify Explore Top Use Cases from Banner.
  
  @vHub
  Scenario: Verify Navigate to Top Use Cases from the banner image.
    Given the user has logged in successfully and landed on the vHub Home page
    When the user clicks on the "Explore Use Cases" button displayed on the banner image
    Then the system should display all the Top Use Cases
   

 
