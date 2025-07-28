Feature: Verify Footer Links on vHub

  Background: 
    Given the user logged in successfully and landed on the vHub Home page

@vHubFooter
  Scenario: Verify Become a Partner link in the footer
    When the user navigates to the footer and clicks on the Become a Partner link
    Then the system should navigate to the Partner Onboarding page

@vHubFooter
  Scenario: Verify Decimal Technologies link under Quick Links
    When the user navigates to the footer and clicks on the Decimal Technologies link
    Then the system should navigate to the Decimal Technologies website

@vHubFooter
  Scenario: Verify Vahana Cloud link under Quick Links
    When the user navigates to the footer and clicks on the Vahana Cloud link
    Then the system should navigate to the Vahana Cloud platform

@vHubFooter
  Scenario: Verify Contact Us link under Quick Links
    When the user navigates to the footer and clicks on the Contact Us link
    Then the system should navigate to the contact us page

@vHubFooter
  Scenario: Verify Documentation link under Help and Support
    When the user navigates to the footer and clicks on the Documentation link
    Then the system should navigate to the Vahana Academy page

@vHubFooter
  Scenario: Verify Vahana Community link under Help and Support
    When the user navigates to the footer and clicks on the Vahana Community link
    Then the system should navigate to the Vahana community page

@vHubFooter
  Scenario: Verify Vahana Hub Support link under Help and Support
    When the user navigates to the footer and clicks on the Vahana Hub Support link
    Then the system should navigate to the Email page

@vHubFooter
  Scenario: Verify LinkedIn link under Our Social Media
    When the user navigates to the footer and clicks on the LinkedIn link
    Then the system should navigate to the LinkedIn page

@vHubFooter
  Scenario: Verify YouTube link under Our Social Media
    When the user navigates to the footer and clicks on the YouTube link
    Then the system should navigate to the YouTube page