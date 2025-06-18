Feature: Create a new account from the Dashboard

@GDTSmoke1
Scenario Outline: Create a new account with valid details

Given user navigates to the Dashboard to create a new account
When  user fills all the mandatory fields with correct values
| primaryContactName |  phone   | billingAddress1 | billingAddress2 | billingCity | billingState | billingPostalCode |
| <primaryContactName> |  <phone>   | <billingAddress1> | <billingAddress2> | <billingCity> | <billingState> | <billingPostalCode> |
Then  account is created successfully


Examples:
 | primaryContactName  |  phone | billingAddress1 | billingAddress2 | billingCity | billingState | billingPostalCode |
 |  AKR |  1236547892 | Ksolves | India Ltd | Noida | UP | 2001009|




