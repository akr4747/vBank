Feature: Create Event and Tags from the menu bar

@GDTSmoke
Scenario Outline: Create a event and tags with the valid details

Given user navigates to the menu bar to create a new event and tags
When  user fills all the mandatory fields username <eventname> and physical location <location> and event url <eventURL> with correct values
Then  user and roles is created successfully


Examples:
 | eventname  |  location | eventURL | 
 |  TestEvent |  Noida | www.google.com | 




