Feature: Login and Search the account name

@GDTSmoke
Scenario Outline: Search for an account name on the landing page

Given the user successfully enters email <username> and password <password> on the landing page
When  search account name <accountName> from the dashboard
Then account name search successfully


Examples:
 | username                | password  | accountName |
 | avinash.jha@ksolves.com | dev@123   |   Moin    |




