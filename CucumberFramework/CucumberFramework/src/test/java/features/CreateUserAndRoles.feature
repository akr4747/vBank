Feature: Create a new user and roles from the Dashboard

@GDTSmoke
Scenario Outline: Create a new user and roles with valid details

Given user navigates to the Dashboard to create a new user and roles
When  user fills all the mandatory fields username <userName> and phone <phone> with correct values
Then  user and roles is created successfully


Examples:
 | userName  |  phone | 
 |  AKR |  1236547892 | 




